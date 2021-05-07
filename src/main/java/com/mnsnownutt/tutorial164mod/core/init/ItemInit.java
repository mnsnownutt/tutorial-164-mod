package com.mnsnownutt.tutorial164mod.core.init;

import com.mnsnownutt.tutorial164mod.TutorialModMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, TutorialModMod.MOD_ID);

    public static final RegistryObject<Item> WRENCH = ITEMS.register(
            "wrench", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<BlockItem> BISMUTH_BLOCK = ITEMS.register(
            "bismuth_block", () -> new BlockItem(BlockInit.BISMUTH_BLOCK.get(),
                    new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> LIMESTONE_BLOCK = ITEMS.register(
            "limestone_block", () -> new BlockItem(BlockInit.LIMESTONE_BLOCK.get(),
                    new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));


}
