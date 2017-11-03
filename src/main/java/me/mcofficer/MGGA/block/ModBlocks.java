package me.mcofficer.MGGA.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;

public class ModBlocks {

	public static ArrayList<BlockBase> blocks = new ArrayList<BlockBase>();


	public static void initBlocks() {
		CreativeTabs bb = CreativeTabs.BUILDING_BLOCKS;

		createBlock("ore_ruby", Material.ROCK, bb);
		createBlock("ore_sapphire", Material.ROCK, bb);
		createBlock("ore_malachite", Material.ROCK, bb);
		createBlock("ore_amethyst", Material.ROCK, bb);
	}

	public static void register(IForgeRegistry<Block> registry) {
		for (BlockBase block: blocks)
			registry.register(block);
	}

	public static void registerItemBlocks(IForgeRegistry<Item>registry) {
		for (BlockBase block: blocks)
			registry.register(block.createItemBlock());
	}

	public static void registerModels() {
		for (BlockBase block: blocks)
			block.registerItemModel(Item.getItemFromBlock(block));
	}

	public static void createBlock (String name, Material material, CreativeTabs tab) {
		BlockBase block = new BlockBase(material, name).setCreativeTab(tab);
		blocks.add(block);
	}


}
