package net.skunky.moretools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.skunky.moretools.init.initBlocks;
import net.skunky.moretools.init.initItems;
import net.skunky.moretools.world.ModWorldGen;

import java.util.logging.Logger;

public class MoreTools implements ModInitializer {
    public static final String MOD_ID = "moretools";
    public static final Logger LOG = Logger.getLogger(MOD_ID);
    public static final ItemGroup MORE_TOOLS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "more-tools"), () -> new ItemStack(initItems.RUBY));


    @Override
    public void onInitialize() {
        ModWorldGen.generate();
        initBlocks.init();
        initItems.init();
    }
}
