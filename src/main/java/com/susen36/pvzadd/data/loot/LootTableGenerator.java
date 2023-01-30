package com.susen36.pvzadd.data.loot;

import com.google.common.collect.ImmutableList;
import com.hungteen.pvz.data.loot.PVZBlockLootTables;
import com.hungteen.pvz.data.loot.PVZChestLootTables;
import com.hungteen.pvz.data.loot.PVZFishingLootTables;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.*;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LootTableGenerator extends LootTableProvider{

	private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> tables = ImmutableList.of(
			Pair.of(PVZChestLootTables::new, LootParameterSets.CHEST),
			Pair.of(AddEntityLootTables::new, LootParameterSets.ENTITY),
			Pair.of(PVZBlockLootTables::new, LootParameterSets.BLOCK),
			Pair.of(PVZFishingLootTables::new, LootParameterSets.FISHING)
			);
	
	public LootTableGenerator(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables() {
		return this.tables;
	}
	
	@Override
	protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
		map.forEach((id, builder) -> LootTableManager.validate(validationtracker, id, builder));
	}

	@Override
	public String getName() {
		return "Plants vs Zombies loot tables";
	}
	
}
