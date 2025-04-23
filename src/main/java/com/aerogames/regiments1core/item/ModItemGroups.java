package com.aerogames.regiments1core.item;

import com.aerogames.regiments1core.RegimentS1Core;
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
                        entries.add(new ItemStack(ModItems.OGBUSH));
}).build());
    public static final ItemGroup METH = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RegimentS1Core.MOD_ID, "meth"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.meth"))
                    .icon(() -> new ItemStack(ModItems.METH)).entries((displayContext, entries) ->{
                        entries.add(new ItemStack(ModItems.METH));
                    }).build());
    public static final ItemGroup REGIMENTS1CORE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RegimentS1Core.MOD_ID, "regiments1core"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.regiments1core"))
                    .icon(() -> new ItemStack(ModItems.PHONE)).entries((displayContext, entries) ->{
                        entries.add(new ItemStack(ModItems.PHONE));
                    }).build());
    public static void registerItemGroups() {
        RegimentS1Core.LOGGER.info("Registering Mod Item Groups" + RegimentS1Core.MOD_ID);
    }
}
