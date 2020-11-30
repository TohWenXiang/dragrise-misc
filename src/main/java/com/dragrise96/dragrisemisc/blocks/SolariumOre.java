package com.dragrise96.dragrisemisc.blocks;

import com.dragrise96.dragrisemisc.util.HarvestLevel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

public class SolariumOre extends OreBlock {

	public SolariumOre() {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(3.0F, 4.0F)
				.harvestLevel(HarvestLevel.IRON.getHarvestLevel())
				.harvestTool(ToolType.PICKAXE)
				.setLightLevel((value) -> 15)
				.setRequiresTool()
				.sound(SoundType.STONE));
	}

	@Override
	public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos
			, int fortune, int silktouch) {
		return silktouch == 0 ? MathHelper.nextInt(RANDOM, 1, 5) : 0;
	}

}
