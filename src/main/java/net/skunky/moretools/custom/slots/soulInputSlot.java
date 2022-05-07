package net.skunky.moretools.custom.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.skunky.moretools.custom.fuels.initFuels;

public class soulInputSlot extends Slot {

    public soulInputSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return initFuels.fuelList.containsKey(stack.getItem());
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return soulInputSlot.isBucket(stack) ? 1 : super.getMaxItemCount(stack);
    }

    public static boolean isBucket(ItemStack stack) {
        return stack.isOf(Items.BUCKET);
    }
}