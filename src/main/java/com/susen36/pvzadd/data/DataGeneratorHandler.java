package com.susen36.pvzadd.data;

import com.susen36.pvzadd.PVZAdd;
import com.susen36.pvzadd.data.loot.LootTableGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = PVZAdd.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGeneratorHandler {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent ev) {
		ExistingFileHelper helper = ev.getExistingFileHelper();
		if(ev.includeServer()) {
			//for loot tables.
		    ev.getGenerator().addProvider(new LootTableGenerator(ev.getGenerator()));
		}

	}
}
