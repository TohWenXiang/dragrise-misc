package com.dragrise96.dragrisemisc.util;

import com.dragrise96.dragrisemisc.DragriseMisc;
import com.dragrise96.dragrisemisc.blockitems.CypressLogBlockItem;
import com.dragrise96.dragrisemisc.blockitems.CypressPlankBlockItem;
import com.dragrise96.dragrisemisc.blockitems.DragriseMiscBlockItemBase;
import com.dragrise96.dragrisemisc.blocks.CypressLeaf;
import com.dragrise96.dragrisemisc.blocks.CypressLog;
import com.dragrise96.dragrisemisc.blocks.CypressPlank;
import com.dragrise96.dragrisemisc.blocks.SolariumOre;
import com.dragrise96.dragrisemisc.items.CypressStick;
import com.dragrise96.dragrisemisc.items.DragriseMiscItemBase;
import com.dragrise96.dragrisemisc.tools.DragriseMiscItemTier;

import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ModInfo.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ModInfo.MOD_ID);

	// items
	public static final RegistryObject<Item> CYPRESS_STICK = ITEMS.register("cypress_stick", CypressStick::new);
	public static final RegistryObject<Item> SOLARIUM_INGOT = ITEMS.register("solarium_ingot", DragriseMiscItemBase::new);
	public static final RegistryObject<Item> SOLARIUM_GEM = ITEMS.register("solarium_gem", DragriseMiscItemBase::new);

	// tools
	//actual attack damage = (base damage (1) + item tier attack damage(1) + added damage (1))/2 = 1.5
	//actual attack speed = base speed (4) + -item attack speed (-2.4)
	public static final RegistryObject<SwordItem> CYPRESS_SWORD = ITEMS.register("cypress_sword", 
			() -> new SwordItem(DragriseMiscItemTier.CYPRESS, 3, -2.4F, new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<AxeItem> CYPRESS_AXE = ITEMS.register("cypress_axe", 
			() -> new AxeItem(DragriseMiscItemTier.CYPRESS, 6.0F, -3.2F, new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<PickaxeItem> CYPRESS_PICKAXE = ITEMS.register("cypress_pickaxe", 
			() -> new PickaxeItem(DragriseMiscItemTier.CYPRESS, 1, -2.8F, new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<ShovelItem> CYPRESS_SHOVEL = ITEMS.register("cypress_shovel", 
			() -> new ShovelItem(DragriseMiscItemTier.CYPRESS, 1.5F, -3.0F, new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<HoeItem> CYPRESS_HOE = ITEMS.register("cypress_hoe", 
			() -> new HoeItem(DragriseMiscItemTier.CYPRESS, -3.0F, new Item.Properties().group(DragriseMisc.TAB)));
	
	public static final RegistryObject<SwordItem> SOLARIUM_SWORD = ITEMS.register("solarium_sword", 
			() -> new SwordItem(DragriseMiscItemTier.SOLARIUM, 3, -2.4F, new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<AxeItem> SOLARIUM_AXE = ITEMS.register("solarium_axe", 
			() -> new AxeItem(DragriseMiscItemTier.SOLARIUM, 6.0F, -3.1F, new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<PickaxeItem> SOLARIUM_PICKAXE = ITEMS.register("solarium_pickaxe", 
			() -> new PickaxeItem(DragriseMiscItemTier.SOLARIUM, 1, -2.8F, new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<ShovelItem> SOLARIUM_SHOVEL = ITEMS.register("solarium_shovel", 
			() -> new ShovelItem(DragriseMiscItemTier.SOLARIUM, 1.5F, -3.0F, new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<HoeItem> SOLARIUM_HOE = ITEMS.register("solarium_hoe", 
			() -> new HoeItem(DragriseMiscItemTier.SOLARIUM, -1.0F, new Item.Properties().group(DragriseMisc.TAB)));

	// blocks
	public static final RegistryObject<Block> CYPRESS_LOG_BLOCK = BLOCKS.register("cypress_log", CypressLog::new);
	public static final RegistryObject<Block> CYPRESS_PLANK_BLOCK = BLOCKS.register("cypress_plank", CypressPlank::new);
	public static final RegistryObject<Block> CYPRESS_LEAF_BLOCK = BLOCKS.register("cypress_leaf", CypressLeaf::new);
	public static final RegistryObject<Block> SOLARIUM_ORE_BLOCK = BLOCKS.register("solarium_ore", SolariumOre::new);

	// block items
	public static final RegistryObject<Item> CYPRESS_LOG_BLOCK_ITEM = ITEMS.register("cypress_log", () -> new CypressLogBlockItem(CYPRESS_LOG_BLOCK.get()));
	public static final RegistryObject<Item> CYPRESS_PLANK_BLOCK_ITEM = ITEMS.register("cypress_plank", () -> new CypressPlankBlockItem(CYPRESS_PLANK_BLOCK.get()));
	public static final RegistryObject<Item> CYPRESS_LEAF_BLOCK_ITEM = ITEMS.register("cypress_leaf", () -> new DragriseMiscBlockItemBase(CYPRESS_LEAF_BLOCK.get()));
	public static final RegistryObject<Item> SOLARIUM_ORE_BLOCK_ITEM = ITEMS.register("solarium_ore", () -> new DragriseMiscBlockItemBase(SOLARIUM_ORE_BLOCK.get()));

	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

}
