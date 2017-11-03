package me.mcofficer.MGGA.proxy;

import me.mcofficer.MGGA.MGGA;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelResourceLocation mrl = new ModelResourceLocation(MGGA.modId + ":" + id, "inventory");
		ModelLoader.setCustomModelResourceLocation(item, meta, mrl);
	}
}
