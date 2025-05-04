package com.aerogames.regiments1core.item;

import com.aerogames.regiments1core.RegimentS1Core;
import com.aerogames.regiments1core.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;

import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BUDS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RegimentS1Core.MOD_ID, "buds"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.buds"))
                    .icon(() -> new ItemStack(ModItems.OGBUSH)).entries((displayContext, entries) ->{
                        entries.add(ModItems.OGBUSH);
                        entries.add(ModItems.ENDERMANPURPLE);
                        entries.add(ModItems.GREENRAVINE);
                        entries.add(ModItems.SOURFUEL);
                        entries.add(ModItems.SHEEPVANILLA);
                    }).build());
                        public static final ItemGroup JOINTS = Registry.register(Registries.ITEM_GROUP,
                                new Identifier(RegimentS1Core.MOD_ID, "joints"),
                                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.joints"))
                                        .icon(() -> new ItemStack(ModItems.OGJOINT)).entries((displayContext, entries) ->{
                                            entries.add(ModItems.OGJOINT);
                                            entries.add(ModItems.GREENRAVINEJOINT);
                                            entries.add(ModItems.ENDERMANJOINT);
                                            entries.add(ModItems.SHEEPVANILLAJOINT);
                                            entries.add(ModItems.SOURJOINT);
                    }).build());
    public static final ItemGroup SOILS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RegimentS1Core.MOD_ID, "soils"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.soils"))
                    .icon(() -> new ItemStack(ModItems.KENNYSOIL)).entries((displayContext, entries) ->{
                        entries.add(ModItems.KENNYSOIL);

                    }).build());
    /*
    public static final ItemGroup SEEDS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RegimentS1Core.MOD_ID, "seeds"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.seeds"))
                    .icon(() -> new ItemStack(ModItems.OGBUSH_SEED)).entries((displayContext, entries) ->{
                            entries.add(ModItems.OGBUSH_SEED);
                    }).build());

     */

    public static final ItemGroup CANDY = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RegimentS1Core.MOD_ID, "candy"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.candy"))
                    .icon(() -> new ItemStack(ModItems.BLUECANDY)).entries((displayContext, entries) ->{
                        entries.add(ModItems.BLUECANDY);
                    }).build());
    public static final ItemGroup REGIMENTS1CORE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RegimentS1Core.MOD_ID, "regiments1core"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.regiments1core"))
                    .icon(() -> new ItemStack(ModItems.PHONE)).entries((displayContext, entries) ->{
                        entries.add(ModItems.PHONE);
                        entries.add(ModItems.ROLLINGPAPER);
                        entries.add(ModBlocks.TESTBLOCK);
                        entries.add(ModBlocks.TESTBENCH);

                    }).build());
    public static final ItemGroup FURNITURE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RegimentS1Core.MOD_ID, "furniture"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.furniture"))
                    .icon(() -> new ItemStack(ModBlocks.WOODENTABLE)).entries((displayContext, entries) ->{
                        entries.add(ModBlocks.WOODENTABLE);
                        entries.add(ModBlocks.METALTABLE);
                        entries.add(ModBlocks.STORAGESHELF);
                        entries.add(ModBlocks.GROWTENT);

                    }).build());

    public static void registerItemGroups() {
        RegimentS1Core.LOGGER.info("Registering Mod Item Groups" + RegimentS1Core.MOD_ID);
    }
}
