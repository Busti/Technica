package com.b2c.technica.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

import java.util.List;

public class BlockTMeta extends Block {
    List subBlocks;

    public BlockTMeta(MapColor mapColor) {
        super(Material.rock, mapColor);
    }

    public BlockTMeta() {
        this(MapColor.stoneColor);
    }


}
