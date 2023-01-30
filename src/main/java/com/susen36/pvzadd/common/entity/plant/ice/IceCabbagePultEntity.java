package com.susen36.pvzadd.common.entity.plant.ice;

import com.hungteen.pvz.api.interfaces.IIceEffect;
import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.entity.bullet.PultBulletEntity;
import com.hungteen.pvz.common.entity.plant.arma.CabbagePultEntity;
import com.hungteen.pvz.common.potion.EffectRegister;
import com.susen36.pvzadd.common.entity.bullet.itembullet.IceCabbageEntity;
import com.susen36.pvzadd.common.impl.SkillTypes;
import com.susen36.pvzadd.common.impl.plant.AddPlants;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

import java.util.Optional;



public class IceCabbagePultEntity extends CabbagePultEntity implements IIceEffect {

	public IceCabbagePultEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
	}

	@Override
	protected PultBulletEntity createBullet() {
		return new IceCabbageEntity(level, this);
	}

	@Override
	public float getAttackDamage() {
		return this.getSkillValue(SkillTypes.MORE_CABBAGE_DAMAGE);
	}


	private static final int FROZEN_TICK = 40;

	public int getColdDuration() {
		return 60;
	}

	@Override
	public Optional<EffectInstance> getColdEffect() {
		return Optional.of(new EffectInstance(EffectRegister.COLD_EFFECT.get(), FROZEN_TICK + this.getColdDuration(), 2, false, false));
	}

	@Override
	public Optional<EffectInstance> getFrozenEffect() {
		return Optional.of(new EffectInstance(EffectRegister.FROZEN_EFFECT.get(), FROZEN_TICK, 1, false, false));
	}
	@Override
	public float getSuperDamage() {
		return this.getAttackDamage() + 20;
	}

	@Override
	public EntitySize getDimensions(Pose poseIn) {
		return EntitySize.scalable(0.8F, 1F);
	}

	@Override
	public IPlantType getPlantType() {
		return AddPlants.ICE_CABBAGE_PULT;
	}

}
