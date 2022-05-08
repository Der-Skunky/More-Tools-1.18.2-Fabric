package net.skunky.moretools.init;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.skunky.moretools.MoreTools;
import net.skunky.moretools.custom.recipe.SoulFurnaceRecipe;

public class initRecipes {

    /*
    This Class is used to Register your Custom Recipe Types and the coresponding Recipes
     */

    public static void init() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MoreTools.MOD_ID, SoulFurnaceRecipe.Serializer.ID), SoulFurnaceRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(MoreTools.MOD_ID, SoulFurnaceRecipe.Type.ID), SoulFurnaceRecipe.Type.INSTANCE);
    }
}
