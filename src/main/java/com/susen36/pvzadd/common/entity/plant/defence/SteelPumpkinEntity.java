package com.susen36.pvzadd.common.entity.plant.defence;


import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.entity.plant.base.PlantDefenderEntity;
import com.hungteen.pvz.common.entity.plant.defence.PumpkinEntity;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.susen36.pvzadd.common.impl.plant.AddPlants;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.List;


public class SteelPumpkinEntity extends PlantDefenderEntity {


	private static final DataParameter<Boolean> IS_SOILD = EntityDataManager.defineId(SteelPumpkinEntity.class, DataSerializers.BOOLEAN);

	public SteelPumpkinEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
		this.canCollideWithPlant = false;
	}


	@Override
	public float getLife() {
		return 500;
	}

	@Override
	public float getSuperLife() {
		return 800;
	}

	@Override
	public EntitySize getDimensions(Pose poseIn) {
		return EntitySize.scalable(0.8f, 1.3f);
	}

	@Override
	public IPlantType getPlantType() {
		return AddPlants.STEEL_PUMPKIN;
	}

    @Override
	public void aiStep() {
		if (!this.level.isClientSide) {

			if (this.hasMetal()) {

				this.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 200, 5));
				this.heal(100);
				this.decreaseMetal();
			}
			/////////////////////////
			this.checkInsideBlocks();
			List<LivingEntity> list = this.level.getEntitiesOfClass(LivingEntity.class, this.getBoundingBox());
			if (!list.isEmpty()) {
				if ( this.random.nextInt(4) == 0) {

					boolean flag = !(this.getControllingPassenger() instanceof PlayerEntity);

					for (int j = 0; j < list.size(); ++j) {
						Entity entity = list.get(j);
						if (!entity.hasPassenger(this)) {
							if (flag && this.getPassengers().size() < 1 && !entity.isPassenger() && entity.getBbWidth() < this.getBbWidth() && entity instanceof PVZPlantEntity && !(entity instanceof PumpkinEntity) && !(entity instanceof PlayerEntity)) {
								entity.startRiding(this);
								this.hasPlant();
							}
						}else{setSolid(true);}
					}
				}

			}
			}

			super.aiStep();
		}

	public void positionRider(Entity p_184232_1_) {
		if (this.hasPassenger(p_184232_1_)) {
			float f = 0.0F;
			if (this.getPassengers().size() > 1) {
				int i = this.getPassengers().indexOf(p_184232_1_);
				if (i == 0) {
					f = 0.2F;
				} else {
					f = -0.6F;
				}

				if (p_184232_1_ instanceof AnimalEntity) {
					f = (float)((double)f + 0.2);
				}
			}

			Vector3d vector3d = (new Vector3d((double)f, 0.0, 0.0)).yRot(-this.yRot * 0.017453292F - 1.5707964F);
			p_184232_1_.setPos(this.getX() + vector3d.x, this.getY(), this.getZ() + vector3d.z);

			p_184232_1_.setYHeadRot(p_184232_1_.getYHeadRot() );
			if (p_184232_1_ instanceof AnimalEntity && this.getPassengers().size() > 1) {
				int j = p_184232_1_.getId() % 2 == 0 ? 90 : 270;
				p_184232_1_.setYBodyRot(((AnimalEntity)p_184232_1_).yBodyRot + (float)j);
				p_184232_1_.setYHeadRot(p_184232_1_.getYHeadRot() + (float)j);
			}
		}

	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundRegister.METAL_HIT.get();
	}


	//@OnlyIn(Dist.CLIENT)
	//public void onPassengerTurned(Entity p_184190_1_) {
    //this.Rotation(p_184190_1_);
    //}
	@Override
	public void readAdditionalSaveData(CompoundNBT compound) {
		super.readAdditionalSaveData(compound);
		if(compound.contains("is_solid")) {
			this.setSolid(compound.getBoolean("is_solid"));
		}
	}

	@Override
	public void addAdditionalSaveData(CompoundNBT compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("is_solid", this.isSolid());
	}
	public void setSolid(boolean has) {
		this.entityData.set(IS_SOILD, has);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(IS_SOILD, true);
	}

	public void hasPlant(){
		if(! level.isClientSide) {
			SoundRegister.METAL_HIT.get();;
		}
		this.setSolid(false);

	}
	public boolean isSolid() {
		return this.entityData.get(IS_SOILD);
	}

}

