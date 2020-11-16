package com.dragrise96.dragrisemisc.blocks;

import com.dragrise96.dragrisemisc.util.HarvestLevel;

import net.minecraft.block.Block;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class CypressLog extends LogBlock{

	public CypressLog() {
		super(MaterialColor.WOOD, Block.Properties.create(Material.WOOD)
				.hardnessAndResistance(2.0f)
				.harvestLevel(HarvestLevel.WOOD.getHarvestLevel())
				.harvestTool(ToolType.AXE)
				.sound(SoundType.WOOD));
	}

}
