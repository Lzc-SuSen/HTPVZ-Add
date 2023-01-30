package com.susen36.pvzadd.client.render.entity.zombie.add;

import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.susen36.pvzadd.client.model.entity.zombie.add.MCZombieModel;
import com.susen36.pvzadd.common.entity.zombie.add.MCZombieEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MCZombieRender extends PVZZombieRender<MCZombieEntity> {

	public MCZombieRender(EntityRendererManager rendererManager) {
		super(rendererManager, new MCZombieModel(), 1F);
	}

}
