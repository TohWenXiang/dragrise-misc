package com.dragrise96.dragrisemisc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dragrise96.dragrisemisc.util.ModInfo;
import com.dragrise96.dragrisemisc.util.RegistryHandler;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
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
		RegistryHandler.Init();
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
	}

	private void doClientStuff(final FMLClientSetupEvent event) {
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
