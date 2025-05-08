package com.aerogames.regiments1core.block.entity;

import com.aerogames.regiments1core.RegimentS1Core;
import com.aerogames.regiments1core.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<OvenBlockEntity> OVEN_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(RegimentS1Core.MOD_ID, "oven_be"),
                    FabricBlockEntityTypeBuilder.create(OvenBlockEntity::new,
                            ModBlocks.OVENBLOCK).build());
    public static void registerBlockEntities() {
        RegimentS1Core.LOGGER.info("Registering block entities" + RegimentS1Core.MOD_ID);
    }

}
