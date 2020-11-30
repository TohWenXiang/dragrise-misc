package com.dragrise96.dragrisemisc.world.gen;

import com.dragrise96.dragrisemisc.util.ModInfo;
import com.dragrise96.dragrisemisc.util.RegistryHandler;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ModInfo.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGenerationHandler {

	@SubscribeEvent
	public static void generateOres(FMLLoadCompleteEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES) {
			Category biomeCategory = biome.getCategory();
			//skip ore generation in nether and end dimension
			if(biomeCategory == Biome.Category.NETHER || biomeCategory == Biome.Category.THEEND) continue;
			generateOre(biome, 20, 8, 5, 105, OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
					RegistryHandler.SOLARIUM_ORE_BLOCK.get().getDefaultState(), 8);
		}
	}
	
	private static void generateOre(Biome biome, int count, int bottomOffset, int topOffset, int max, 
			OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockState, int size) {
		CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
		OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockState, size);
		ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
		biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
	}
	
}
