package com.b2c.technica;

import com.b2c.technica.block.BlockBloomeryFurnace;
import com.b2c.technica.block.BlockTMeta;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.annotation.Nullable;
import java.util.function.Function;

public class Registry {
    //Blocks
    public static Block blockOre;
    public static Block blockBloomeryFurnce;

    public static void init() {
        blockOre = new BlockTMeta().setRegistryName("ore1").setUnlocalizedName("technica:Ore1");
        blockBloomeryFurnce = new BlockBloomeryFurnace().setRegistryName("BloomeryFurnace");

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
        return registerBlock(block, ItemBlock::new);
    }

    private static <BLOCK extends Block> BLOCK registerBlock(BLOCK block, @Nullable Function<BLOCK, ItemBlock> itemFactory) {
        GameRegistry.register(block);
        if (itemFactory != null) {
            final ItemBlock itemBlock = itemFactory.apply(block);
            GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
        }

        return block;
    }
}
