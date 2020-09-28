package com.mossshine.blocks.init;

import com.mossshine.blocks.BlocksMod;
import com.mossshine.blocks.entities.SwappableTextureTileEntity;
import com.mossshine.blocks.lists.SwapLists;
import com.mossshine.blocks.network.packets.UpdateCamouflageBlock;
import com.mossshine.blocks.network.packets.UpdatePlayerInventorySlot;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class Events {
    private static final double SCROLL_DOWN = -1.0;
    private static final double SCROLL_UP = 1.0;

    @SubscribeEvent
    public static void rightClickEvent(PlayerInteractEvent.RightClickBlock event) {
        ClientPlayerEntity player = Minecraft.getInstance().player;

        if (player == null) {
            return;
        }

        ItemStack heldItemMainHand = player.getHeldItemMainhand();
        if (heldItemMainHand.isEmpty()) {
            return;
        }

        BlockPos currentBlockPos = new BlockPos(
            event.getPos().getX(),
            event.getPos().getY(),
            event.getPos().getZ()
        );

        BlockState blockState = player.world.getBlockState(currentBlockPos);

        if(blockState.getBlock() != BlocksList.BLOCK_CAMOUFLAGE.get()) {
            return;
        }

        Block swapBlock = Block.getBlockFromItem(heldItemMainHand.getItem());
        if(swapBlock == Blocks.AIR) {
            return;
        }

        event.setCanceled(true);
        BlocksMod.packetManager.sendToServer(new UpdateCamouflageBlock(event.getPos()));
    }

    @SubscribeEvent
    public static void holdingBlockHotBarSwap(InputEvent.MouseScrollEvent event) {
        ClientPlayerEntity player = Minecraft.getInstance().player;

        if (player == null) {
            return;
        }

        ItemStack currentItem = player.getHeldItemMainhand();
        if (currentItem.isEmpty()) {
            return;
        }

        if (
            !Minecraft.getInstance().gameSettings.keyBindSneak.isKeyDown()
            ||
            (
                event.getScrollDelta() != SCROLL_DOWN
                &&
                event.getScrollDelta() != SCROLL_UP
            )
        ) {
            return;
        }

        for (int i = 0; i < SwapLists.get().size(); i++) {
            ArrayList<Item> list = SwapLists.get().get(i);

            int index = list.indexOf(currentItem.getItem());
            if (index == -1) {
                continue;
            }

            event.setCanceled(true);
            index = event.getScrollDelta() == SCROLL_DOWN
                    ? (index - 1)
                    : (index + 1)
            ;

            Item prevItem;
            if (index > (list.size() - 1)) {
                prevItem = list.get(0);
            } else if(index > -1) {
                prevItem = list.get(index);
            } else {
                prevItem = list.get(list.size() - 1);
            }

            ItemStack newItem = new ItemStack(prevItem, currentItem.getCount());

            BlocksMod.packetManager.sendToServer(new UpdatePlayerInventorySlot(newItem, player.inventory.currentItem));
            break;
        }
    }
}
