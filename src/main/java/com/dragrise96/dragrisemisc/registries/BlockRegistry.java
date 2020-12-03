package com.dragrise96.dragrisemisc.registries;

import com.dragrise96.dragrisemisc.blocks.CypressLeaf;
import com.dragrise96.dragrisemisc.blocks.CypressLog;
import com.dragrise96.dragrisemisc.blocks.CypressPlank;
import com.dragrise96.dragrisemisc.blocks.SolariumBlock;
import com.dragrise96.dragrisemisc.blocks.SolariumOre;
import com.dragrise96.dragrisemisc.util.ModInfo;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModInfo.MOD_ID);

	// blocks
	public static final RegistryObject<Block> CYPRESS_LOG_BLOCK = BLOCKS.register("cypress_log", CypressLog::new);
	public static final RegistryObject<Block> CYPRESS_PLANK_BLOCK = BLOCKS.register("cypress_plank", CypressPlank::new);
	public static final RegistryObject<Block> CYPRESS_LEAF_BLOCK = BLOCKS.register("cypress_leaf", CypressLeaf::new);
	public static final RegistryObject<Block> SOLARIUM_ORE_BLOCK = BLOCKS.register("solarium_ore", SolariumOre::new);
	public static final RegistryObject<Block> SOLARIUM_BLOCK = BLOCKS.register("solarium_block", SolariumBlock::new);

}
