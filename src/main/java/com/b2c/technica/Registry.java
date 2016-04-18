package com.b2c.technica;

import com.b2c.technica.block.BlockBloomeryFurnace;
import com.b2c.technica.block.BlockTMeta;
import net.minecraft.block.Block;

public class Registry {
    //Blocks
    public static Block blockOre;
    public static Block blockBloomeryFurnce;


    public static void init() {
        blockOre = new BlockTMeta();
        blockBloomeryFurnce = new BlockBloomeryFurnace();

        //GameRegistry.register(blockOre);
        //GameRegistry.register(blockBloomeryFurnce);
    }
}
