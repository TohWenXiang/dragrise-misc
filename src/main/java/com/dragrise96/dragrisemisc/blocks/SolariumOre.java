package com.dragrise96.dragrisemisc.blocks;

import com.dragrise96.dragrisemisc.util.HarvestLevel;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SolariumOre extends OreBlock {

	public SolariumOre() {
		super(Block.Properties.create(Material.ROCK)
				.hardnessAndResistance(3.0F)
				.harvestLevel(HarvestLevel.IRON.getHarvestLevel())
				.harvestTool(ToolType.PICKAXE)
				.setLightLevel((value) -> 15)
				.setRequiresTool()
				.sound(SoundType.STONE));
	}

}
