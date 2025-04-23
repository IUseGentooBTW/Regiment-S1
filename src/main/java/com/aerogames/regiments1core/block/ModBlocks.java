package com.aerogames.regiments1core.block;

import com.aerogames.regiments1core.RegimentS1Core;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.Direction;

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
            new Block(FabricBlockSettings.create().hardness(1.0f).sounds(BlockSoundGroup.METAL)));

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
