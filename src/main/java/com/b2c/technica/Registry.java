package com.b2c.technica;

import com.b2c.technica.block.BlockTMeta;
import net.minecraft.block.Block;

public class Registry {
    public static Block blockOre;

    public static void init() {
        blockOre = new BlockTMeta();
    }
}
