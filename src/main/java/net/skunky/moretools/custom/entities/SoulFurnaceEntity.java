package net.skunky.moretools.custom.entities;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skunky.moretools.custom.fuels.initFuels;
import net.skunky.moretools.custom.inventory.ImplementedInventory;
import net.skunky.moretools.custom.recipe.SoulFurnaceRecipe;
import net.skunky.moretools.custom.screen.SoulFurnaceScreenHandler;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class SoulFurnaceEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 200;
    private int fuelTime = 0;
    private int maxFuelTime = 0;
    private int souls = 0;
    private int maxSouls = 5000;

    public SoulFurnaceEntity(BlockPos pos, BlockState state) {
        super(initBlockEntities.SOUL_FURNACE, pos, state);

        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> SoulFurnaceEntity.this.progress;
                    case 1 -> SoulFurnaceEntity.this.maxProgress;
                    case 2 -> SoulFurnaceEntity.this.fuelTime;
                    case 3 -> SoulFurnaceEntity.this.maxFuelTime;
                    case 4 -> SoulFurnaceEntity.this.souls;
                    case 5 -> SoulFurnaceEntity.this.maxSouls;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> SoulFurnaceEntity.this.progress = value;
                    case 1 -> SoulFurnaceEntity.this.maxProgress = value;
                    case 2 -> SoulFurnaceEntity.this.fuelTime = value;
                    case 3 -> SoulFurnaceEntity.this.maxFuelTime = value;
                    case 4 -> SoulFurnaceEntity.this.souls = value;
                    case 5 -> SoulFurnaceEntity.this.maxSouls = value;
                }
            }

            @Override
            public int size() {
                return 6;
            }
        };
    }

    @Override
    public Text getDisplayName() {
        return new LiteralText("Soul Furnace");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new SoulFurnaceScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("soul_furnace.progress", progress);
        nbt.putInt("soul_furnace.maxProgress", maxProgress);
        nbt.putInt("soul_furnace.fuelTime", fuelTime);
        nbt.putInt("soul_furnace.maxFuelTime", maxFuelTime);
        nbt.putInt("soul_furnace.souls", souls);
        nbt.putInt("soul_furnace.maxSouls", maxSouls);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("soul_furnace.progress");
        maxProgress = nbt.getInt("soul_furnace.maxProgress");
        fuelTime = nbt.getInt("soul_furnace.fuelTime");
        maxFuelTime = nbt.getInt("soul_furnace.maxFuelTime");
        souls = nbt.getInt("soul_furnace.souls");
        maxSouls = nbt.getInt("soul_furnace.maxSouls");
    }

    private static boolean canOutput(SimpleInventory inv, ItemStack output) {
        return inv.getStack(3).getItem() == output.getItem() || inv.getStack(3).isEmpty();
    }

    private static boolean canOutputAmount(SimpleInventory inv) {
        return inv.getStack(3).getMaxCount() > inv.getStack(3).getCount();
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static boolean hasFuel(SoulFurnaceEntity entity) {
        return !entity.getStack(0).isEmpty();
    }

    private static boolean isExtractingSouls(SoulFurnaceEntity entity) {
        return entity.fuelTime > 0;
    }

    private void consumeItem(SoulFurnaceEntity entity) {
        if(!getStack(0).isEmpty()) {
            Item item = getStack(0).getItem();
            this.fuelTime = initFuels.fuelList.get(item);
            entity.removeStack(0, 1);
            this.maxFuelTime = this.fuelTime;
        }
    }

    private static boolean hasRecipe(SoulFurnaceEntity entity) {
        World world = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());

        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }
        assert world != null;
        Optional<SoulFurnaceRecipe> match = world.getRecipeManager().getFirstMatch(SoulFurnaceRecipe.Type.INSTANCE, inventory, world);

        return match.isPresent() && canOutputAmount(inventory) && canOutput(inventory, match.get().getOutput());
    }

    private static void craftItem(SoulFurnaceEntity entity) {
        World world = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());

        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }
        assert world != null;
        Optional<SoulFurnaceRecipe> match = world.getRecipeManager().getFirstMatch(SoulFurnaceRecipe.Type.INSTANCE, inventory, world);

        if (match.isPresent()) {
            entity.removeStack(1, 1);
            entity.removeStack(2, 1);

            entity.setStack(3, new ItemStack(match.get().getOutput().getItem(),
                    entity.getStack(3).getCount() + 1));

            entity.resetProgress();
            entity.souls = entity.souls - 200;
        }
    }

    public static void tick(World world, BlockPos pos, BlockState state, SoulFurnaceEntity entity) {
        if (isExtractingSouls(entity)) {
            entity.fuelTime--;
            if (entity.maxSouls > entity.souls) {
                entity.souls++;
            }
        } else if (entity.souls < entity.maxSouls) {
            if (hasFuel(entity) && !isExtractingSouls(entity)) {
                entity.consumeItem(entity);
            }
        }

        if(hasRecipe(entity)) {
            if (entity.souls >= 200) {
                entity.progress++;
                if (entity.progress > entity.maxProgress) {
                    craftItem(entity);
                }
            }
        } else {
            entity.resetProgress();
        }
    }
}
