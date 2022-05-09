package net.skunky.moretools.init;

import net.minecraft.item.Item;
import net.skunky.moretools.MoreTools;

import java.util.HashMap;

public class initCraftingCosts {
    public static HashMap<Item, Integer> costsList = new HashMap<>();

    public static void init() {
        MoreTools.LOG.info("Registering Soul Furnace Costs");

        put(initItems.ENDER_SWORD, 1000);
        put(initItems.ENDER_AXE, 750);
        put(initItems.ENDER_PICKAXE, 750);
        put(initItems.ENDER_SHOVEL, 650);
        put(initItems.Ender_HOE, 500);
        put(initItems.ENDER_CRYSTAL, 250);

    }

    private static void put(Item item, Integer costs) {
        costsList.put(item, costs);
    }
}
