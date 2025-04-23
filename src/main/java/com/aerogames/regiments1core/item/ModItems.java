package com.aerogames.regiments1core.item;

import com.aerogames.regiments1core.RegimentS1Core;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OGBUSH = registerItem("ogbush", new Item(new FabricItemSettings()));
    public static final Item METH = registerItem("meth", new Item(new FabricItemSettings()));
    public static final Item PHONE = registerItem("phone", new Item(new FabricItemSettings()));
    public static final Item ENDERMANPURPLE = registerItem("endermanpurple", new Item(new FabricItemSettings()));
    public static final Item GREENRAVINE = registerItem("greenravine", new Item(new FabricItemSettings()));
    public static final Item SOURFUEL = registerItem("sourfuel", new Item(new FabricItemSettings()));

    private static void addItemsToIngrediantItemGroup(FabricItemGroupEntries entries) {


    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RegimentS1Core.MOD_ID, name), item);
    }

    public static void registerModItems(){
    RegimentS1Core.LOGGER.info("Registering Mod Items for " + RegimentS1Core.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngrediantItemGroup);
    }
}
