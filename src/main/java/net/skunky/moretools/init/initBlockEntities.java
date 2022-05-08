package net.skunky.moretools.init;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.skunky.moretools.MoreTools;
import net.skunky.moretools.custom.entities.SoulFurnaceEntity;
import net.skunky.moretools.init.initBlocks;

public class initBlockEntities {
    /*
    This Class is used to register all Block Entities you Created
    public static BlockEntityType<YOUR BLOCK ENTITY CLASS> ENTITY NAME;
    */

    public static BlockEntityType<SoulFurnaceEntity> SOUL_FURNACE;

    public static void init() {
        SOUL_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MoreTools.MOD_ID, "soul_furnace"),
                FabricBlockEntityTypeBuilder.create(SoulFurnaceEntity::new, initBlocks.SOUL_FURNACE).build(null));
    }
}
