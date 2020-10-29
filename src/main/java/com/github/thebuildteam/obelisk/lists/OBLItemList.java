package com.github.thebuildteam.obelisk.lists;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import org.lwjgl.system.CallbackI;

public class OBLItemList {
    // ============== TOOLS ==============


    // ============== WEAPONS ==============


    // ============== MISCELLANEOUS ==============
    public static final Item COPPER_COIN = new Item(new Item.Settings().group(OBLItemGroups.MISCELLANEOUS));
    public static final Item SILVER_COIN = new Item(new Item.Settings().group(OBLItemGroups.MISCELLANEOUS));
    public static final Item GOLD_COIN = new Item(new Item.Settings().group(OBLItemGroups.MISCELLANEOUS));
    public static final Item EARTH_ELEMENT_INGOT = new Item(new Item.Settings().group(OBLItemGroups.MISCELLANEOUS));
    public static final Item FIRE_ELEMENT_INGOT = new Item(new Item.Settings().group(OBLItemGroups.MISCELLANEOUS));

    // ============================= BLOCK ITEMS =============================
    // ========== INTERIOR DECORATION ==========
    public static final Item EARTHENWARE_MUG = new BlockItem(OBLBlockList.EARTHENWARE_MUG, new Item.Settings()
        .group(OBLItemGroups.INTERIOR_DECO));
    public static final Item EARTHENWARE_PLATE = new BlockItem(OBLBlockList.EARTHENWARE_PLATE, new Item.Settings()
        .group(OBLItemGroups.INTERIOR_DECO));
    public static final Item EARTHENWARE_SET = new BlockItem(OBLBlockList.EARTHENWARE_SET, new Item.Settings()
        .group(OBLItemGroups.INTERIOR_DECO));
    public static final Item WALLMOUNTED_CANDLESTICK = new BlockItem(OBLBlockList.WALLMOUNTED_CANDLESTICK, new Item.Settings()
        .group(OBLItemGroups.INTERIOR_DECO));
    public static final Item MERCHANT_SIGN = new BlockItem(OBLBlockList.MERCHANT_SIGN, new Item.Settings()
        .group(OBLItemGroups.INTERIOR_DECO));

    // ========== OBELISK BLOCKS ==========
    public static final Item EARTH_OBELISK_BLOCK = new BlockItem(OBLBlockList.EARTH_OBELISK_BLOCK, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item EARTH_OBELISK_ORE = new BlockItem(OBLBlockList.EARTH_OBELISK_ORE, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item EARTH_OBELISK_WALL = new BlockItem(OBLBlockList.EARTH_OBELISK_WALL, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item EARTH_OBELISK_SLAB = new BlockItem(OBLBlockList.EARTH_OBELISK_SLAB, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item EARTH_OBELISK_STAIRS = new BlockItem(OBLBlockList.EARTH_OBELISK_STAIRS, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item EARTH_OBELISK_FENCE = new BlockItem(OBLBlockList.EARTH_OBELISK_FENCE, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));

    public static final Item FIRE_OBELISK_BLOCK = new BlockItem(OBLBlockList.FIRE_OBELISK_BLOCK, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item FIRE_OBELISK_ORE = new BlockItem(OBLBlockList.FIRE_OBELISK_ORE, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item FIRE_OBELISK_WALL = new BlockItem(OBLBlockList.FIRE_OBELISK_WALL, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item FIRE_OBELISK_SLAB = new BlockItem(OBLBlockList.FIRE_OBELISK_SLAB, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item FIRE_OBELISK_STAIRS = new BlockItem(OBLBlockList.FIRE_OBELISK_STAIRS, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item FIRE_OBELISK_FENCE = new BlockItem(OBLBlockList.FIRE_OBELISK_FENCE, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));

    // ========== DIRT BLOCKS ==========

    public static final Item DIRT_SLAB = new BlockItem(OBLBlockList.DIRT_SLAB, new Item.Settings()
        .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item DIRT_WALL = new BlockItem(OBLBlockList.DIRT_WALL, new Item.Settings()
            .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item DIRT_STAIRS = new BlockItem(OBLBlockList.DIRT_STAIRS, new Item.Settings()
            .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item DIRT_FENCE = new BlockItem(OBLBlockList.DIRT_FENCE, new Item.Settings()
            .group(OBLItemGroups.OBELISK_BLOCKS));
    public static final Item DIRT_SNOW = new BlockItem(OBLBlockList.DIRT_SNOW, new Item.Settings()
            .group(OBLItemGroups.OBELISK_BLOCKS));
}
