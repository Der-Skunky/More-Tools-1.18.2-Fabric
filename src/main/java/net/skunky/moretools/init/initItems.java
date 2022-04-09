package net.skunky.moretools.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.skunky.moretools.MoreTools;
import net.skunky.moretools.init.material.*;
import org.lwjgl.system.CallbackI;

public class initItems {

    private static final FabricItemSettings SET = new FabricItemSettings().group(MoreTools.MORE_TOOLS);
    static final Item.Settings tool = new Item.Settings().group(MoreTools.MORE_TOOLS);

    // Normal Items
    public static final Item RUBY = registerItem("ruby", new Item(SET));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(SET));
    public static final Item GREEN_SAPPHIRE = registerItem("green_sapphire", new Item(SET));
    public static final Item CRYSTAL = registerItem("crystal", new Item(SET));
    public static final Item BLAZE_CRYSTAL = registerItem("blaze_crystal", new Item(SET));
    public static final Item ENDER_CRYSTAL = registerItem("ender_crystal", new Item(SET));

    // Tools
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, 1.5f, -3.0f, tool));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new ModPickaxe(ModToolMaterial.RUBY, 5, -2.8f, tool));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new ModAxe(ModToolMaterial.RUBY, 5.0f, -3.0f, tool));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new ModHoe(ModToolMaterial.RUBY, -3, 0.0f, tool));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, 3, -2.4f, tool));

    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", new ShovelItem(ModToolMaterial.SAPPHIRE, 1.5f, -3.0f, tool));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", new ModPickaxe(ModToolMaterial.SAPPHIRE, 5, -2.8f, tool));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe", new ModAxe(ModToolMaterial.SAPPHIRE, 5.0f, -3.0f, tool));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe", new ModHoe(ModToolMaterial.SAPPHIRE, -3, 0.0f, tool));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SwordItem(ModToolMaterial.SAPPHIRE, 3, -2.4f, tool));

    public static final Item GREEN_SAPPHIRE_SHOVEL = registerItem("green_sapphire_shovel", new ShovelItem(ModToolMaterial.GREEN_SAPPHIRE, 1.5f, -3.0f, tool));
    public static final Item GREEN_SAPPHIRE_PICKAXE = registerItem("green_sapphire_pickaxe", new ModPickaxe(ModToolMaterial.GREEN_SAPPHIRE, 5, -2.8f, tool));
    public static final Item GREEN_SAPPHIRE_AXE = registerItem("green_sapphire_axe", new ModAxe(ModToolMaterial.GREEN_SAPPHIRE, 5.0f, -3.0f, tool));
    public static final Item GREEN_SAPPHIRE_HOE = registerItem("green_sapphire_hoe", new ModHoe(ModToolMaterial.GREEN_SAPPHIRE, -3, 0.0f, tool));
    public static final Item GREEN_SAPPHIRE_SWORD = registerItem("green_sapphire_sword", new SwordItem(ModToolMaterial.GREEN_SAPPHIRE, 3, -2.4f, tool));

    // Crystal Items

    public static final Item BLAZE_SHOVEL = registerItem("blaze_shovel", new ShovelItem(ModToolMaterial.BLAZE, 1.5f, -3.0f, tool));
    public static final Item BLAZE_PICKAXE = registerItem("blaze_pickaxe", new ModPickaxe(ModToolMaterial.BLAZE, 5, -2.8f, tool));
    public static final Item BLAZE_AXE = registerItem("blaze_axe", new ModAxe(ModToolMaterial.BLAZE, 5.0f, -3.0f, tool));
    public static final Item BLAZE_HOE = registerItem("blaze_hoe", new ModHoe(ModToolMaterial.BLAZE, -3, 0.0f, tool));
    public static final Item BLAZE_SWORD = registerItem("blaze_sword", new blazeSword(ModToolMaterial.BLAZE, 3, -2.4f, tool));

    public static final Item ENDER_SHOVEL = registerItem("ender_shovel", new ShovelItem(ModToolMaterial.ENDER, 1.5f, -3.0f, tool));
    public static final Item ENDER_PICKAXE = registerItem("ender_pickaxe", new ModPickaxe(ModToolMaterial.ENDER, 5, -2.8f, tool));
    public static final Item ENDER_AXE = registerItem("ender_axe", new ModAxe(ModToolMaterial.ENDER, 5.0f, -3.0f, tool));
    public static final Item Ender_HOE = registerItem("ender_hoe", new ModHoe(ModToolMaterial.ENDER, -3, -2.4f, tool));
    public static final Item ENDER_SWORD = registerItem("ender_sword", new SwordItem(ModToolMaterial.ENDER, 3, -2.4f, tool));

    public static final Item HOLY_SHOVEL = registerItem("holy_shovel", new ShovelItem(ModToolMaterial.HOLY, 1.5f, -3.0f, tool));
    public static final Item HOLY_PICKAXE = registerItem("holy_pickaxe", new ModPickaxe(ModToolMaterial.HOLY, 5, -2.8f, tool));
    public static final Item HOLY_AXE = registerItem("holy_axe", new ModAxe(ModToolMaterial.HOLY, 5.0f, -3.0f, tool));
    public static final Item HOLY_HOE = registerItem("holy_hoe", new ModHoe(ModToolMaterial.HOLY, -3, 0.0f, tool));
    public static final Item HOLY_SWORD = registerItem("holy_sword", new SwordItem(ModToolMaterial.HOLY, 3, -2.4f, tool));

    // Plant Items


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreTools.MOD_ID, name), item);
    }

    public static void init() {
        MoreTools.LOG.info("Registering Items for " + MoreTools.MOD_ID);
    }
}
