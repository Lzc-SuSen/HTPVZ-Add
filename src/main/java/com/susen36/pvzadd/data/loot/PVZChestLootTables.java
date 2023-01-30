package com.susen36.pvzadd.data.loot;

import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.misc.PVZLoot;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.*;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.loot.functions.EnchantRandomly;
import net.minecraft.loot.functions.SetCount;
import net.minecraft.util.ResourceLocation;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PVZChestLootTables implements Consumer<BiConsumer<ResourceLocation, Builder>> {

	@Override
	public void accept(BiConsumer<ResourceLocation, Builder> t) {
		t.accept(PVZLoot.DAVE_VILLA_CHEST, LootTable.lootTable()
				.withPool(LootPool.lootPool().setRolls(RandomValueRange.between(3.0F, 5.0F))
						.add(ItemLootEntry.lootTableItem(Items.DIAMOND).setWeight(5).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.IRON_INGOT).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 5.0F))))
						.add(ItemLootEntry.lootTableItem(Items.GOLD_INGOT).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(2.0F, 7.0F))))
						.add(ItemLootEntry.lootTableItem(Items.EMERALD).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.WHEAT).setWeight(20).apply(SetCount.setCount(RandomValueRange.between(2.0F, 6.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.PEA.get()).setWeight(20).apply(SetCount.setCount(RandomValueRange.between(4.0F, 10.0F))))
						.add(ItemLootEntry.lootTableItem(Items.PORKCHOP).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 5.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.PEA_SHOOTER_ENJOY_CARD.get()).setWeight(10))
						.add(ItemLootEntry.lootTableItem(ItemRegister.SUN_FLOWER_ENJOY_CARD.get()).setWeight(10))
						.add(ItemLootEntry.lootTableItem(ItemRegister.CHERRY_BOMB_ENJOY_CARD.get()).setWeight(5))
						.add(ItemLootEntry.lootTableItem(ItemRegister.WALL_NUT_ENJOY_CARD.get()).setWeight(10))
						.add(ItemLootEntry.lootTableItem(ItemRegister.POTATO_MINE_ENJOY_CARD.get()).setWeight(8))
						.add(ItemLootEntry.lootTableItem(Items.BOOK).setWeight(20).apply(EnchantRandomly.randomApplicableEnchantment()))
						.add(ItemLootEntry.lootTableItem(Items.GOLDEN_APPLE).setWeight(20))
						.add(ItemLootEntry.lootTableItem(Items.ENCHANTED_GOLDEN_APPLE).setWeight(2))
						.add(EmptyLootEntry.emptyItem().setWeight(15)))
				.withPool(LootPool.lootPool().setRolls(ConstantRange.exactly(3))
						.add(ItemLootEntry.lootTableItem(Items.BOOK).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 4.0F))))
						.add(ItemLootEntry.lootTableItem(Items.ROTTEN_FLESH).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Items.STRING).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
				));
		t.accept(PVZLoot.BUCKET_HOUSE_CHEST, LootTable.lootTable()
				.withPool(LootPool.lootPool().setRolls(RandomValueRange.between(2.0F, 4.0F))
						.add(ItemLootEntry.lootTableItem(Items.DIAMOND).setWeight(5).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.IRON_INGOT).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 5.0F))))
						.add(ItemLootEntry.lootTableItem(Items.GOLD_INGOT).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(2.0F, 7.0F))))
						.add(ItemLootEntry.lootTableItem(Items.EMERALD).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.BONE).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(4.0F, 6.0F))))
						.add(ItemLootEntry.lootTableItem(Items.SPIDER_EYE).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.ROTTEN_FLESH).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(3.0F, 7.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.PEA_SHOOTER_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.SUN_FLOWER_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.CHERRY_BOMB_ENJOY_CARD.get()).setWeight(12).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.WALL_NUT_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.POTATO_MINE_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.SNOW_PEA_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.CHOMPER_ENJOY_CARD.get()).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.REPEATER_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(Items.BOOK).setWeight(20).apply(EnchantRandomly.randomApplicableEnchantment()))
						.add(ItemLootEntry.lootTableItem(Items.GOLDEN_APPLE).setWeight(20))
						.add(ItemLootEntry.lootTableItem(Items.ENCHANTED_GOLDEN_APPLE).setWeight(2))
						.add(EmptyLootEntry.emptyItem().setWeight(15)))
				.withPool(LootPool.lootPool().setRolls(ConstantRange.exactly(4))
						.add(ItemLootEntry.lootTableItem(Items.BONE).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Items.GUNPOWDER).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Items.ROTTEN_FLESH).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Items.STRING).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
				));
		t.accept(PVZLoot.DOLPHIN_HOUSE_CHEST, LootTable.lootTable()
				.withPool(LootPool.lootPool().setRolls(RandomValueRange.between(2.0F, 4.0F))
						.add(ItemLootEntry.lootTableItem(Items.DIAMOND).setWeight(5).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.IRON_INGOT).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 5.0F))))
						.add(ItemLootEntry.lootTableItem(Items.GOLD_INGOT).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(2.0F, 7.0F))))
						.add(ItemLootEntry.lootTableItem(Items.EMERALD).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.BONE).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(4.0F, 6.0F))))
						.add(ItemLootEntry.lootTableItem(Items.SPIDER_EYE).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.ROTTEN_FLESH).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(3.0F, 7.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.LILY_PAD_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.SQUASH_ENJOY_CARD.get()).setWeight(12).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.THREE_PEATER_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.TANGLE_KELP_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.JALAPENO_ENJOY_CARD.get()).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.SPIKE_WEED_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.TORCH_WOOD_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.TALL_NUT_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(Items.BOOK).setWeight(20).apply(EnchantRandomly.randomApplicableEnchantment()))
						.add(ItemLootEntry.lootTableItem(Items.GOLDEN_APPLE).setWeight(20))
						.add(ItemLootEntry.lootTableItem(Items.ENCHANTED_GOLDEN_APPLE).setWeight(2))
						.add(EmptyLootEntry.emptyItem().setWeight(15)))
				.withPool(LootPool.lootPool().setRolls(ConstantRange.exactly(4))
						.add(ItemLootEntry.lootTableItem(Items.BONE).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Items.GUNPOWDER).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Items.ROTTEN_FLESH).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Items.STRING).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
				));
		t.accept(PVZLoot.GRAVE_YARD_CHEST, LootTable.lootTable()
				.withPool(LootPool.lootPool().setRolls(RandomValueRange.between(2.0F, 4.0F))
						.add(ItemLootEntry.lootTableItem(Items.DIAMOND).setWeight(5).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.IRON_INGOT).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 5.0F))))
						.add(ItemLootEntry.lootTableItem(Items.GOLD_INGOT).setWeight(20).apply(SetCount.setCount(RandomValueRange.between(2.0F, 7.0F))))
						.add(ItemLootEntry.lootTableItem(Items.EMERALD).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.BONE).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(4.0F, 6.0F))))
						.add(ItemLootEntry.lootTableItem(Items.SPIDER_EYE).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.ROTTEN_FLESH).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(3.0F, 7.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.PUFF_SHROOM_ENJOY_CARD.get()).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.SUN_SHROOM_ENJOY_CARD.get()).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.FUME_SHROOM_ENJOY_CARD.get()).setWeight(12).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.GRAVE_BUSTER_ENJOY_CARD.get()).setWeight(6).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.HYPNO_SHROOM_ENJOY_CARD.get()).setWeight(8).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.SCAREDY_SHROOM_ENJOY_CARD.get()).setWeight(12).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.ICE_SHROOM_ENJOY_CARD.get()).setWeight(6).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.DOOM_SHROOM_ENJOY_CARD.get()).setWeight(12).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(Items.WITHER_ROSE).setWeight(2).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(Items.BOOK).setWeight(20).apply(EnchantRandomly.randomApplicableEnchantment()))
						.add(ItemLootEntry.lootTableItem(Items.GOLDEN_APPLE).setWeight(20))
						.add(ItemLootEntry.lootTableItem(Items.ENCHANTED_GOLDEN_APPLE).setWeight(2))
						.add(EmptyLootEntry.emptyItem().setWeight(15)))
				.withPool(LootPool.lootPool().setRolls(ConstantRange.exactly(4))
						.add(ItemLootEntry.lootTableItem(Items.BONE).setWeight(20).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Items.ROTTEN_FLESH).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Items.STRING).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Blocks.GRAVEL).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
				));
		t.accept(PVZLoot.YETI_HOUSE_CHEST, LootTable.lootTable()
				.withPool(LootPool.lootPool().setRolls(RandomValueRange.between(2.0F, 4.0F))
						.add(ItemLootEntry.lootTableItem(Items.DIAMOND).setWeight(5).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.IRON_INGOT).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 5.0F))))
						.add(ItemLootEntry.lootTableItem(Items.GOLD_INGOT).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(2.0F, 7.0F))))
						.add(ItemLootEntry.lootTableItem(Items.BLUE_ICE).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(Items.APPLE).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 4.0F))))
						.add(ItemLootEntry.lootTableItem(Items.SNOWBALL).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(4.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Items.BONE).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(4.0F, 6.0F))))
						.add(ItemLootEntry.lootTableItem(Items.SPIDER_EYE).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 3.0F))))
						.add(ItemLootEntry.lootTableItem(Items.ROTTEN_FLESH).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(3.0F, 7.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.SEA_SHROOM_ENJOY_CARD.get()).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.PLANTERN_ENJOY_CARD.get()).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.CACTUS_ENJOY_CARD.get()).setWeight(6).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.BLOVER_ENJOY_CARD.get()).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.SPLIT_PEA_ENJOY_CARD.get()).setWeight(6).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.STAR_FRUIT_ENJOY_CARD.get()).setWeight(12).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.PUMPKIN_ENJOY_CARD.get()).setWeight(6).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(ItemRegister.MAGNET_SHROOM_ENJOY_CARD.get()).setWeight(15).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(Items.WITHER_ROSE).setWeight(2).apply(SetCount.setCount(RandomValueRange.between(1.0F, 2.0F))))
						.add(ItemLootEntry.lootTableItem(Items.BOOK).setWeight(20).apply(EnchantRandomly.randomApplicableEnchantment()))
						.add(ItemLootEntry.lootTableItem(Items.GOLDEN_APPLE).setWeight(20))
						.add(ItemLootEntry.lootTableItem(Items.ENCHANTED_GOLDEN_APPLE).setWeight(2))
						.add(EmptyLootEntry.emptyItem().setWeight(15)))
				.withPool(LootPool.lootPool().setRolls(ConstantRange.exactly(4))
						.add(ItemLootEntry.lootTableItem(Items.BONE).setWeight(20).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Items.ROTTEN_FLESH).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Items.STRING).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
						.add(ItemLootEntry.lootTableItem(Blocks.GRAVEL).setWeight(10).apply(SetCount.setCount(RandomValueRange.between(1.0F, 8.0F))))
				));
	}

}
