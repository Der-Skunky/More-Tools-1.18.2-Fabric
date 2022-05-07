package net.skunky.moretools.custom.fuels;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.skunky.moretools.MoreTools;
import net.skunky.moretools.init.initItems;

import java.util.HashMap;

public class initFuels {
    public static HashMap<Item, Integer> fuelList = new HashMap<>();

    public static void init() {
        MoreTools.LOG.info("Registering Fuels for the Soul Furnace " + MoreTools.MOD_ID);
        // Vanilla Items
        put(Items.DIRT, 5);
        put(Items.GRASS_BLOCK, 5);
        put(Items.ENDER_PEARL, 10);
        put(Items.ENDER_EYE, 20);
        put(Items.SOUL_SAND, 100);
        put(Items.DRAGON_EGG, 1000);
        put(Items.DRAGON_HEAD, 1500);

        // Mod Items
        put(initItems.ENDER_CRYSTAL, 40);
        put(initItems.BLAZE_CRYSTAL, 10);
    }

    private static void put(Item item, Integer fuelTime) {
        fuelList.put(item, fuelTime);
    }

}
