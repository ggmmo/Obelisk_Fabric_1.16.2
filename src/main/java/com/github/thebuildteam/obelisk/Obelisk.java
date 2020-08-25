package com.github.thebuildteam.obelisk;

import com.github.thebuildteam.obelisk.lists.OBLBlockList;
import com.github.thebuildteam.obelisk.lists.OBLItemList;
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
        Registry.register(Registry.ITEM, new Identifier(modid, "candle_wallmounted"), OBLItemList.WALLMOUNTED_CANDLESTICK);
    }

    private void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(modid, "candle_wallmounted"), OBLBlockList.WALLMOUNTED_CANDLESTICK);
    }
}
