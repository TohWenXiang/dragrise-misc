package com.dragrise96.dragrisemisc.util;

import com.dragrise96.dragrisemisc.blocks.BlockItemBase;
import com.dragrise96.dragrisemisc.blocks.CypressLeaf;
import com.dragrise96.dragrisemisc.blocks.CypressLog;
import com.dragrise96.dragrisemisc.blocks.CypressPlank;
import com.dragrise96.dragrisemisc.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//items, blocks, entities deferred registries
public class RegistryHandler {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ModInfo.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ModInfo.MOD_ID);
	
	//items
	public static final RegistryObject<Item> CYPRESS_STICK = ITEMS.register("cypress_stick", ItemBase::new);
	
	//blocks
	public static final RegistryObject<Block> CYPRESS_LOG_BLOCK = BLOCKS.register("cypress_log", CypressLog::new);
	public static final RegistryObject<Block> CYPRESS_PLANK_BLOCK = BLOCKS.register("cypress_plank", CypressPlank::new);
	public static final RegistryObject<Block> CYPRESS_LEAF_BLOCK = BLOCKS.register("cypress_leaf", CypressLeaf::new);
	
	//block items
	public static final RegistryObject<Item> CYPRESS_LOG_BLOCK_ITEM = ITEMS.register("cypress_log", () -> new BlockItemBase(CYPRESS_LOG_BLOCK.get()));
	public static final RegistryObject<Item> CYPRESS_PLANK_BLOCK_ITEM = ITEMS.register("cypress_plank", () -> new BlockItemBase(CYPRESS_PLANK_BLOCK.get()));
	public static final RegistryObject<Item> CYPRESS_LEAF_BLOCK_ITEM = ITEMS.register("cypress_leaf", () -> new BlockItemBase(CYPRESS_LEAF_BLOCK.get()));
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
}
