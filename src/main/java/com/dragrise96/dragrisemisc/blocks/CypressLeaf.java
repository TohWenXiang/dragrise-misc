package com.dragrise96.dragrisemisc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CypressLeaf extends LeavesBlock{

	public CypressLeaf() {
		super(Block.Properties.create(Material.LEAVES).hardnessAndResistance(2.0f)
				.sound(SoundType.WOOD)
				.harvestLevel(0)
				.harvestTool(ToolType.AXE));
	}

}
