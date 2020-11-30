package com.dragrise96.dragrisemisc.blocks;

import com.dragrise96.dragrisemisc.util.HarvestLevel;

import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

//public class CypressLog extends LogBlock{
//
//	public CypressLog() {
//		super(MaterialColor.WOOD, Block.Properties.create(Material.WOOD)
//				.hardnessAndResistance(2.0f)
//				.harvestLevel(HarvestLevel.WOOD.getHarvestLevel())
//				.harvestTool(ToolType.AXE)
//				.setRequiresTool()
//				.sound(SoundType.WOOD));
//	}
//
//}

public class CypressLog extends RotatedPillarBlock{

	public CypressLog() {
//		super(MaterialColor.WOOD, Block.Properties.create(Material.WOOD)
//				.hardnessAndResistance(2.0f)
//				.harvestLevel(HarvestLevel.WOOD.getHarvestLevel())
//				.harvestTool(ToolType.AXE)
//				.setRequiresTool()
//				.sound(SoundType.WOOD));
		super(Block.Properties.create(Material.WOOD)
				.hardnessAndResistance(2.0f)
				.harvestLevel(HarvestLevel.WOOD.getHarvestLevel())
				.harvestTool(ToolType.AXE)
				.setRequiresTool()
				.sound(SoundType.WOOD));
	}

}

