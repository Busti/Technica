package com.b2c.technica.block;

import com.b2c.technica.block.tileentity.TileBloomeryFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBloomeryFurnace extends Block {
    public BlockBloomeryFurnace() {
        super(Material.clay, MapColor.grayColor);
    }



    @Override
    protected BlockStateContainer createBlockState() {
        return super.createBlockState();
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileBloomeryFurnace();
    }

}
