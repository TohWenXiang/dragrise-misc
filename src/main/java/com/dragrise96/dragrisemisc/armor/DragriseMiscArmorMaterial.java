package com.dragrise96.dragrisemisc.armor;

import java.util.function.Supplier;

import com.dragrise96.dragrisemisc.util.ModInfo;
import com.dragrise96.dragrisemisc.util.RegistryHandler;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum DragriseMiscArmorMaterial implements IArmorMaterial {

	SOLARIUM(ModInfo.MOD_ID + ":solarium", 20, new int[] { 2, 5, 6, 2 }, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
			() -> {
				return Ingredient.fromItems(RegistryHandler.SOLARIUM_INGOT.get());
			}, 1);

	private static final int[] MAX_DAMAGE_ARRAY = new int[] { 11, 16, 15, 13 };
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final Supplier<Ingredient> repairMaterial;
	private final float knockbackResist;

	DragriseMiscArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
			SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResist) {
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.repairMaterial = repairMaterial;
		this.knockbackResist = knockbackResist;
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return this.MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.get();
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	//knockback resistence value
	@Override
	public float func_230304_f_() {
		return this.knockbackResist;
	}

}
