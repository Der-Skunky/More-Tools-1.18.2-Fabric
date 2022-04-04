package net.skunky.moretools.world;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeature {

    public static final RegistryEntry<PlacedFeature> MORE_TOOLS_RUBY_ORES_PLACED = PlacedFeatures.register("more_tools_ruby_ores_placed",
            ModConfFeatures.MORE_TOOLS_RUBY_ORES, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72))));

    public static final RegistryEntry<PlacedFeature> MORE_TOOLS_SAPPHIRE_ORES_PLACED = PlacedFeatures.register("more_tools_sapphire_ores_placed",
            ModConfFeatures.MORE_TOOLS_SAPPHIRE_ORES, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72))));

    public static final RegistryEntry<PlacedFeature> MORE_TOOLS_GREEN_SAPPHIRE_ORES_PLACED = PlacedFeatures.register("more_tools_green_sapphire_ores_placed",
            ModConfFeatures.MORE_TOOLS_GREEN_SAPPHIRE_ORES, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72))));

    public static final RegistryEntry<PlacedFeature> MORE_TOOLS_CRYSTAL_ORES_PLACED = PlacedFeatures.register("more_tools_crystal_ores_placed",
            ModConfFeatures.MORE_TOOLS_CRYSTAL_ORES, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72))));

}
