package net.skunky.moretools.init.material;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ModPickaxe extends PickaxeItem {
    public ModPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
