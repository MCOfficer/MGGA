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

		createOre("ore_ruby", bb);
		createOre("ore_sapphire", bb);
		createOre("ore_malachite", bb);
		createOre("ore_amethyst", bb);

		createBlock("block_ruby", Material.IRON, bb);
		createBlock("block_sapphire", Material.IRON, bb);
		createBlock("block_malachite", Material.IRON, bb);
		createBlock("block_amethyst", Material.IRON, bb);
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

	public static void createOre (String name, CreativeTabs tab) {
		BlockOre block = new BlockOre(name).setCreativeTab(tab);
		blocks.add(block);
	}


}
