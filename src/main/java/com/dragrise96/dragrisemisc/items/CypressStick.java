package com.dragrise96.dragrisemisc.items;

import net.minecraft.item.ItemStack;

public class CypressStick extends DragriseMiscItemBase {

	public CypressStick() {
		super();
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 100;
	}

}
