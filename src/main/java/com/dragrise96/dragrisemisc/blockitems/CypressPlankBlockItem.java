package com.dragrise96.dragrisemisc.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class CypressPlankBlockItem extends BlockItemBase {

	public CypressPlankBlockItem(Block block) {
		super(block);
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack ) {
		return 300;
	}
}
