package com.susen36.pvzadd.client.render.entity.zombie.add;

import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.susen36.pvzadd.client.model.entity.zombie.add.FlowerPotZombieModel;
import com.susen36.pvzadd.common.entity.zombie.add.FlowerPotZombieEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FlowerPotZombieRender extends PVZZombieRender<FlowerPotZombieEntity>{
	
	public FlowerPotZombieRender(EntityRendererManager rendererManager){
		super(rendererManager, new FlowerPotZombieModel(), 0.5F);
	}

}
