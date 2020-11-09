package com.dragrise96.dragrisemisc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dragrise96.dragrisemisc.util.ModInfo;
import com.dragrise96.dragrisemisc.util.RegistryHandler;

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
}
