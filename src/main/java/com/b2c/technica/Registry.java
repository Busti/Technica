package com.b2c.technica;

import com.b2c.technica.block.BlockBloomeryFurnace;
import com.b2c.technica.block.BlockTMeta;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.annotation.Nullable;
import java.util.function.Function;

public class Registry {
    //Blocks
    public static Block blockOre;
    public static Block blockBloomeryFurnce;

    public static void init() {
        blockOre = new BlockTMeta().setRegistryName("ore1").setUnlocalizedName("technica:ore1").setCreativeTab(Technica.tabTechnicaMain);
        blockBloomeryFurnce = new BlockBloomeryFurnace().setRegistryName("bloomeryFurnace").setUnlocalizedName("bloomeryFurnace").setCreativeTab(Technica.tabTechnicaMain);

        registerBlock(blockOre);
        registerBlock(blockBloomeryFurnce);
    }

    /**
     * Registers a block and the blockItem belonging to it.
     * @param block The block.
     * @param <BLOCK> The class of the block.
     * @return The block object to allow for chaining.
     */
    private static <BLOCK extends Block> BLOCK registerBlock(BLOCK block) {
        return registerBlock(block, ItemBlock::new, null);
    }

    private static <BLOCK extends Block> BLOCK registerBlock(BLOCK block, @Nullable Function<BLOCK, ItemBlock> itemFactory, @Nullable String defaultVariant) {
        GameRegistry.register(block);
        if (itemFactory != null) {
            final ItemBlock itemBlock = itemFactory.apply(block);
            GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
            ModelLoader.setCustomModelResourceLocation(itemBlock, 0, new ModelResourceLocation(itemBlock.getRegistryName(), defaultVariant));
        }

        return block;
    }
}
