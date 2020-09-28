package com.mossshine.blocks.blocks;

import com.mossshine.blocks.init.BlocksList;
import com.mossshine.blocks.init.Registration;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.*;

/**
 * Created by TheGreyGhost on 19/04/2015.
 *
 * This block takes on the appearance of block next to it, but can be walked through.
 * The default texture for the block is a camouflage pattern.
 */
public class BlockCamouflage extends Block {

  public BlockCamouflage()
  {
    super(Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement()  // look at Block.Properties for further options
            //notOpaque().notSolid()
    );
  }


  // render using an IBakedModel
  // not strictly required because the default (super method) is MODEL.
  @Nonnull
  @Override
  public BlockRenderType getRenderType(BlockState iBlockState) {
    return BlockRenderType.MODEL;
  }

  @Override
  public boolean hasTileEntity(BlockState state) {
    return true;
  }

  @Override
  public TileEntity createTileEntity(BlockState state, IBlockReader world) {
    return BlocksList.TE__SWAPPABLE_TEXTURE.get().create();
  }
}
