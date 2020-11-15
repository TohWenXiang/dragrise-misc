package com.dragrise96.dragrisemisc.util;

import com.dragrise96.dragrisemisc.blockitems.BlockItemBase;
import com.dragrise96.dragrisemisc.blockitems.CypressLogBlockItem;
import com.dragrise96.dragrisemisc.blockitems.CypressPlankBlockItem;
import com.dragrise96.dragrisemisc.blocks.CypressLeaf;
import com.dragrise96.dragrisemisc.blocks.CypressLog;
import com.dragrise96.dragrisemisc.blocks.CypressPlank;
import com.dragrise96.dragrisemisc.blocks.SolariumOre;
import com.dragrise96.dragrisemisc.items.CypressStick;
import com.dragrise96.dragrisemisc.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, CommonConstants.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, CommonConstants.MOD_ID);
	
	//items
	public static final RegistryObject<Item> CYPRESS_STICK = ITEMS.register("cypress_stick", CypressStick::new);
	public static final RegistryObject<Item> SOLARIUM_INGOT = ITEMS.register("solarium_ingot", ItemBase::new);
	public static final RegistryObject<Item> SOLARIUM_GEM = ITEMS.register("solarium_gem", ItemBase::new);
	
	//blocks
	public static final RegistryObject<Block> CYPRESS_LOG_BLOCK = BLOCKS.register("cypress_log", CypressLog::new);
	public static final RegistryObject<Block> CYPRESS_PLANK_BLOCK = BLOCKS.register("cypress_plank", CypressPlank::new);
	public static final RegistryObject<Block> CYPRESS_LEAF_BLOCK = BLOCKS.register("cypress_leaf", CypressLeaf::new);
	public static final RegistryObject<Block> SOLARIUM_ORE_BLOCK = BLOCKS.register("solarium_ore", SolariumOre::new);
	
	//block items
	public static final RegistryObject<Item> CYPRESS_LOG_BLOCK_ITEM = ITEMS.register("cypress_log", () -> new CypressLogBlockItem(CYPRESS_LOG_BLOCK.get()));
	public static final RegistryObject<Item> CYPRESS_PLANK_BLOCK_ITEM = ITEMS.register("cypress_plank", () -> new CypressPlankBlockItem(CYPRESS_PLANK_BLOCK.get()));
	public static final RegistryObject<Item> CYPRESS_LEAF_BLOCK_ITEM = ITEMS.register("cypress_leaf", () -> new BlockItemBase(CYPRESS_LEAF_BLOCK.get()));
	public static final RegistryObject<Item> SOLARIUM_ORE_BLOCK_ITEM = ITEMS.register("solarium_ore", () -> new BlockItemBase(SOLARIUM_ORE_BLOCK.get()));
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
}
