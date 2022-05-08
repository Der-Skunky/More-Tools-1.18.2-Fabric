package net.skunky.moretools.custom.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.skunky.moretools.custom.slots.outputSlot;
import net.skunky.moretools.custom.slots.soulInputSlot;
import net.skunky.moretools.init.initScreenHandler;

public class SoulFurnaceScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;

    public SoulFurnaceScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(4), new ArrayPropertyDelegate(6));
    }

    public SoulFurnaceScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(initScreenHandler.SOUL_FURNACE_SCREEN_HANDLER, syncId);
        checkSize(inventory, 4);
        this.inventory = inventory;
        this.propertyDelegate = propertyDelegate;
        inventory.onOpen(playerInventory.player);

        this.addSlot(new soulInputSlot(inventory, 0, 17, 47));
        this.addSlot(new Slot(inventory, 1, 103, 20));
        this.addSlot(new Slot(inventory, 2, 103, 53));
        this.addSlot(new outputSlot(inventory, 3, 147, 36));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);

        addProperties(propertyDelegate);
    }

    public boolean isCrafting() {
        return propertyDelegate.get(0) > 0;
    }

    public boolean hasFuel() {
        return propertyDelegate.get(2) > 0;
    }

    public boolean hasSouls() {
        return propertyDelegate.get(4) > 0;
    }

    public int getSouls() {
        return this.propertyDelegate.get(4);
    }

    public int getMaxSouls() {
        return this.propertyDelegate.get(5);
    }

    public Integer getScaledProgress(int progressArrowWidth) {
        int progress = this.propertyDelegate.get(0);
        int maxProgress = this.propertyDelegate.get(1);

        return maxProgress != 0 && progress != 0 ? (int)(((float) progress / (float) maxProgress) * progressArrowWidth) : 0;
    }

    public Integer getScaledFuelProgress(int fuelProgressHeight) {
        int fuelTime = this.propertyDelegate.get(2);
        int maxFuelTime = this.propertyDelegate.get(3);

        return maxFuelTime != 0 ? (int)(((float) fuelTime / (float) maxFuelTime) * fuelProgressHeight) : 0;
    }

    public Integer getScaledSoulProgress(int soulTankHeight) {
        int souls = this.propertyDelegate.get(4);
        int maxSouls = this.propertyDelegate.get(5);

        return maxSouls != 0 ? (int)(((float) souls / (float) maxSouls) * soulTankHeight) : 0;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for(int i = 0; i<3; i++) {
            for (int l = 0; l<9; l++) {
                this.addSlot(new Slot(playerInventory, l+i*9+9, 8+l*18, 86+i*18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i<9; i++) {
            this.addSlot(new Slot(playerInventory, i, 8+i*18, 144));
        }
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }
}
