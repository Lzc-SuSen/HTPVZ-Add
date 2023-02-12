package com.susen36.pvzadd.common.item;


import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.item.PVZItemGroups;
import com.hungteen.pvz.common.item.misc.PVZFoodItem;
import com.hungteen.pvz.common.item.spawn.card.PlantCardItem;
import com.hungteen.pvz.utils.enums.Colors;
import com.mojang.datafixers.util.Pair;
import com.susen36.pvzadd.PVZAdd;
import com.susen36.pvzadd.common.block.BlockRegister;
import com.susen36.pvzadd.common.entity.EntityRegister;
import com.susen36.pvzadd.common.impl.plant.AddPlants;
import com.susen36.pvzadd.common.item.food.FoodItem;
import com.susen36.pvzadd.common.item.sapling.WisdomSaplingItem;
import com.susen36.pvzadd.common.item.sapling.XpSaplingItem;
import com.susen36.pvzadd.common.item.spawn.egg.PVZAddSpawnEggItem;
import com.susen36.pvzadd.common.item.spawn.token.DaveToken;
import com.susen36.pvzadd.common.item.spawn.token.SunDaveToken;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PVZAdd.MOD_ID);


  	/*
  	 * Items in Food Tab.
  	 */

    public static final RegistryObject<Item> ICE_CABBAGE = ITEMS.register("ice_cabbage", ()->new PVZFoodItem(FoodItem.ICE_CABBAGE));


    public static final RegistryObject<Item> XP_SAPLING = ITEMS.register("xp_sapling", () -> new XpSaplingItem());

    public static final RegistryObject<Item> WISDOM_SAPLING = ITEMS.register("wisdom_sapling", () -> new WisdomSaplingItem());


    /* token */
    public static final RegistryObject<Item> DAVE_TOKEN = ITEMS.register("dave_token", () -> new DaveToken());

    public static final RegistryObject<Item> SUN_DAVE_TOKEN = ITEMS.register("sun_dave_token", () -> new SunDaveToken());

    /* spawn eggs */


   public static final RegistryObject<PVZAddSpawnEggItem> EDGAR_090547_SPAWN_EGG = registerSpawnEgg("edgar_090547",
           EntityRegister.EDGAR_090547,  Colors.ZOMBIE_COLOR, new Item.Properties().tab(PVZItemGroups.PVZ_MISC));
  

    public static final RegistryObject<PVZAddSpawnEggItem> FLOWER_POT_ZOMBIE_SPAWN_EGG = registerSpawnEgg("flower_pot_zombie",
            EntityRegister.FLOWER_POT_ZOMBIE,  Colors.ZOMBIE_COLOR, new Item.Properties().tab(PVZItemGroups.PVZ_MISC));


    public static final RegistryObject<PVZAddSpawnEggItem> AIRBORNE_ZOMBIE_SPAWN_EGG = registerSpawnEgg("airborne_zombie",
            EntityRegister.AIRBORNE_ZOMBIE,  Colors.ZOMBIE_COLOR, new Item.Properties().tab(PVZItemGroups.PVZ_MISC));



    public static final RegistryObject<PVZAddSpawnEggItem> STEEL_PUMPKIN_ZOMBIE_SPAWN_EGG = registerSpawnEgg("steel_pumpkin_zombie",
            EntityRegister.STEEL_PUMPKIN_ZOMBIE,  Colors.ZOMBIE_COLOR, new Item.Properties().tab(PVZItemGroups.PVZ_MISC));

    public static final RegistryObject<PVZAddSpawnEggItem> TARGET_ARROW_ZOMBIE_SPAWN_EGG = registerSpawnEgg("target_arrow_zombie",
            EntityRegister.TARGET_ARROW_ZOMBIE,  Colors.ZOMBIE_COLOR, new Item.Properties().tab(PVZItemGroups.PVZ_MISC));

   // public static final RegistryObject<PVZAddSpawnEggItem> BARGE_NUT = registerSpawnEgg("barge_nut",
   //         EntityRegister.BARGE_NUT,  Colors.ZOMBIE_COLOR, new Item.Properties().tab(PVZItemGroups.PVZ_MISC));
   //

    /*
  	 * Items in Plant Cards Tab.
  	 */

    public static final RegistryObject<PlantCardItem> STEEL_PUMPKIN_CARD = registerCard((IPlantType) AddPlants.STEEL_PUMPKIN, false);
    public static final RegistryObject<PlantCardItem> STEEL_PUMPKIN_ENJOY_CARD = registerCard((IPlantType) AddPlants.STEEL_PUMPKIN, true);
    public static final RegistryObject<PlantCardItem> ICE_CABBAGE_PULT_CARD = registerCard((IPlantType) AddPlants.ICE_CABBAGE_PULT, false);
    public static final RegistryObject<PlantCardItem> ICE_CABBAGE_PULT_ENJOY_CARD = registerCard((IPlantType) AddPlants.ICE_CABBAGE_PULT, true);

    //public static final RegistryObject<PlantCardItem> BARGE_NUT_PULT_CARD = registerCard((IPlantType) AddPlants.BARGE_NUT, false);
    //public static final RegistryObject<PlantCardItem> BARGE_NUT_PULT_ENJOY_CARD = registerCard((IPlantType) AddPlants.BARGE_NUT, true);

    //block

    public static final RegistryObject<BlockItem> STEEL_PUMPKIN = ITEMS.register("steel_pumpkin",() -> new BlockItem(BlockRegister.STEEL_PUMPKIN.get(), new Item.Properties().tab(PVZItemGroups.PVZ_MISC)));





    /**
     * register spawn eggs
     */
    private static RegistryObject<PVZAddSpawnEggItem> registerSpawnEgg(String name, RegistryObject<? extends EntityType<?>> entityType, Pair<Integer, Integer> color, Item.Properties tab){
    	return ITEMS.register(name + "_spawn_egg", () -> new PVZAddSpawnEggItem(entityType, color.getFirst(), color.getSecond(), new Item.Properties().tab(PVZItemGroups.PVZ_MISC)));
    }

    private static RegistryObject<PlantCardItem> registerCard(IPlantType plant, boolean is){
    	String name = plant.toString();
    	if(is) {
            name = name + "_enjoy";
        }
    	name = name + "_card";
    	return ITEMS.register(name, () -> new PlantCardItem(plant, is));
    }
}
