package net.skunky.moretools.world;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.skunky.moretools.init.initBlocks;

import java.util.List;

public class ModConfFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_RUBY_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, initBlocks.RUBY_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, initBlocks.RUBY_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> OVERWORLD_SAPPHIRE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, initBlocks.SAPPHIRE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, initBlocks.SAPPHIRE_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> OVERWORLD_GREEN_SAPPHIRE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, initBlocks.GREEN_SAPPHIRE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, initBlocks.GREEN_SAPPHIRE_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> OVERWORLD_CRYSTAL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, initBlocks.CRYSTAL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, initBlocks.CRYSTAL_ORE.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MORE_TOOLS_RUBY_ORES = ConfiguredFeatures.register("more_tools_ruby_ores", Feature.ORE,new OreFeatureConfig(OVERWORLD_RUBY_ORES, 10));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MORE_TOOLS_SAPPHIRE_ORES = ConfiguredFeatures.register("more_tools_sapphire_ores", Feature.ORE,new OreFeatureConfig(OVERWORLD_SAPPHIRE_ORES, 10));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MORE_TOOLS_GREEN_SAPPHIRE_ORES = ConfiguredFeatures.register("more_tools_green_sapphire_ores", Feature.ORE,new OreFeatureConfig(OVERWORLD_GREEN_SAPPHIRE_ORES, 10));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MORE_TOOLS_CRYSTAL_ORES = ConfiguredFeatures.register("more_tools_crystal_ores", Feature.ORE,new OreFeatureConfig(OVERWORLD_CRYSTAL_ORES, 10));

}
