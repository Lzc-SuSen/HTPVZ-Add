package com.susen36.pvzadd.client.render.entity.zombie.add;

import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.susen36.pvzadd.client.model.entity.zombie.add.TargetArrowZombieModel;
import com.susen36.pvzadd.common.entity.zombie.add.TargetArrowZombieEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;

public class TargetArrowZombieRender extends PVZZombieRender<TargetArrowZombieEntity> {
    public TargetArrowZombieRender(EntityRendererManager rendererManager) {
        super(rendererManager, new TargetArrowZombieModel(), 0.5F);
    }
}