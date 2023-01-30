package com.susen36.pvzadd.common.entity.bullet.itembullet;


import com.hungteen.pvz.common.entity.bullet.PultBulletEntity;
import com.susen36.pvzadd.common.entity.EntityRegister;
import com.susen36.pvzadd.common.entity.bullet.DamageSource;
import com.susen36.pvzadd.common.entity.plant.ice.IceCabbagePultEntity;
import com.susen36.pvzadd.common.item.ItemRegister;
import net.minecraft.entity.*;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(value = Dist.CLIENT, _interface = IRendersAsItem.class)
public class IceCabbageEntity extends PultBulletEntity implements IRendersAsItem {

	public IceCabbageEntity(EntityType<?> type, World worldIn) {
		super(type, worldIn);
	}

	public IceCabbageEntity(World worldIn, LivingEntity shooter) {
		super(EntityRegister.ICE_CABBAGE.get(), worldIn, shooter);
	}

	protected void dealDamage(Entity target) {
		DamageSource source = DamageSource.iceCabbage(this, this.getThrower());
		if(this.getThrower() instanceof IceCabbagePultEntity) {
			source.addEffect(((IceCabbagePultEntity) this.getThrower()).getFrozenEffect());
			source.addEffect(((IceCabbagePultEntity) this.getThrower()).getColdEffect());
		}
		target.hurt(source, this.attackDamage);
	}

	@Override
	public EntitySize getDimensions(Pose poseIn) {
		return EntitySize.scalable(0.6F, 0.6F);
	}

	@Override
	public ItemStack getItem() {
		return new ItemStack(ItemRegister.ICE_CABBAGE.get());
	}
}