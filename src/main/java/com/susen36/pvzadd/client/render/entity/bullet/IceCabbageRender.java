package com.susen36.pvzadd.client.render.entity.bullet;

import com.hungteen.pvz.client.render.entity.bullet.BulletRender;
import com.susen36.pvzadd.common.entity.bullet.itembullet.IceCabbageEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
@OnlyIn(Dist.CLIENT)
public class IceCabbageRender extends BulletRender<IceCabbageEntity> {

	public IceCabbageRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn);
	}

	@Override
	protected float getScaleByEntity(IceCabbageEntity entity) {
		return 1.4F;
	}

}
