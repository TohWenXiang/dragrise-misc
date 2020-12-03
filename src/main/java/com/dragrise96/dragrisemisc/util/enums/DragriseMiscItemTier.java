package com.dragrise96.dragrisemisc.util.enums;

import java.util.function.Supplier;

import com.dragrise96.dragrisemisc.registries.BlockRegistry;
import com.dragrise96.dragrisemisc.registries.ItemRegistry;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum DragriseMiscItemTier implements IItemTier {

	CYPRESS(0, 59, 2.0F, 0.0F, 20, () -> {
		return Ingredient.fromItems(BlockRegistry.CYPRESS_PLANK_BLOCK.get());
	}),
	SOLARIUM(2, 250, 6.0F, 2.0F, 16, () -> {
		return Ingredient.fromItems(ItemRegistry.SOLARIUM_INGOT.get());
	});

	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage; // base attack damage
	private final int enchantability;
	private final Supplier<Ingredient> repairMaterial;

	DragriseMiscItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
			Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public int getMaxUses() {
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.get();
	}

}
