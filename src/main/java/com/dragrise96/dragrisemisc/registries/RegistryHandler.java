package com.dragrise96.dragrisemisc.registries;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RegistryHandler {

	public static void init() {
		BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		//some of the item in item registry is dependent on blocks, so register item after blocks
		ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

}
