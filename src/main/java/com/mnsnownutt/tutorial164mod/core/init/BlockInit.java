package com.mnsnownutt.tutorial164mod.core.init;

import com.mnsnownutt.tutorial164mod.TutorialModMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            ForgeRegistries.BLOCKS, TutorialModMod.MOD_ID);

    public static final RegistryObject<Block> BISMUTH_BLOCK = BLOCKS.register(
            "bismuth_block", () -> new Block(AbstractBlock.Properties.create(
                    Material.IRON, MaterialColor.IRON)
                    .hardnessAndResistance(5.5F, 6.5F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2)
                    .sound(SoundType.METAL)
                    .setRequiresTool()));

    public static final RegistryObject<Block> LIMESTONE_BLOCK = BLOCKS.register(
            "limestone_block", () -> new Block(AbstractBlock.Properties.create(
                    Material.ROCK, MaterialColor.SAND)
                    .hardnessAndResistance(2F, 4F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)
                    .sound(SoundType.STONE)
                    .setRequiresTool()));

}
