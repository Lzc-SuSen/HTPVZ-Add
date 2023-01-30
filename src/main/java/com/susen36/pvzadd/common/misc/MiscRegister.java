package com.susen36.pvzadd.common.misc;

import com.susen36.pvzadd.common.item.ItemRegister;
import net.minecraft.block.ComposterBlock;
import net.minecraft.util.IItemProvider;

public class MiscRegister {

	public static void registerCompostable() {
		registerCompostable(0.3F, ItemRegister.ICE_CABBAGE.get());

	}

	private static void registerCompostable(float chance, IItemProvider itemIn) {
		ComposterBlock.COMPOSTABLES.put(itemIn.asItem(), chance);
	}
	
}
