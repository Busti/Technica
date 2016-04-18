package com.b2c.technica;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "technica";
    public static final String VERSION = "0.3.1";

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }
}