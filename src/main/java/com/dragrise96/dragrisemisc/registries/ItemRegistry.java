package com.dragrise96.dragrisemisc.registries;

import com.dragrise96.dragrisemisc.DragriseMisc;
import com.dragrise96.dragrisemisc.blockitems.CypressLogBlockItem;
import com.dragrise96.dragrisemisc.blockitems.CypressPlankBlockItem;
import com.dragrise96.dragrisemisc.blockitems.DragriseMiscBlockItemBase;
import com.dragrise96.dragrisemisc.items.CypressFruit;
import com.dragrise96.dragrisemisc.items.CypressStick;
import com.dragrise96.dragrisemisc.items.DragriseMiscItemBase;
import com.dragrise96.dragrisemisc.util.ModInfo;
import com.dragrise96.dragrisemisc.util.enums.DragriseMiscArmorMaterial;
import com.dragrise96.dragrisemisc.util.enums.DragriseMiscItemTier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModInfo.MOD_ID);

	// items
	public static final RegistryObject<Item> CYPRESS_STICK = ITEMS.register("cypress_stick", CypressStick::new);
	public static final RegistryObject<Item> SOLARIUM_INGOT = ITEMS.register("solarium_ingot", DragriseMiscItemBase::new);
	public static final RegistryObject<Item> SOLARIUM_GEM = ITEMS.register("solarium_gem", DragriseMiscItemBase::new);
	public static final RegistryObject<Item> SOLARIUM_NUGGET = ITEMS.register("solarium_nugget", DragriseMiscItemBase::new);

	// food item
	public static final RegistryObject<CypressFruit> CYPRESS_FRUIT = ITEMS.register("cypress_fruit", CypressFruit::new);

	// tools
	// actual attack damage = (base damage (1) + item tier attack damage(1) + added
	// damage (1))/2 = 1.5
	// actual attack speed = base speed (4) + -item attack speed (-2.4)
	public static final RegistryObject<SwordItem> CYPRESS_SWORD = ITEMS.register("cypress_sword",
			() -> new SwordItem(DragriseMiscItemTier.CYPRESS, 3, -2.4F, 
					new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<AxeItem> CYPRESS_AXE = ITEMS.register("cypress_axe",
			() -> new AxeItem(DragriseMiscItemTier.CYPRESS, 6.0F, -3.2F,
					new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<PickaxeItem> CYPRESS_PICKAXE = ITEMS.register("cypress_pickaxe",
			() -> new PickaxeItem(DragriseMiscItemTier.CYPRESS, 1, -2.8F,
					new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<ShovelItem> CYPRESS_SHOVEL = ITEMS.register("cypress_shovel",
			() -> new ShovelItem(DragriseMiscItemTier.CYPRESS, 1.5F, -3.0F,
					new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<HoeItem> CYPRESS_HOE = ITEMS.register("cypress_hoe",
			() -> new HoeItem(DragriseMiscItemTier.CYPRESS, -3, -3.0F, 
					new Item.Properties().group(DragriseMisc.TAB)));

	public static final RegistryObject<SwordItem> SOLARIUM_SWORD = ITEMS.register("solarium_sword",
			() -> new SwordItem(DragriseMiscItemTier.SOLARIUM, 3, -2.4F,
					new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<AxeItem> SOLARIUM_AXE = ITEMS.register("solarium_axe",
			() -> new AxeItem(DragriseMiscItemTier.SOLARIUM, 6.0F, -3.1F,
					new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<PickaxeItem> SOLARIUM_PICKAXE = ITEMS.register("solarium_pickaxe",
			() -> new PickaxeItem(DragriseMiscItemTier.SOLARIUM, 1, -2.8F,
					new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<ShovelItem> SOLARIUM_SHOVEL = ITEMS.register("solarium_shovel",
			() -> new ShovelItem(DragriseMiscItemTier.SOLARIUM, 1.5F, -3.0F,
					new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<HoeItem> SOLARIUM_HOE = ITEMS.register("solarium_hoe",
			() -> new HoeItem(DragriseMiscItemTier.SOLARIUM, -3, -1.0F, 
					new Item.Properties().group(DragriseMisc.TAB)));

	// armor
	public static final RegistryObject<ArmorItem> SOLARIUM_HELMET = ITEMS.register("solarium_helmet",
			() -> new ArmorItem(DragriseMiscArmorMaterial.SOLARIUM, EquipmentSlotType.HEAD,
					new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<ArmorItem> SOLARIUM_CHESTPLATE = ITEMS.register("solarium_chestplate",
			() -> new ArmorItem(DragriseMiscArmorMaterial.SOLARIUM, EquipmentSlotType.CHEST,
					new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<ArmorItem> SOLARIUM_LEGGINGS = ITEMS.register("solarium_leggings",
			() -> new ArmorItem(DragriseMiscArmorMaterial.SOLARIUM, EquipmentSlotType.LEGS,
					new Item.Properties().group(DragriseMisc.TAB)));
	public static final RegistryObject<ArmorItem> SOLARIUM_BOOTS = ITEMS.register("solarium_boots",
			() -> new ArmorItem(DragriseMiscArmorMaterial.SOLARIUM, EquipmentSlotType.FEET,
					new Item.Properties().group(DragriseMisc.TAB)));

	// block items
	public static final RegistryObject<Item> CYPRESS_LOG_BLOCK_ITEM = ITEMS.register("cypress_log",
			() -> new CypressLogBlockItem(BlockRegistry.CYPRESS_LOG_BLOCK.get()));
	public static final RegistryObject<Item> CYPRESS_PLANK_BLOCK_ITEM = ITEMS.register("cypress_plank",
			() -> new CypressPlankBlockItem(BlockRegistry.CYPRESS_PLANK_BLOCK.get()));
	public static final RegistryObject<Item> CYPRESS_LEAF_BLOCK_ITEM = ITEMS.register("cypress_leaf",
			() -> new DragriseMiscBlockItemBase(BlockRegistry.CYPRESS_LEAF_BLOCK.get()));
	public static final RegistryObject<Item> SOLARIUM_ORE_BLOCK_ITEM = ITEMS.register("solarium_ore",
			() -> new DragriseMiscBlockItemBase(BlockRegistry.SOLARIUM_ORE_BLOCK.get()));
	public static final RegistryObject<Item> SOLARIUM_BLOCK_ITEM = ITEMS.register("solarium_block",
			() -> new DragriseMiscBlockItemBase(BlockRegistry.SOLARIUM_BLOCK.get()));
}
