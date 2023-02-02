package com.susen36.pvzadd.common.entity.plant.defence;


import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.entity.plant.base.PlantDefenderEntity;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.susen36.pvzadd.common.impl.plant.AddPlants;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;


public class SteelPumpkinEntity extends PlantDefenderEntity {


	
	public SteelPumpkinEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
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



	public void aiStep() {
		if (this.hasMetal()) {
			if(! this.level.isClientSide) {

				this.addEffect(new EffectInstance(Effects.HEAL, 20,5));
				this.decreaseMetal();

			}}

		super.aiStep();
	}
	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundRegister.METAL_HIT.get();
	}
}