package com.susen36.pvzadd.common.entity.zombie.add;

import com.hungteen.pvz.common.entity.zombie.grass.NormalZombieEntity;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.susen36.pvzadd.common.impl.zombie.add.AddZombies;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class MCZombieEntity extends NormalZombieEntity {



    public MCZombieEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }


   // public static AttributeModifierMap.MutableAttribute createAttributes() {
   //     return MobEntity.createMobAttributes().add(Attributes.ARMOR, 2.0D);
   // }
    @Override
    public float getLife() {
        return 20;
    }

    @Override
    protected float getWaterSlowDown() {
        return 0.91f;
    }

    @Override
    public ZombieType getZombieType() {
        return AddZombies.MC_ZOMBIE;
    }



}