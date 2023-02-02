package com.susen36.pvzadd.common.entity;


import com.hungteen.pvz.common.entity.PVZEntityClassifications;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.hungteen.pvz.utils.StringUtil;
import com.susen36.pvzadd.PVZAdd;
import com.susen36.pvzadd.client.render.entity.bullet.IceCabbageRender;
import com.susen36.pvzadd.client.render.entity.plant.defence.SteelPumpkinRender;
import com.susen36.pvzadd.client.render.entity.plant.ice.IceCabbagePultRender;
import com.susen36.pvzadd.client.render.entity.zombie.add.*;
import com.susen36.pvzadd.common.entity.bullet.itembullet.IceCabbageEntity;
import com.susen36.pvzadd.common.entity.plant.defence.SteelPumpkinEntity;
import com.susen36.pvzadd.common.entity.plant.ice.IceCabbagePultEntity;
import com.susen36.pvzadd.common.entity.zombie.add.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityType.IFactory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = PVZAdd.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityRegister {

	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =  DeferredRegister.create(ForgeRegistries.ENTITIES, PVZAdd.MOD_ID);

	/**
	 * plants
	 */

	public static final RegistryObject<EntityType<SteelPumpkinEntity>> STEEL_PUMPKIN = registerPlantEntityType(SteelPumpkinEntity::new, "steel_pumpkin");

	public static final RegistryObject<EntityType<IceCabbagePultEntity>> ICE_CABBAGE_PULT = registerPlantEntityType(IceCabbagePultEntity::new, "ice_cabbage_pult");



	/**
	 * bullets
	 */
	public static final RegistryObject<EntityType<IceCabbageEntity>> ICE_CABBAGE = registerEntityType(IceCabbageEntity::new, "ice_cabbage", EntityClassification.MISC);



	/*
	  zombies
	 */
	public static final RegistryObject<EntityType<Edgar090547Entity>> EDGAR_090547 = registerZombieEntityType(Edgar090547Entity::new, "edgar_090547");

	public static final RegistryObject<EntityType<FlowerPotZombieEntity>> FLOWER_POT_ZOMBIE = registerZombieEntityType(FlowerPotZombieEntity::new, "flower_pot_zombie");

	public static final RegistryObject<EntityType<AirborneZombieEntity>> AIRBORNE_ZOMBIE = registerZombieEntityType(AirborneZombieEntity::new, "airborne_zombie");


	public static final RegistryObject<EntityType<MCZombieEntity>> MC_ZOMBIE = registerZombieEntityType(MCZombieEntity::new, "mc_zombie");

	public static final RegistryObject<EntityType<SteelPumpkinZombieEntity>> STEEL_PUMPKIN_ZOMBIE = registerZombieEntityType(SteelPumpkinZombieEntity::new, "steel_pumpkin_zombie");

	/**ZA
	 * plants
	 */
      //////////////////////////////////////////////////
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onClientSetUpEvent(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(ICE_CABBAGE.get(), IceCabbageRender::new);

		// zombies
		RenderingRegistry.registerEntityRenderingHandler(EDGAR_090547.get(), Edgar090547Render::new);

		RenderingRegistry.registerEntityRenderingHandler(FLOWER_POT_ZOMBIE.get(), FlowerPotZombieRender::new);

		RenderingRegistry.registerEntityRenderingHandler(AIRBORNE_ZOMBIE.get(), AirborneZombieRender::new);

		RenderingRegistry.registerEntityRenderingHandler(MC_ZOMBIE.get(), MCZombieRender::new);

		RenderingRegistry.registerEntityRenderingHandler(STEEL_PUMPKIN_ZOMBIE.get(), SteelPumpkinZombieRender::new);

		// plants

		RenderingRegistry.registerEntityRenderingHandler(STEEL_PUMPKIN.get(), SteelPumpkinRender::new);

		RenderingRegistry.registerEntityRenderingHandler(ICE_CABBAGE_PULT.get(), IceCabbagePultRender::new);

	}



	private static <T extends PVZPlantEntity> RegistryObject<EntityType<T>> registerPlantEntityType(IFactory<T> factory, String name){
		return ENTITY_TYPES.register(name, () -> {return EntityType.Builder.of(factory, PVZEntityClassifications.PVZ_PLANT).build(StringUtil.prefix(name).toString());});
	}
	private static <T extends PVZZombieEntity> RegistryObject<EntityType<T>> registerZombieEntityType(IFactory<T> factory, String name){
		return ENTITY_TYPES.register(name, () -> {return EntityType.Builder.of(factory, PVZEntityClassifications.PVZ_ZOMBIE).fireImmune().build(StringUtil.prefix(name).toString());});
	}


	private static <T extends Entity> RegistryObject<EntityType<T>> registerEntityType(IFactory<T> factory, String name, EntityClassification classification){
		return ENTITY_TYPES.register(name, () -> {return EntityType.Builder.of(factory, classification).build(StringUtil.prefix(name).toString());});
	}
	
	private static <T extends Entity> RegistryObject<EntityType<T>> registerImmuneFireEntityType(IFactory<T> factory, String name, EntityClassification classification){
		return ENTITY_TYPES.register(name, () -> {return EntityType.Builder.of(factory, classification).fireImmune().build(StringUtil.prefix(name).toString());});
	}
	
	private static <T extends Entity> RegistryObject<EntityType<T>> registerEntityType(IFactory<T> factory, String name, EntityClassification classification, float w, float h){
		return ENTITY_TYPES.register(name, () -> {return EntityType.Builder.of(factory, classification).sized(w, h).build(StringUtil.prefix(name).toString());});
	}




}
