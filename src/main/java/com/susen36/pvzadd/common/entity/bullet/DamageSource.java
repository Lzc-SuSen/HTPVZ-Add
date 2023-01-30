package com.susen36.pvzadd.common.entity.bullet;

import com.hungteen.pvz.common.misc.PVZEntityDamageSource;
import com.susen36.pvzadd.common.entity.bullet.itembullet.IceCabbageEntity;
import net.minecraft.entity.Entity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DamageSource extends PVZEntityDamageSource {

    private final List<EffectInstance> effects = new ArrayList<>();
    private Entity attackOwner = null;
    private Entity attacker = null;
    private boolean isAppease = false;//shooter.
    private boolean isParabola = false;//pult.
    private boolean isIceDamage = false;

    private boolean isDefended = false;// is defended by some defence. such as snow pea hit screen door.
    //explosion must hurt every zombies.
    private int damageCount = 0;




    public DamageSource(String name, Entity attacker) {
        this(name, attacker, attacker);
    }

    public DamageSource(String name, Entity damagingEntity, Entity attacker) {
        super(name, attacker);
        this.attacker = damagingEntity;
        this.attackOwner = attacker;
    }

    //projectiles


    public static DamageSource iceCabbage(IceCabbageEntity pea, Entity shooter) {
        return new DamageSource("ice_cabbage", pea, shooter).setParabola().setIceDamage();
    }


    //ice
    public static DamageSource causeIceDamage(Entity projectile, Entity shooter) {
        return new DamageSource("ice", projectile, shooter).setIceDamage();
    }

    public static DamageSource causeIceDamage(Entity attacker) {
        return causeIceDamage(attacker, attacker);
    }








    @Override
    public Entity getEntity() {
        return this.attackOwner;
    }

    @Override
    public Entity getDirectEntity() {
        return this.attacker;
    }

    /**
     * Gets the location from which the damage originates.
     */
    @Nullable
    public Vector3d getSourcePosition() {
        return this.attacker != null ? this.attacker.position() : null;
    }



    public int getDamageCount() {
        return this.damageCount;
    }

    //handle effects.

    public void addEffect(Optional<EffectInstance> instance) {
        this.effects.add(instance.get());
    }

    public List<EffectInstance> getEffects(){
        return this.effects;
    }

    public void setDefended(boolean is) {
        this.isDefended = is;
    }

    /**
     * if true, effect can not be apply on target.
     */
    public boolean isDefended() {
        return this.isDefended;
    }

    //getter and setter.
    public boolean isAppease() {
        return isAppease;
    }

    public DamageSource setAppease() {
        this.isAppease = true;
        this.setProjectile();
        return this;
    }

    public boolean isParabola() {
        return isParabola;
    }

    public DamageSource setParabola() {
        this.isParabola = true;
        this.setProjectile();
        return this;
    }

    public boolean isIceDamage() {
        return isIceDamage;
    }

    public DamageSource setIceDamage() {
        this.isIceDamage = true;
        return this;
    }





}