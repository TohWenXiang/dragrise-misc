package com.dragrise96.dragrisemisc.blocks;

import com.dragrise96.dragrisemisc.DragriseMisc;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem{

	public BlockItemBase(Block block) {
		super(block, new Item.Properties().group(DragriseMisc.TAB));
	}

}
