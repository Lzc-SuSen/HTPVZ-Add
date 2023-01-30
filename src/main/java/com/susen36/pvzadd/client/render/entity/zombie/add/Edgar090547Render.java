package com.susen36.pvzadd.client.render.entity.zombie.add;

import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.susen36.pvzadd.client.model.entity.zombie.add.Edgar090547Model;
import com.susen36.pvzadd.common.entity.zombie.add.Edgar090547Entity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class Edgar090547Render extends PVZZombieRender<Edgar090547Entity> {

	public Edgar090547Render(EntityRendererManager rendererManager) {
		super(rendererManager, new Edgar090547Model<>(), 1F);
	}

}
