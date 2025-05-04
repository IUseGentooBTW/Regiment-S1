package com.aerogames.regiments1core.datagen;

import com.aerogames.regiments1core.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SidedStorageBlockEntity;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;


public class ModRecipieProvider extends FabricRecipeProvider {
    
    public ModRecipieProvider(FabricDataOutput output) {

        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OGBUSH, 1)
                .input(ModItems.OGJOINT)
                .criterion(hasItem(ModItems.OGBUSH), conditionsFromItem(ModItems.OGBUSH))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OGBUSH)));
    }
}
