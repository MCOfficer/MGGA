package me.mcofficer.MGGA;

import me.mcofficer.MGGA.item.ModItems;
import me.mcofficer.MGGA.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MGGA.modId, name = MGGA.name, version = MGGA.version, acceptedMinecraftVersions = "[1.12.2]")
public class MGGA {

	public static final String modId = "mgga";
	public static final String name = "MGGA";
	public static final String version = "1.0.0";

	@Mod.Instance(modId)
	public static MGGA instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading...");
		ModItems.initItems();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@Mod.EventHandler
	public void	postInit(FMLPostInitializationEvent event) {
	}

	@SidedProxy(serverSide = "me.mcofficer.MGGA.proxy.CommonProxy", clientSide = "me.mcofficer.MGGA.proxy.ClientProxy")
	public static CommonProxy proxy;

}
