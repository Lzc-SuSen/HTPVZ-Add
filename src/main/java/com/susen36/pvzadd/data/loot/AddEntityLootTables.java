package com.susen36.pvzadd.data.loot;

import com.hungteen.pvz.common.item.ItemRegister;
import com.susen36.pvzadd.common.misc.AddLoot;
import net.minecraft.item.Items;
import net.minecraft.loot.*;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.loot.conditions.RandomChanceWithLooting;
import net.minecraft.loot.functions.LootingEnchantBonus;
import net.minecraft.loot.functions.SetCount;
import net.minecraft.util.ResourceLocation;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class AddEntityLootTables implements Consumer<BiConsumer<ResourceLocation, Builder>> {

	@Override
	public void accept(BiConsumer<ResourceLocation, Builder> t) {
		t.accept(AddLoot.EDGAR_090547, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantRange.exactly(1))
					    .add(ItemLootEntry.lootTableItem(ItemRegister.POLE.get()))
						.when(RandomChanceWithLooting.randomChanceAndLootingBoost(0.001F, 0.01F))
		));
		t.accept(AddLoot.FLOWER_POT_ZOMBIE, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantRange.exactly(1))
				        .add(ItemLootEntry.lootTableItem(ItemRegister.FLOWER_POT_ENJOY_CARD.get()))
				        .when(RandomChanceWithLooting.randomChanceAndLootingBoost(0.005F, 0.01F))
				));
		t.accept(AddLoot.AirborneZombieEntity, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantRange.exactly(1))
						.add(ItemLootEntry.lootTableItem(Items.LEAD))
						.when(RandomChanceWithLooting.randomChanceAndLootingBoost(0.001F, 0.01F))
				));
		t.accept(AddLoot.MC_ZOMBIE, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantRange.exactly(1))
						.add(ItemLootEntry.lootTableItem(Items.GRASS_BLOCK))
						.when(RandomChanceWithLooting.randomChanceAndLootingBoost(0.005F, 0.01F))
				));

	}

	
	private static Builder getLootTable() {
		return LootTable.lootTable();
	}
	
	private static Builder getRottenFleshLootTable() {
		return LootTable.lootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantRange.exactly(1))
				.add(ItemLootEntry.lootTableItem(Items.ROTTEN_FLESH))
				.apply(SetCount.setCount(RandomValueRange.between(0.0F, 2.0F)))
				.apply(LootingEnchantBonus.lootingMultiplier(RandomValueRange.between(0.0F, 1.0F)))
				.when(RandomChanceWithLooting.randomChanceAndLootingBoost(0.15F, 0.01F)));
	}
	
	private static Builder getZombieLootTable() {
		return getRottenFleshLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantRange.exactly(1))
				.add(ItemLootEntry.lootTableItem(ItemRegister.CORN_SEEDS.get()))
				.add(ItemLootEntry.lootTableItem(Items.SUNFLOWER))
				.add(ItemLootEntry.lootTableItem(ItemRegister.NUT.get()))
				.when(RandomChanceWithLooting.randomChanceAndLootingBoost(0.01F, 0.01F)));
	}

}
