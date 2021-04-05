package com.cheesebear99.eroded_stone.util;

import com.cheesebear99.eroded_stone.blocks.BlockItemBase;
import com.cheesebear99.eroded_stone.blocks.ErodedStone;
import com.cheesebear99.eroded_stone.erodedStone;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, erodedStone.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, erodedStone.MOD_ID);

    public static void innit() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> ERODED_STONE = BLOCKS.register("eroded_stone", ErodedStone::new);

    public static final RegistryObject<Item> ERODED_STONE_ITEM = ITEMS.register("eroded_stone", () -> new BlockItemBase(ERODED_STONE.get()));
}
