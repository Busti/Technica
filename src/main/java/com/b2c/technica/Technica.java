package com.b2c.technica;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Technica.MODID, version = Technica.VERSION)
public class Technica {
    public static final String MODID = "technica";
    public static final String VERSION = "0.3.1";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Registry.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        //Registry.init();
    }
}