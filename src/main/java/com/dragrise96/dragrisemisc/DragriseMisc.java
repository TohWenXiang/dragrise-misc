package com.dragrise96.dragrisemisc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dragrise96.dragrisemisc.util.ModInfo;
import com.dragrise96.dragrisemisc.util.RegistryHandler;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILightReader;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModInfo.MOD_ID)
public class DragriseMisc {
	private static final Logger LOGGER = LogManager.getLogger();

	public DragriseMisc() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		RegistryHandler.init();
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
	}

	private void doClientStuff(final FMLClientSetupEvent event) {
		//block colors
		BlockColors blockColors = Minecraft.getInstance().getBlockColors();
		
		blockColors.register((blockState, lightReader, blockPos, tintIndex) -> {
			return BiomeColors.getFoliageColor(lightReader, blockPos);
		}, RegistryHandler.CYPRESS_LEAF_BLOCK.get());
		
		//To Do: fix item colors
//		ItemColors itemColors = Minecraft.getInstance().getItemColors();
//		
//		itemColors.register((itemStack, tintIndex) -> {
//			BlockState blockstate = ((BlockItem)itemStack.getItem()).getBlock().getDefaultState();
//			return blockColors.getColor(blockstate, (ILightReader)null, (BlockPos)null, tintIndex);
//		}, RegistryHandler.CYPRESS_LEAF_BLOCK_ITEM.get());
	}

	public static final ItemGroup TAB = new ItemGroup(ModInfo.MOD_ID) {

		@Override
		public ItemStack createIcon() {
			// custom item
			// return new ItemStack(RegistryHandler.CYPRESS_STICK.get());

			// minecraft item
			return new ItemStack(Items.DRAGON_HEAD);
		}
	};
}
