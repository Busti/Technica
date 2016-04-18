package com.b2c.technica.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockTMeta extends Block {
    private final List<String> subBlocks;

    public BlockTMeta(MapColor mapColor) {
        super(Material.rock, mapColor);
        subBlocks = new ArrayList<String>();
        setRegistryName("BlockMeta");
    }

    public BlockTMeta() {
        this(MapColor.stoneColor);
    }

    public BlockTMeta addSubBlock(String name) {
        subBlocks.add(name);
        return this;
    }
}
