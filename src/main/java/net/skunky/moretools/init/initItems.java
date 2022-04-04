package net.skunky.moretools.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.skunky.moretools.MoreTools;

public class initItems {

    private static final FabricItemSettings SET = new FabricItemSettings().group(MoreTools.MORE_TOOLS);

    // Ruby Items
    public static final Item RUBY = registerItem("ruby", new Item(SET));

    // Sapphire Items
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(SET));

    // Green Sapphire Items
    public static final Item GREEN_SAPPHIRE = registerItem("green_sapphire", new Item(SET));

    // Crystal Items
    public static final Item CRYSTAL = registerItem("crystal", new Item(SET));

    // Blaze Crystal Items
    public static final Item BLAZE_CRYSTAL = registerItem("blaze_crystal", new Item(SET));

    // Ender Crystal Items
    public static final Item ENDER_CRYSTAL = registerItem("ender_crystal", new Item(SET));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreTools.MOD_ID, name), item);
    }

    public static void regModItems() {
        MoreTools.LOG.info("Registering Items for " + MoreTools.MOD_ID);
    }
}
