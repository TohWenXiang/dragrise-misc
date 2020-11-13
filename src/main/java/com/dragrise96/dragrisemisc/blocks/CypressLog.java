package com.dragrise96.dragrisemisc.blocks;

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
				.sound(SoundType.WOOD)
				.harvestLevel(0)
				.harvestTool(ToolType.AXE));
	}

}
