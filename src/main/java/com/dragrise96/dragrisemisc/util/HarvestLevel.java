package com.dragrise96.dragrisemisc.util;

public enum HarvestLevel {

	WOOD (0),
	STONE (1),
	IRON (2),
	DIAMOND (3);
	
	private final int harvestLevel;
	
	HarvestLevel (int harvestLevel) {
		this.harvestLevel = harvestLevel;
	}

	public int getHarvestLevel() {
		return harvestLevel;
	}

}
