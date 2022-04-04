package net.skunky.moretools.init;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
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

    public static final Block RUBY_ORE = registerBlock("ruby_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), null);
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), null);
    public static final Block GREEN_SAPPHIRE_ORE = registerBlock("green_sapphire_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), null);
    public static final Block CRYSTAL_ORE = registerBlock("crystal_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), null);

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

    public static void init() {
        MoreTools.LOG.info("Registering ModBlocks for " + MoreTools.MOD_ID);
    }
}
