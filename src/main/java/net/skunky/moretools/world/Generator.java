package net.skunky.moretools.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.skunky.moretools.init.initBlocks;

import java.util.List;

public class Generator {

    public static void genOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RUBY_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RUBY_ORE_DEEPSLATE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RUBY_ORE_NETHERRACK_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, SAPPHIRE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, SAPPHIRE_ORE_DEEPSLATE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, SAPPHIRE_ORE_NETHERRACK_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, GREEN_SAPPHIRE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, GREEN_SAPPHIRE_ORE_DEEPSLATE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, GREEN_SAPPHIRE_ORE_NETHERRACK_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, CRYSTAL_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, CRYSTAL_ORE_DEEPSLATE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, CRYSTAL_ORE_NETHERRACK_PLACED.getKey().get());
    }

    // Configured Features
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE =
            ConfiguredFeatures.register("ruby_ore", Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, initBlocks.RUBY_ORE.getDefaultState(), 10));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE_DEEPSLATE =
            ConfiguredFeatures.register("ruby_ore_deepslate", Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, initBlocks.RUBY_ORE.getDefaultState(), 10));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE_NETHERRACK =
            ConfiguredFeatures.register("ruby_ore_netherrack", Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, initBlocks.RUBY_ORE_NETHERRACK.getDefaultState(), 10));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE =
            ConfiguredFeatures.register("sapphire_ore", Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, initBlocks.SAPPHIRE_ORE.getDefaultState(), 10));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE_DEEPSLATE =
            ConfiguredFeatures.register("sapphire_ore_deepslate", Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, initBlocks.SAPPHIRE_ORE_DEEPSLATE.getDefaultState(), 10));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE_NETHERRACK =
            ConfiguredFeatures.register("sapphire_ore_netherrack", Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, initBlocks.SAPPHIRE_ORE_NETHERRACK.getDefaultState(), 10));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> GREEN_SAPPHIRE_ORE =
            ConfiguredFeatures.register("green_sapphire_ore", Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, initBlocks.GREEN_SAPPHIRE_ORE.getDefaultState(), 10));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> GREEN_SAPPHIRE_ORE_DEEPSLATE =
            ConfiguredFeatures.register("green_sapphire_ore_deepslate", Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, initBlocks.GREEN_SAPPHIRE_ORE_DEEPSLATE.getDefaultState(), 10));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> GREEN_SAPPHIRE_ORE_NETHERRACK =
            ConfiguredFeatures.register("green_sapphire_ore_netherrack", Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, initBlocks.GREEN_SAPPHIRE_ORE_NETHERRACK.getDefaultState(), 10));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CRYSTAL_ORE =
            ConfiguredFeatures.register("crystal_ore", Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, initBlocks.CRYSTAL_ORE.getDefaultState(), 10));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CRYSTAL_ORE_DEEPSLATE =
            ConfiguredFeatures.register("crystal_ore_deepslate", Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, initBlocks.CRYSTAL_ORE_DEEPSLATE.getDefaultState(), 10));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CRYSTAL_ORE_NETHERRACK =
            ConfiguredFeatures.register("crystal_ore_netherrack", Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, initBlocks.CRYSTAL_ORE_NETHERRACK.getDefaultState(), 10));






    // Placed Features
    public static final RegistryEntry<PlacedFeature> RUBY_ORE_PLACED =
            PlacedFeatures.register("ruby_ore_placed", RUBY_ORE, modifiersWithCount(7, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72))));
    public static final RegistryEntry<PlacedFeature> RUBY_ORE_DEEPSLATE_PLACED =
            PlacedFeatures.register("ruby_ore_deepslate_placed", RUBY_ORE_DEEPSLATE, modifiersWithCount(7, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72))));
    public static final RegistryEntry<PlacedFeature> RUBY_ORE_NETHERRACK_PLACED =
            PlacedFeatures.register("ruby_ore_netherrack_placed", RUBY_ORE_NETHERRACK, modifiersWithCount(7, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));

    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_PLACED =
            PlacedFeatures.register("sapphire_ore_placed", SAPPHIRE_ORE, modifiersWithCount(7, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72))));
    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_DEEPSLATE_PLACED =
            PlacedFeatures.register("sapphire_ore_deepslate_placed", SAPPHIRE_ORE_DEEPSLATE, modifiersWithCount(7, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72))));
    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_NETHERRACK_PLACED =
            PlacedFeatures.register("sapphire_ore_netherrack_placed", SAPPHIRE_ORE_NETHERRACK, modifiersWithCount(7, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));

    public static final RegistryEntry<PlacedFeature> GREEN_SAPPHIRE_ORE_PLACED =
            PlacedFeatures.register("green_sapphire_ore_placed", GREEN_SAPPHIRE_ORE, modifiersWithCount(7, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72))));
    public static final RegistryEntry<PlacedFeature> GREEN_SAPPHIRE_ORE_DEEPSLATE_PLACED =
            PlacedFeatures.register("green_sapphire_ore_deepslate_placed", GREEN_SAPPHIRE_ORE_DEEPSLATE, modifiersWithCount(7, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72))));
    public static final RegistryEntry<PlacedFeature> GREEN_SAPPHIRE_ORE_NETHERRACK_PLACED =
            PlacedFeatures.register("green_sapphire_ore_netherrack_placed", GREEN_SAPPHIRE_ORE_NETHERRACK, modifiersWithCount(7, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));

    public static final RegistryEntry<PlacedFeature> CRYSTAL_ORE_PLACED =
            PlacedFeatures.register("crystal_ore_placed", CRYSTAL_ORE, modifiersWithCount(7, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72))));
    public static final RegistryEntry<PlacedFeature> CRYSTAL_ORE_DEEPSLATE_PLACED =
            PlacedFeatures.register("crystal_ore_deepslate_placed", CRYSTAL_ORE_DEEPSLATE, modifiersWithCount(7, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72))));
    public static final RegistryEntry<PlacedFeature> CRYSTAL_ORE_NETHERRACK_PLACED =
            PlacedFeatures.register("crystal_ore_netherrack_placed", CRYSTAL_ORE_NETHERRACK, modifiersWithCount(7, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));



    // Ore Features
    static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier){
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    static List<PlacementModifier> modifierWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
