package com.susen36.pvzadd.common.entity.zombie.add;

import com.hungteen.pvz.common.entity.plant.base.PlantPultEntity;
import com.hungteen.pvz.common.entity.zombie.base.DefenceZombieEntity;
import com.hungteen.pvz.common.entity.zombie.body.ZombieDropBodyEntity;
import com.hungteen.pvz.common.entity.zombie.part.PVZHealthPartEntity;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.hungteen.pvz.common.misc.PVZEntityDamageSource;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.hungteen.pvz.utils.EffectUtil;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.ZombieUtil;
import com.susen36.pvzadd.common.impl.zombie.add.AddZombies;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class TargetArrowZombieEntity extends DefenceZombieEntity {

    public TargetArrowZombieEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }










    @Override
    public SoundEvent getPartHurtSound() {
        return SoundEvents.WOOL_FALL;
    }



    @Override
    protected void initAttributes() {
        super.initAttributes();
    }

    @Override
    public void resetParts() {
        removeParts();
        this.part = new PVZHealthPartEntity(this, 1f, 1f);
        this.part.setOwner(this);
    }

    @Override
    protected float getPartHeightOffset() {
        if(this.isMiniZombie()) return 0.2F;
        return 0.7f;
    }

    @Override
    public void onOuterDefenceBroken() {
        super.onOuterDefenceBroken();
        if(! this.level.isClientSide){
            this.addEffect(EffectUtil.effect(Effects.MOVEMENT_SPEED, 120000, 1));
            EntityUtil.playSound(this, SoundRegister.ZOMBIE_ANGRY.get());
        }
    }

    @Override
    public boolean canLostHand() {
        return super.canLostHand() && !this.canPartsExist();
    }

    @Override
    protected void setBodyStates(ZombieDropBodyEntity body) {
        super.setBodyStates(body);
        body.setHandDefence(this.canPartsExist());
    }

    @Override
    public SoundEvent getPartDeathSound() {
        return SoundEvents.SHIELD_BLOCK;
    }

    @Override
    public float getWalkSpeed() {
        return ZombieUtil.WALK_LITTLE_SLOW;
    }


    @Override
    public boolean hurt(DamageSource source, float amount) {
        if(this.canPartsExist() && this.canHit(source)){

            return false;
        }
        return super.hurt(source, amount);
    }

    private boolean canHit(DamageSource source) {

        if(source instanceof PVZEntityDamageSource) {
            return ((PVZEntityDamageSource) source).isParabola();
        }
        return false;
    }
    @Override
    public boolean canBeTargetBy(LivingEntity living) {
        if(living instanceof PlantPultEntity && this.canPartsExist()){
            return false;
        }
        return super.canBeTargetBy(living);
    }

    @Override
    public float getLife() {
        return 22;
    }

    @Override
    public float getOuterLife() {
        return 24;
    }
    @Override
    public ZombieType getZombieType() {
        return AddZombies.TARGET_ARROW_ZOMBIE;
    }
}
