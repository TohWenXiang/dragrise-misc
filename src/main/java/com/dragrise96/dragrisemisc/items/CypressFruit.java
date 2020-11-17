package com.dragrise96.dragrisemisc.items;

import com.dragrise96.dragrisemisc.DragriseMisc;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CypressFruit extends Item {

	public CypressFruit() {
		super(new Item.Properties()
				.group(DragriseMisc.TAB)
				.food(new Food.Builder()
						.hunger(4)
						.saturation(1.2F)
						.effect(() -> new EffectInstance(Effects.ABSORPTION, 400, 0), 0.7F)
						.effect(() -> new EffectInstance(Effects.REGENERATION, 500, 2), 1.0F)
						.effect(() -> new EffectInstance(Effects.SLOWNESS, 500, 3), 1.0F)
						.effect(() -> new EffectInstance(Effects.HUNGER, 100, 4), 0.2F)
						.build()));
	}

}
