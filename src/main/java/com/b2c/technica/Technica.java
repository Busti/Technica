package com.b2c.technica;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Technica.MODID, version = Technica.VERSION)
public class Technica {
    public static final String MODID = "technica";
    public static final String VERSION = "0.3.1";

    public static CreativeTabs tabTechnicaMain;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabTechnicaMain = new TabTechnica("technica.main");
        Registry.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        //Registry.init();
    }

    class TabTechnica extends CreativeTabs {
        public TabTechnica(String label) {
            super(label);
        }

        @Override
        public Item getTabIconItem() {
            return Items.egg;
        }
    }

}