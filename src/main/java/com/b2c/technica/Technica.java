package com.b2c.technica;

import com.b2c.technica.block.BlockOreCopper;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Technica.MODID, version = Technica.VERSION)
public class Technica {
    public static final String MODID = "technica";
    public static final String VERSION = "0.3.1";

    public static Block block_oreCopper;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        block_oreCopper = new BlockOreCopper().setUnlocalizedName(MODID + ".oreCopper");
        GameRegistry.registerBlock(block_oreCopper, MODID + ".oreCopper");
    }
}