package com.github.thebuildteam.obelisk.registries;

import com.github.thebuildteam.obelisk.Obelisk;
import com.github.thebuildteam.obelisk.lists.OBLBlockList;
import com.github.thebuildteam.obelisk.lists.OBLItemGroups;
import com.github.thebuildteam.obelisk.lists.OBLItemList;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static void register() {
        // ============== DECORATION ===============
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earthenware_mug"), OBLItemList.EARTHENWARE_MUG);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earthenware_plate"), OBLItemList.EARTHENWARE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earthenware_set"), OBLItemList.EARTHENWARE_SET);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "candle_wallmounted"), OBLItemList.WALLMOUNTED_CANDLESTICK);

        // =============== MISCELLANEOUS ===============
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "merchant_sign"), OBLItemList.MERCHANT_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "copper_coin"), OBLItemList.COPPER_COIN);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "silver_coin"), OBLItemList.SILVER_COIN);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "gold_coin"), OBLItemList.GOLD_COIN);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earth_ingot"), OBLItemList.EARTH_ELEMENT_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "fire_ingot"), OBLItemList.FIRE_ELEMENT_INGOT);

        // =============== OBELISK BLOCKS ===============
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earth_obelisk_block"), OBLItemList.EARTH_OBELISK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earth_obelisk_ore"), OBLItemList.EARTH_OBELISK_ORE);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earth_obelisk_wall"), OBLItemList.EARTH_OBELISK_WALL);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earth_obelisk_slab"), OBLItemList.EARTH_OBELISK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earth_obelisk_stairs"), OBLItemList.EARTH_OBELISK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "earth_obelisk_fence"), OBLItemList.EARTH_OBELISK_FENCE);


        
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "fire_obelisk_block"), OBLItemList.FIRE_OBELISK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "fire_obelisk_ore"), OBLItemList.FIRE_OBELISK_ORE);
        Registry.register(Registry.ITEM, new Identifier(Obelisk.modid, "fire_obelisk_slab"), OBLItemList.FIRE_OBELISK_SLAB);
    }
}