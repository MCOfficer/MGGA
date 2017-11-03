package me.mcofficer.MGGA;

import me.mcofficer.MGGA.item.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EventListener {

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		ModItems.register(event.getRegistry());
	}

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		ModItems.registerModels();
	}

}
