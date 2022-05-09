package net.skunky.moretools.init;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.skunky.moretools.MoreTools;

import java.util.HashMap;

public class initFuels {
    public static HashMap<Item, Integer> fuelList = new HashMap<>();

    public static void init() {
        MoreTools.LOG.info("Registering Fuels for the Soul Furnace " + MoreTools.MOD_ID);
        // Vanilla Items
        put(Items.DIRT, 1);
        put(Items.GRASS_BLOCK, 1);
        put(Items.BLAZE_POWDER, 1);
        put(Items.BLAZE_ROD, 5);
        put(Items.ENDER_PEARL, 5);
        put(Items.ENDER_EYE, 10);
        put(Items.SOUL_SAND, 50);
        put(Items.DRAGON_EGG, 500);
        put(Items.DRAGON_HEAD, 750);

        // Mod Items
        put(initItems.ENDER_CRYSTAL, 20);
        put(initItems.BLAZE_CRYSTAL, 5);
    }

    private static void put(Item item, Integer fuelTime) {
        fuelList.put(item, fuelTime);
    }

}
