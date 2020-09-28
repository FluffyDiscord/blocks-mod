package com.mossshine.blocks.network.packets;

import java.util.function.Supplier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent.Context;

public class UpdatePlayerInventorySlot {

    private final ItemStack itemStack;
    private final int slotId;

    public UpdatePlayerInventorySlot(ItemStack containerStack, int slotId) {
        this.itemStack = containerStack;
        this.slotId = slotId;
    }

    public static void handle(UpdatePlayerInventorySlot message, Supplier<Context> context) {
        PlayerEntity player = context.get().getSender();
        if (player == null) {
            return;
        }
        context.get().enqueueWork(() -> {
            player.inventory.setInventorySlotContents(message.slotId, message.itemStack);
            player.inventory.markDirty();
        });
        context.get().setPacketHandled(true);
    }

    public static void encode(UpdatePlayerInventorySlot pkt, PacketBuffer buf) {
        buf.writeItemStack(pkt.itemStack);
        buf.writeVarInt(pkt.slotId);
    }

    public static UpdatePlayerInventorySlot decode(PacketBuffer buf) {
        return new UpdatePlayerInventorySlot(buf.readItemStack(), buf.readVarInt());
    }
}