package com.aerogames.regiments1core.datagen;

import com.aerogames.regiments1core.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {


    public ModLootTableProvider(FabricDataOutput dataOutput) {

        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.WOODENTABLE);
        addDrop(ModBlocks.STORAGESHELF);

    }
}
