package me.mcofficer.MGGA.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import me.mcofficer.MGGA.MGGA;

public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}

	public void registerItemModel() {
		MGGA.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
