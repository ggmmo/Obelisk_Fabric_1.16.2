package com.github.thebuildteam.obelisk.registries;

import com.github.thebuildteam.obelisk.Obelisk;
import com.github.thebuildteam.obelisk.lists.OBLBlockList;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "earthenware_mug"), OBLBlockList.EARTHENWARE_MUG);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "earthenware_plate"), OBLBlockList.EARTHENWARE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "earthenware_set"), OBLBlockList.EARTHENWARE_SET);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "candle_wallmounted"), OBLBlockList.WALLMOUNTED_CANDLESTICK);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "merchant_sign"), OBLBlockList.MERCHANT_SIGN);

        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "earth_obelisk_block"), OBLBlockList.EARTH_OBELISK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "earth_obelisk_ore"), OBLBlockList.EARTH_OBELISK_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "earth_obelisk_wall"), OBLBlockList.EARTH_OBELISK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "earth_obelisk_slab"), OBLBlockList.EARTH_OBELISK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "earth_obelisk_stairs"), OBLBlockList.EARTH_OBELISK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "earth_obelisk_fence"), OBLBlockList.EARTH_OBELISK_FENCE);

        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "fire_obelisk_block"), OBLBlockList.FIRE_OBELISK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "fire_obelisk_ore"), OBLBlockList.FIRE_OBELISK_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "fire_obelisk_wall"), OBLBlockList.FIRE_OBELISK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "fire_obelisk_slab"), OBLBlockList.FIRE_OBELISK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "fire_obelisk_stairs"), OBLBlockList.FIRE_OBELISK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Obelisk.modid, "fire_obelisk_fence"), OBLBlockList.FIRE_OBELISK_FENCE);
    }
}