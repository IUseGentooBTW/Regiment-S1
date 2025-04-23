package com.aerogames.regiments1core;

import com.aerogames.regiments1core.block.ModBlocks;
import com.aerogames.regiments1core.item.ModItemGroups;
import com.aerogames.regiments1core.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegimentS1Core implements ModInitializer {
	public static final String MOD_ID = "regiments1core";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}