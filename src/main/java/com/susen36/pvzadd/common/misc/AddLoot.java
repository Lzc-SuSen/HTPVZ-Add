package com.susen36.pvzadd.common.misc;

import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.util.ResourceLocation;

public class AddLoot {

		//entity
	public static final ResourceLocation EDGAR_090547 = getEntityLootTable("edgar_090547");
	public static final ResourceLocation FLOWER_POT_ZOMBIE = getEntityLootTable("flower_pot_zombie");
	public static final ResourceLocation AIRBORNE_ZOMBIE = getEntityLootTable("airborne_zombie");
	public static final ResourceLocation MC_ZOMBIE = getEntityLootTable("mc_zombie");

	public static final ResourceLocation STEEL_PUMPKIN_ZOMBIE = getEntityLootTable("steel_pumpkin_zombie");

	public static final ResourceLocation TARGET_ARROW_ZOMBIE = getEntityLootTable("target_arrow_zombie");

	public static ResourceLocation getEntityLootTable(String name) {
		return StringUtil.prefix("entities/" + name);
	}
	

}
