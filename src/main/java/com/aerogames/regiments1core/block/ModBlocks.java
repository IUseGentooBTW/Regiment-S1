package com.aerogames.regiments1core.block;

import com.aerogames.regiments1core.RegimentS1Core;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TESTBLOCK = registerBlock("testblock",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RegimentS1Core.MOD_ID, name), block);
    }

    private static Item registerBlockItems(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RegimentS1Core.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {

        RegimentS1Core.LOGGER.info("Registering Mod Blocks" + RegimentS1Core.MOD_ID);
    }

}
