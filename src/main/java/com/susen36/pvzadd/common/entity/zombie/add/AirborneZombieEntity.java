package com.susen36.pvzadd.common.entity.zombie.add;

import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.hungteen.pvz.common.misc.PVZEntityDamageSource;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.ZombieUtil;
import com.susen36.pvzadd.common.impl.zombie.add.AddZombies;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.controller.FlyingMovementController;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.FlyingPathNavigator;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import java.util.Objects;

public class AirborneZombieEntity extends PVZZombieEntity {


    private static final DataParameter<Boolean> HAS_LINE = EntityDataManager.defineId(AirborneZombieEntity.class, DataSerializers.BOOLEAN);
    private final MovementController FlyController = new FlyingMovementController(this, 360, true);
    private final MovementController GroundController = new MovementController(this);
    private PathNavigator FlyNavigator;
    private PathNavigator GroundNavigator;

    public AirborneZombieEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(HAS_LINE, true);
    }

    @Override
    protected void registerGoals() {
        //define at here to avoid crash.
        this.FlyNavigator = new FlyingPathNavigator(this, level);
        this.GroundNavigator = new GroundPathNavigator(this, level);
        super.registerGoals();
    }

    @Override
    protected void initAttributes() {
        super.initAttributes();
        Objects.requireNonNull(this.getAttribute(Attributes.FLYING_SPEED)).setBaseValue(ZombieUtil.FLY_FAST);
        this.setNoGravity(this.hasLine());
        this.moveControl = this.hasLine() ? FlyController : GroundController;
    }

    @Override
    public void onSyncedDataUpdated(DataParameter<?> data) {
        super.onSyncedDataUpdated(data);
        if(data.equals(HAS_LINE)) {
            this.setNoGravity(this.hasLine());
            this.moveControl = this.hasLine() ? FlyController : GroundController;
        }
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if(this.hasLine() && this.canHitLine(source)) {
            this.onLineExplode();
            amount = 0;
        }
        return super.hurt(source, amount);
    }

    private boolean canHitLine(DamageSource source) {

        if(source instanceof PVZEntityDamageSource) {
            return ((PVZEntityDamageSource) source).isIceDamage();
        }
        return false;
    }


    public void onLineExplode(){
        if(! level.isClientSide) {
            EntityUtil.playSound(this, SoundEvents.WOOL_FALL);
        }
        this.setLine(false);
    }





    @Override
    public boolean canClimbWalls() {
        return super.canClimbWalls() && ! this.hasLine();
    }

   // @Override
   // public boolean canBeAttractedBy(ICanAttract defender) {
      //  return ! this.hasLine();
   // }

    @Override
    public float getLife() {
        return 40;
    }

    @Override
    public float getWalkSpeed() {
        return ZombieUtil.WALK_LITTLE_SLOW;
    }

    @Override
    public boolean canBeButtered() {
        return ! this.hasLine();
    }


    @Override
    public PathNavigator getNavigation() {
        if(this.hasLine()) {
            if(! (this.navigation instanceof FlyingPathNavigator)) {
                this.navigation = this.FlyNavigator;
            }
        } else {
            if(! (this.navigation instanceof GroundPathNavigator)) {
                this.navigation = this.GroundNavigator;
            }
        }
        return super.getNavigation();
    }



    @Override
    public void readAdditionalSaveData(CompoundNBT compound) {
        super.readAdditionalSaveData(compound);
        if(compound.contains("has_line")) {
            this.setLine(compound.getBoolean("has_line"));
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundNBT compound) {
        super.addAdditionalSaveData(compound);
        compound.putBoolean("has_line", this.hasLine());
    }

    public void setLine(boolean has) {
        this.entityData.set(HAS_LINE, has);
    }

    public boolean hasLine() {
        return this.entityData.get(HAS_LINE);
    }

    @Override
    public ZombieType getZombieType() {
        return AddZombies.AIRBORNE_ZOMBIE;
    }

}