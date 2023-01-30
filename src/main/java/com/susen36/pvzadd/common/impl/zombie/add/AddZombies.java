package com.susen36.pvzadd.common.impl.zombie.add;


import com.hungteen.pvz.api.types.IZombieType;
import com.hungteen.pvz.client.model.entity.zombie.roof.EdgarRobotModel;
import com.hungteen.pvz.common.impl.RankTypes;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.susen36.pvzadd.PVZAdd;
import com.susen36.pvzadd.client.model.entity.zombie.add.AirborneZombieModel;
import com.susen36.pvzadd.client.model.entity.zombie.add.FlowerPotZombieModel;
import com.susen36.pvzadd.client.model.entity.zombie.add.MCZombieModel;
import com.susen36.pvzadd.common.entity.EntityRegister;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class AddZombies extends com.hungteen.pvz.common.impl.zombie.ZombieType {
	
	private static final List<IZombieType> LIST = new ArrayList<>();
	
	/*
	 * zombotany.
	 */
	
	public static final ZombieType EDGAR_090547 = new AddZombies("edgar_090547", new ZombieFeatures()
		    .rank(RankTypes.PURPLE).xp(50)
			.entityType(() -> EntityRegister.EDGAR_090547.get())
			.zombieModel(() -> EdgarRobotModel::new).scale(0.5F)
			//.loot(PVZAddLoot.EDGAR_090547)
			.eatCommonSkill(Arrays.asList())
	);



	public static final ZombieType FLOWER_POT_ZOMBIE = new AddZombies("flower_pot_zombie", new ZombieFeatures()
			.rank(RankTypes.GREEN).xp(10)
			.entityType(() -> EntityRegister.FLOWER_POT_ZOMBIE.get())
			.zombieModel(() -> FlowerPotZombieModel::new).scale(0.5F)
			.eatCommonSkill(Arrays.asList())
	);


	public static final ZombieType AIRBORNE_ZOMBIE = new AddZombies("airborne_zombie", new ZombieFeatures()
			.rank(RankTypes.GREEN).xp(10)
			.entityType(() -> EntityRegister.AIRBORNE_ZOMBIE.get())
			.zombieModel(() -> AirborneZombieModel::new).scale(0.5F)
			.eatCommonSkill(Arrays.asList())
	);

	public static final ZombieType MC_ZOMBIE = new AddZombies("mc_zombie", new ZombieFeatures()
			.rank(RankTypes.WHITE).xp(5)
			.entityType(() -> EntityRegister.MC_ZOMBIE.get())
			.zombieModel(() -> MCZombieModel::new).scale(0.5F)
			.eatCommonSkill(Arrays.asList())
	);
	public static void register() {
		registerZombies(LIST);
	}
	
	private AddZombies(String name, ZombieFeatures features) {
		super(name, features);
		LIST.add(this);
	}

	@Override
	public int getSortPriority() {
		return 80;
	}

	@Override
	public String getCategoryName() {
		return "add";
	}

	@Override
	public String getModID() {
		return PVZAdd.MOD_ID;
	}

	@Override
	protected ResourceLocation getEntityResource() {
		return new ResourceLocation(this.getModID(), "textures/entity/zombie/" + this.getCategoryName() + "/" + this.toString() + ".png");
	}

}
