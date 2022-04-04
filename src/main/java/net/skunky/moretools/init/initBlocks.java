package net.skunky.moretools.init;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.skunky.moretools.MoreTools;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class initBlocks {

    private static Block registerBlock(String name, Block block, @Nullable String tooltipkey) {
        Registry.register(Registry.ITEM, new Identifier(MoreTools.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(MoreTools.MORE_TOOLS)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        if(tooltipkey != null) {
                            tooltip.add(new TranslatableText(tooltipkey));
                        }
                    }
                });
        return Registry.register(Registry.BLOCK, new Identifier(MoreTools.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        MoreTools.LOG.info("Registering ModBlocks for " + MoreTools.MOD_ID);
    }
}
