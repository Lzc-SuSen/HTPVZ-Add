package com.susen36.pvzadd.common.entity.zombie.add;

import com.hungteen.pvz.common.entity.zombie.grass.NormalZombieEntity;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.susen36.pvzadd.common.impl.zombie.add.AddZombies;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class MCZombieEntity extends NormalZombieEntity {



    public MCZombieEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }



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


    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MonsterEntity.createMonsterAttributes().add(Attributes.ARMOR, 2.0);
    }

}
