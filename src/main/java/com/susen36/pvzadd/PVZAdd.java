package com.susen36.pvzadd;


import com.hungteen.pvz.PVZConfig;
import com.susen36.pvzadd.common.block.BlockRegister;
import com.susen36.pvzadd.common.entity.EntityRegister;
import com.susen36.pvzadd.common.impl.plant.AddPlants;
import com.susen36.pvzadd.common.impl.zombie.add.AddZombies;
import com.susen36.pvzadd.common.item.ItemRegister;
import com.susen36.pvzadd.common.item.spawn.egg.PVZAddSpawnEggItem;
import com.susen36.pvzadd.common.misc.MiscRegister;
import net.minecraft.entity.EntityType;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PVZAdd.MOD_ID)
@Mod.EventBusSubscriber(modid = PVZAdd.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PVZAdd {

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    // Mod ID.
	public static final String MOD_ID = "pvzadd";

	
    public PVZAdd() {
   	{
		final Pair<PVZConfig.Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(PVZConfig.Common::new);
   		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, specPair.getRight());
   		PVZConfig.COMMON_CONFIG = specPair.getLeft();
   	}
   	{
   		final Pair<PVZConfig.Client, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(PVZConfig.Client::new);
   		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, specPair.getRight());
   		PVZConfig.CLIENT_CONFIG = specPair.getLeft();
   	}
    	
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();


		ItemRegister.ITEMS.register(bus);
		BlockRegister.BLOCKS.register(bus);
		EntityRegister.ENTITY_TYPES.register(bus);


		//register plants.
		AddPlants.register();
		//register zombies.
		AddZombies.register();

	}


	public static void setUp(FMLCommonSetupEvent ev){
		MiscRegister.registerCompostable();
	}

	@SubscribeEvent(priority = EventPriority.LOWEST)
	public static void onPostRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
		PVZAddSpawnEggItem.initUnaddedEggs();
	}
}
