package com.aerogames.regiments1core.block;

import com.aerogames.regiments1core.RegimentS1Core;
/*
import com.aerogames.regiments1core.block.custom.ogbush_crop;
*/
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //to add a new block copy and paste and change out TESTBLOCK for whatever the new block name will be, *IMPORTANT* 1st name is FULL UPPERCASE while the second is full lowercase
    /*
     public static final Block TESTBLOCK = registerBlock("testblock",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));  //In the new block Fabricblocksettings add the propersties aither .copy(Block.'whatever minecraft block you want to copy property wise' or .create().'whatever properties')
    */

    public static final Block TESTBLOCK = registerBlock("testblock",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block TESTBENCH = registerBlock("testbench",
            new Block(FabricBlockSettings.create().hardness(1.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block GROWTENT = registerBlock("growtent",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block STORAGESHELF = registerBlock("storageshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block WOODENTABLE = registerBlock("woodentable",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block METALTABLE = registerBlock("metaltable",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque().sounds(BlockSoundGroup.METAL)));


    /*
    public static final Block OGBUSH_CROP = Registry.register(Registries.BLOCK, new Identifier(RegimentS1Core.MOD_ID, "ogbush_crop"),
            new ogbush_crop(FabricBlockSettings.copyOf(Blocks.WHEAT)));
         Add This Later - Aero
     */

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
