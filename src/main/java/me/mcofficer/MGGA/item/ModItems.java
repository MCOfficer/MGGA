package me.mcofficer.MGGA.item;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ModItems {

	public static ArrayList<ItemBase> items = new ArrayList<ItemBase>();



	public static void register(IForgeRegistry<Item> registry) {
		for (ItemBase item : items)
			registry.register(item);
	}

	public static void registerModels() {
		for (ItemBase item : items)
			item.registerItemModel();
	}

	public static void initItems() {
		CreativeTabs materials = CreativeTabs.MATERIALS;

		createItem("gem_ruby", materials);
		createItem("gem_sapphire", materials);
		createItem("gem_malachite", materials);
		createItem("gem_amethyst", materials);
	}

	public static void createItem  (String name, CreativeTabs tab) {
		ItemBase item = new ItemBase(name).setCreativeTab(tab);
		items.add(item);
	}
}
