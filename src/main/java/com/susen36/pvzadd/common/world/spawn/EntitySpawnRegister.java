package com.susen36.pvzadd.common.world.spawn;


import com.hungteen.pvz.common.world.spawn.SpawnChecker;
import com.susen36.pvzadd.PVZAdd;
import com.susen36.pvzadd.common.entity.EntityRegister;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntitySpawnPlacementRegistry.PlacementType;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid= PVZAdd.MOD_ID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class EntitySpawnRegister {


	@SubscribeEvent
	public static void registerEntitySpawns(RegistryEvent.Register<EntityType<?>> evt) {

		EntitySpawnPlacementRegistry.register(EntityRegister.EDGAR_090547.get(), PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		EntitySpawnPlacementRegistry.register(EntityRegister.FLOWER_POT_ZOMBIE.get(), PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		EntitySpawnPlacementRegistry.register(EntityRegister.AIRBORNE_ZOMBIE.get(), PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		EntitySpawnPlacementRegistry.register(EntityRegister.MC_ZOMBIE.get(), PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);

	}

}
