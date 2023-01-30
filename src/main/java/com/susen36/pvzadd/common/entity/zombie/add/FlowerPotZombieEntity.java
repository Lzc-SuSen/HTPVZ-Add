package com.susen36.pvzadd.common.entity.zombie.add;

import com.hungteen.pvz.common.entity.zombie.base.DefenceZombieEntity;
import com.hungteen.pvz.common.entity.zombie.body.ZombieDropBodyEntity;
import com.hungteen.pvz.common.entity.zombie.part.PVZHealthPartEntity;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.hungteen.pvz.utils.EffectUtil;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.ZombieUtil;
import com.susen36.pvzadd.common.impl.zombie.add.AddZombies;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class FlowerPotZombieEntity extends DefenceZombieEntity {

    public FlowerPotZombieEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
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
        return super.canLostHand() && this.isAngry();
    }

    @Override
    protected void setBodyStates(ZombieDropBodyEntity body) {
        super.setBodyStates(body);
        body.setHandDefence(! this.isAngry());
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
    public float getLife() {
        return 22;
    }

    @Override
    public float getOuterLife() {
        return 22;
    }

    public boolean isAngry() {
        return ! this.canPartsExist();
    }

    @Override
    public ZombieType getZombieType() {
        return AddZombies.FLOWER_POT_ZOMBIE;
    }

}