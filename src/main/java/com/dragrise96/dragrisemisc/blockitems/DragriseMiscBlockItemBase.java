package com.dragrise96.dragrisemisc.blockitems;

import com.dragrise96.dragrisemisc.DragriseMisc;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class DragriseMiscBlockItemBase extends BlockItem{

	public DragriseMiscBlockItemBase(Block block) {
		super(block, new Item.Properties().group(DragriseMisc.TAB));
	}

}
