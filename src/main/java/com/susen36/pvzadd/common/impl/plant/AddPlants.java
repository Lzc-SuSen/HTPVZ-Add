package com.susen36.pvzadd.common.impl.plant;


import com.hungteen.pvz.api.PVZAPI;
import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.impl.CoolDowns;
import com.hungteen.pvz.common.impl.EssenceTypes;
import com.hungteen.pvz.common.impl.RankTypes;
import com.hungteen.pvz.common.impl.SkillTypes;
import com.hungteen.pvz.common.impl.plant.PlantType;
import com.susen36.pvzadd.PVZAdd;
import com.susen36.pvzadd.client.model.entity.plant.defence.SteelPumpkinModel;
import com.susen36.pvzadd.client.model.entity.plant.ice.IceCabbagePultModel;
import com.susen36.pvzadd.common.entity.EntityRegister;
import com.susen36.pvzadd.common.item.ItemRegister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class AddPlants extends PlantType {

	private static final List<IPlantType> LIST = new ArrayList<>();



	//Steel Pumpkin
	public static final IPlantType STEEL_PUMPKIN = new AddPlants("steel_pumpkin", new PlantFeatures()
			.cost(225).requiredLevel(55)
			.cd(CoolDowns.SLOW).rank(RankTypes.BLUE).essence(EssenceTypes.DEFENCE)
			.entityType(() -> EntityRegister.STEEL_PUMPKIN.get())
			.summonCard(() -> ItemRegister.STEEL_PUMPKIN_CARD.get())
			.enjoyCard(() -> ItemRegister.STEEL_PUMPKIN_ENJOY_CARD.get())
			.plantModel(() -> SteelPumpkinModel::new).scale(0.9F)
			.cdSkill(Arrays.asList())
	);
//	public static final IPlantType BARGE_NUT = new AddPlants("barge_nut", new PlantFeatures()
//			.cost(225).requiredLevel(55)
//			.cd(CoolDowns.SLOW).rank(RankTypes.BLUE).essence(EssenceTypes.MAGIC)
//			.entityType(() -> EntityRegister.BARGE_NUT.get())
//			.summonCard(() -> ItemRegister.BARGE_NUT_PULT_CARD.get())
//			.enjoyCard(() -> ItemRegister.BARGE_NUT_PULT_ENJOY_CARD.get())
//			//.plantModel(() -> WallNutModel::new).scale(0.9F)
//			.cdSkill(Arrays.asList())
//	);

	/*
	 * Ice Cabbage
	 */
	public static final IPlantType ICE_CABBAGE_PULT = new AddPlants("ice_cabbage_pult", new PlantFeatures()
			.cost(175).requiredLevel(23)
			.cd(CoolDowns.VERY_FAST).rank(RankTypes.BLUE).essence(EssenceTypes.ICE)
			.entityType(() -> EntityRegister.ICE_CABBAGE_PULT.get())
			.summonCard(() -> ItemRegister.ICE_CABBAGE_PULT_CARD.get())
			.enjoyCard(() -> ItemRegister.ICE_CABBAGE_PULT_ENJOY_CARD.get())
			.plantModel(() -> IceCabbagePultModel::new).scale(0.95F)
			.commonSkill(Arrays.asList(SkillTypes.MORE_CABBAGE_DAMAGE)));

	public static void register() {
		PVZAPI.get().registerPlantTypes(LIST);
	}

	private AddPlants(String name, PlantFeatures features) {
		super(name, features);
		LIST.add(this);

	}



	@Override
	public String getModID() {
		return PVZAdd.MOD_ID;
	}



	@Override
	public int getSortPriority() {
		return 80;
	}


	@Override
	public String getCategoryName() {
		return "pvzadd";
	}
}
