package com.susen36.pvzadd.common.block;


import com.susen36.pvzadd.PVZAdd;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class BlockRegister {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PVZAdd.MOD_ID);


    //block

    public static final RegistryObject<Block> STEEL_PUMPKIN  = BLOCKS.register("steel_pumpkin", () ->
            new Block((AbstractBlock.Properties.of(Material.PLANT, MaterialColor.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(15.0F, 15.0F).sound(SoundType.METAL).requiresCorrectToolForDrops())));


}

