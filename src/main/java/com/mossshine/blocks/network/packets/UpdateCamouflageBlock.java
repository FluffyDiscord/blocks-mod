package com.mossshine.blocks.network.packets;

import com.mossshine.blocks.BlocksMod;
import com.mossshine.blocks.blocks.BlockCamouflage;
import com.mossshine.blocks.entities.SwappableTextureTileEntity;
import com.mossshine.blocks.init.BlocksList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.fml.network.NetworkEvent.Context;

import java.util.Optional;
import java.util.function.Supplier;

public class UpdateCamouflageBlock {
    private final BlockPos blockPos;

    public UpdateCamouflageBlock(BlockPos blockPos) {
        this.blockPos = blockPos;
    }

    public static void handle(UpdateCamouflageBlock message, Supplier<Context> context) {
        PlayerEntity player = context.get().getSender();
        if (player == null) {
            return;
        }
        context.get().enqueueWork(() -> {
            ItemStack heldItemMainHand = player.getHeldItemMainhand();
            if (heldItemMainHand.isEmpty()) {
                return;
            }

            BlockPos currentBlockPos = new BlockPos(
                message.blockPos.getX(),
                message.blockPos.getY(),
                message.blockPos.getZ()
            );

            BlockState blockState = player.world.getBlockState(currentBlockPos);

            if(blockState.getBlock() != BlocksList.BLOCK_CAMOUFLAGE.get()) {
                return;
            }

            Block swapBlock = Block.getBlockFromItem(heldItemMainHand.getItem());
            if(swapBlock == Blocks.AIR) {
                return;
            }

            SwappableTextureTileEntity tileEntity = (SwappableTextureTileEntity) player.world.getTileEntity(message.blockPos);
            tileEntity.setTexture(swapBlock.getDefaultState());
            tileEntity.markDirty();
        });
        context.get().setPacketHandled(true);
    }

    public static void encode(UpdateCamouflageBlock pkt, PacketBuffer buf) {
        buf.writeBlockPos(pkt.blockPos);
    }

    public static UpdateCamouflageBlock decode(PacketBuffer buf) {
        return new UpdateCamouflageBlock(buf.readBlockPos());
    }
}