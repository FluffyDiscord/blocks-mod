package com.mossshine.blocks.entities;

import com.mossshine.blocks.init.BlocksList;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.extensions.IForgeTileEntity;

public class SwappableTextureTileEntity extends TileEntity implements IForgeTileEntity {

    BlockState texture = BlocksList.BLOCK_CAMOUFLAGE.get().getDefaultState();

    public SwappableTextureTileEntity(final TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }
    public SwappableTextureTileEntity() {
        this(BlocksList.TE__SWAPPABLE_TEXTURE.get());
    }

    public void setTexture(BlockState texture)
    {
        this.texture = texture;
    }

    public BlockState getTexture()
    {
        return this.texture;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        CompoundNBT texture = nbt.getCompound("texture");
        this.texture = NBTUtil.readBlockState(texture);
    }

    @Override
    public CompoundNBT serializeNBT() {
        CompoundNBT ret = new CompoundNBT();
        ret.put("texture", NBTUtil.writeBlockState(this.texture));
        getTileEntity().write(ret);
        return ret;
    }
}
