package com.github.thebuildteam.obelisk.lists;

import com.github.thebuildteam.obelisk.blocks.interiordecoration.*;
import com.github.thebuildteam.obelisk.blocks.obelisk.OBLFenceBlock;
import com.github.thebuildteam.obelisk.blocks.obelisk.OBLSnowBlock;
import com.github.thebuildteam.obelisk.blocks.obelisk.OBLStairsBlock;
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

    //TODO: Earth obelisk ore + Walls texture problem (Blockstate?)
    //TODO: Earth obelisk Fence placement updating upon placement??
    public static final Block EARTH_OBELISK_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));
    public static final Block EARTH_OBELISK_ORE = new Block(FabricBlockSettings.of(Material.STONE)
        .hardness(3).resistance(9));
    public static final Block EARTH_OBELISK_WALL = new Block(FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));
    public static final Block EARTH_OBELISK_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));
    public static final Block EARTH_OBELISK_STAIRS = new OBLStairsBlock(EARTH_OBELISK_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));
    public static final Block EARTH_OBELISK_FENCE = new OBLFenceBlock(FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));

    public static final Block FIRE_OBELISK_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));
    public static final Block FIRE_OBELISK_ORE = new Block(FabricBlockSettings.of(Material.STONE)
        .hardness(3).resistance(9));
    public static final Block FIRE_OBELISK_WALL = new Block(FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));
    public static final Block FIRE_OBELISK_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));
    public static final Block FIRE_OBELISK_STAIRS = new OBLStairsBlock(FIRE_OBELISK_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));
    public static final Block FIRE_OBELISK_FENCE = new OBLFenceBlock(FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));

    // ========== DIRT BLOCKS ==========

    public static final Block DIRT_SLAB = new SlabBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
            .hardness(18000000).resistance(3600000).lightLevel(15));
    public static Block DIRT_WALL = new WallBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
            .hardness(18000000).resistance(3600000).lightLevel(15));
    public static final Block DIRT_STAIRS = new OBLStairsBlock(DIRT_SLAB.getDefaultState(), FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
            .hardness(18000000).resistance(3600000).lightLevel(15));
    public static final Block DIRT_SNOW = new OBLSnowBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
            .hardness(18000000).resistance(3600000).lightLevel(15));
    public static Block DIRT_FENCE = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
            .hardness(18000000).resistance(3600000).lightLevel(15));
}
