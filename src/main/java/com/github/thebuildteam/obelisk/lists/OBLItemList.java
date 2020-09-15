package com.github.thebuildteam.obelisk.lists;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class OBLItemList {
    // ============== TOOLS ==============


    // ============== WEAPONS ==============


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
}
