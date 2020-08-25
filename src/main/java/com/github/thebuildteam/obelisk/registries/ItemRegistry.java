package com.github.thebuildteam.obelisk.registries;

import com.github.thebuildteam.obelisk.Obelisk;
import com.github.thebuildteam.obelisk.lists.OBLItemList;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earthenware_mug"), OBLItemList.EARTHENWARE_MUG);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earthenware_plate"), OBLItemList.EARTHENWARE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earthenware_set"), OBLItemList.EARTHENWARE_SET);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "candle_wallmounted"), OBLItemList.WALLMOUNTED_CANDLESTICK);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "merchant_sign"), OBLItemList.MERCHANT_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earth_obelisk_block"), OBLItemList.EARTH_OBELISK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earth_obelisk_ore"), OBLItemList.EARTH_OBELISK_ORE);
    }
}
