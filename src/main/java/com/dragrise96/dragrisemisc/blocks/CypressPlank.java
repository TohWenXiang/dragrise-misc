package com.dragrise96.dragrisemisc.blocks;

import com.dragrise96.dragrisemisc.util.enums.HarvestLevel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CypressPlank extends Block {

	public CypressPlank() {
		super(Block.Properties.create(Material.WOOD)
				.hardnessAndResistance(2.0F, 3.0F)
				.harvestLevel(HarvestLevel.WOOD.getHarvestLevel())
				.harvestTool(ToolType.AXE)
				.setRequiresTool()
				.sound(SoundType.WOOD));
	}

}
