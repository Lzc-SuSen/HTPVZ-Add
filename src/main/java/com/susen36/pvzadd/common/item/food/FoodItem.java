package com.susen36.pvzadd.common.item.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

@SuppressWarnings("deprecation")
public class FoodItem extends Item{



	public static final Food ICE_CABBAGE = (new Food.Builder()).nutrition(4).saturationMod(0.5F).effect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 80, 1), 1.0f).build();

	public FoodItem(Food food) {
		super(new Properties().tab(ItemGroup.TAB_FOOD).food(food));
	}

}
