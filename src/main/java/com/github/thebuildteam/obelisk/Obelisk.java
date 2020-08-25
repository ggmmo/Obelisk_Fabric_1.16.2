package com.github.thebuildteam.obelisk;

import com.github.thebuildteam.obelisk.lists.OBLBlockList;
import com.github.thebuildteam.obelisk.lists.OBLItemList;
import com.github.thebuildteam.obelisk.utility.VoxelShapeHelper;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Obelisk implements ModInitializer {
    public static String modid = "obeliskmod";

    @Override
    public void onInitialize() {
        registerItems();
        registerBlocks();
    }

    private void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(modid, "earthenware_mug"), OBLItemList.EARTHENWARE_MUG);
        Registry.register(Registry.ITEM, new Identifier(modid, "earthenware_plate"), OBLItemList.EARTHENWARE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(modid, "earthenware_set"), OBLItemList.EARTHENWARE_SET);
        Registry.register(Registry.ITEM, new Identifier(modid, "candle_wallmounted"), OBLItemList.WALLMOUNTED_CANDLESTICK);
        Registry.register(Registry.ITEM, new Identifier(modid, "merchant_sign"), OBLItemList.MERCHANT_SIGN);
    }

    private void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(modid, "earthenware_mug"), OBLBlockList.EARTHENWARE_MUG);
        Registry.register(Registry.BLOCK, new Identifier(modid, "earthenware_plate"), OBLBlockList.EARTHENWARE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(modid, "earthenware_set"), OBLBlockList.EARTHENWARE_SET);
        Registry.register(Registry.BLOCK, new Identifier(modid, "candle_wallmounted"), OBLBlockList.WALLMOUNTED_CANDLESTICK);
        Registry.register(Registry.BLOCK, new Identifier(modid, "merchant_sign"), OBLBlockList.MERCHANT_SIGN);
    }
}
