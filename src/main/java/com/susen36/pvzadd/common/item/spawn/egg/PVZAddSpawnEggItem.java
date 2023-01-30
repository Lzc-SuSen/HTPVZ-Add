package com.susen36.pvzadd.common.item.spawn.egg;

import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PVZAddSpawnEggItem extends SpawnEggItem{

	protected static final List<PVZAddSpawnEggItem> PVZ_EGGS = new ArrayList<>();
	
	private final Lazy<? extends EntityType<?>> entityTypeSupplier;
	

	
	public PVZAddSpawnEggItem(final RegistryObject<? extends EntityType<?>> entityTypeSupplier, int primaryColorIn, int secondaryColorIn, Properties builder) {
		super(null, primaryColorIn, secondaryColorIn, builder);
		this.entityTypeSupplier=Lazy.of(entityTypeSupplier::get);
		PVZ_EGGS.add(this);
	}
	
	/**
	 * Adds all the supplier based spawn eggs to vanilla's map and registers an
	 * IDispenseItemBehavior for each of them as normal spawn eggs have one
	 * registered for each of them during
	 * but supplier based ones won't have had their EntityTypes created yet.
	 */
	public static void initUnaddedEggs() {
		final Map<EntityType<?>, SpawnEggItem> EGGS = ObfuscationReflectionHelper.getPrivateValue(SpawnEggItem.class, null, "field_195987_b");
		DefaultDispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior() {
			public ItemStack execute(IBlockSource source, ItemStack stack) {
				Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
				EntityType<?> entitytype = ((SpawnEggItem) stack.getItem()).getType(stack.getTag());
				entitytype.spawn(source.getLevel(), stack, null, source.getPos().relative(direction), SpawnReason.DISPENSER, direction != Direction.UP, false);
				stack.shrink(1);
				return stack;
			}
		};
		for (final SpawnEggItem egg : PVZ_EGGS) {
			EGGS.put(egg.getType(null), egg);
			DispenserBlock.registerBehavior(egg, defaultDispenseItemBehavior);
			// ItemColors for each spawn egg don't need to be registered because this method is called before ItemColors is created
		}
		PVZ_EGGS.clear();
	}

	@Override
	public EntityType<?> getType(@Nullable final CompoundNBT p_208076_1_) {
		return entityTypeSupplier.get();
	}

}
