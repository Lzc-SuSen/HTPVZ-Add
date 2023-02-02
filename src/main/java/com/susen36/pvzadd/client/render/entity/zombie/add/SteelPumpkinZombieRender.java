package com.susen36.pvzadd.client.render.entity.zombie.add;

import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.susen36.pvzadd.client.model.entity.zombie.add.SteelPumpkinZombieModel;
import com.susen36.pvzadd.common.entity.zombie.add.SteelPumpkinZombieEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SteelPumpkinZombieRender extends PVZZombieRender<SteelPumpkinZombieEntity> {

    public SteelPumpkinZombieRender(EntityRendererManager rendererManager) {
        super(rendererManager, new SteelPumpkinZombieModel(), 1F);
    }

}