package net.skunky.moretools.init.material;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import net.skunky.moretools.init.initItems;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    //GOLD          (MiningLevels.WOOD,         32,     12.0f,  0.0f,   22,     () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    //WOOD          (MiningLevels.WOOD,         59,     2.0f,   0.0f,   15,     () -> Ingredient.fromTag(ItemTags.PLANKS)),
    //STONE         (MiningLevels.STONE,        131,    4.0f,   1.0f,   5,      () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    //IRON          (MiningLevels.IRON,         250,    6.0f,   2.0f,   14,     () -> Ingredient.ofItems(Items.IRON_INGOT)),
    //DIAMOND       (MiningLevels.DIAMOND,      1561,   8.0f,   3.0f,   10,     () -> Ingredient.ofItems(Items.DIAMOND)),
    //NETHERITE     (MiningLevels.NETHERITE,    2031,   9.0f,   4.0f,   15,     () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    RUBY            (MiningLevels.DIAMOND, 900, 7.0f, 2.5f, 10, () -> Ingredient.ofItems(initItems.RUBY)),
    SAPPHIRE        (MiningLevels.DIAMOND, 900, 7.0f, 2.5f, 10, () -> Ingredient.ofItems(initItems.SAPPHIRE)),
    GREEN_SAPPHIRE  (MiningLevels.DIAMOND, 900, 7.0f, 2.5f, 10, () -> Ingredient.ofItems(initItems.GREEN_SAPPHIRE)),
    CRYSTAL         (MiningLevels.DIAMOND, 500, 6.0f, 2.0f, 14, () -> Ingredient.ofItems(initItems.CRYSTAL)),
    BLAZE           (MiningLevels.DIAMOND, 650, 6.5f, 2.0f, 14, () -> Ingredient.ofItems(initItems.BLAZE_CRYSTAL)),
    HOLY           (MiningLevels.DIAMOND, 650, 8.0f, 2.0f, 14, () -> Ingredient.ofItems(initItems.BLAZE_CRYSTAL)),
    ENDER           (MiningLevels.DIAMOND, 1200, 10.0f, 2.0f, 14, () -> Ingredient.ofItems(initItems.ENDER_CRYSTAL));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
