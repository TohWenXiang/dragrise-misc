package com.dragrise96.dragrisemisc.util;

import com.dragrise96.dragrisemisc.items.ItemBase;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//items, blocks, entities deferred registries
public class RegistryHandler {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ModInfo.MOD_ID);
	
	public static void Init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	//items
	public static final RegistryObject<Item> CYPRESS_STICK = ITEMS.register("cypress_stick", ItemBase::new);
	
}
