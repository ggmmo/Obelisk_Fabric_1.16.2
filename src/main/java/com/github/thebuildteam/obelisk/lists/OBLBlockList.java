package com.github.thebuildteam.obelisk.lists;

import com.github.thebuildteam.obelisk.blocks.interiordecoration.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;

public class OBLBlockList {
    // ========== INTERIOR DECORATION ==========
    public static final Block EARTHENWARE_PLATE = new OBLEarthenwarePlate(FabricBlockSettings.of(Material.GLASS)
        .hardness(0.2f).resistance(0.2f));
    public static final Block EARTHENWARE_MUG = new OBLEarthenwareMug(FabricBlockSettings.of(Material.GLASS)
        .hardness(0.2f).resistance(0.2f));
    public static final Block EARTHENWARE_SET = new OBLEarthenwareSet(FabricBlockSettings.of(Material.GLASS)
        .hardness(0.2f).resistance(0.2f));

    public static final Block WALLMOUNTED_CANDLESTICK = new OBLWallmountedCandlestick(FabricBlockSettings.of(Material.STONE)
        .hardness(0.2f).resistance(0.4f));

    public static final Block MERCHANT_SIGN = new OBLMerchantSign(FabricBlockSettings.of(Material.WOOD)
        .hardness(0.4f).resistance(0.2f));

    // ========== OBELISK BLOCKS ==========
    public static final Block EARTH_OBELISK_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15).materialColor(MaterialColor.GREEN));
    public static final Block EARTH_OBELISK_ORE = new Block(FabricBlockSettings.of(Material.STONE)
        .hardness(3).resistance(9));

    public static final Block FIRE_OBELISK_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));
    public static final Block FIRE_OBELISK_ORE = new Block(FabricBlockSettings.of(Material.METAL)
            .hardness(18000000).resistance(3600000).lightLevel(15));
    public static final Block FIRE_OBELISK_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));
    //public static final Block FIRE_OBELISK_STAIRS = new StairsBlock(FIRE_OBELISK_BLOCK.getDefaultState(),
            //FabricBlockSettings.of(Material.METAL).hardness(18000000).resistance(3600000).lightLevel(15));

}
