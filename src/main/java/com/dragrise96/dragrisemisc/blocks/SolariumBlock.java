package com.dragrise96.dragrisemisc.blocks;

import com.dragrise96.dragrisemisc.util.enums.HarvestLevel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SolariumBlock extends Block {

	public SolariumBlock() {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(5.0F, 6.0F)
				.harvestLevel(HarvestLevel.IRON.getHarvestLevel())
				.harvestTool(ToolType.PICKAXE)
				.setRequiresTool()
				.sound(SoundType.METAL));
	}

}
