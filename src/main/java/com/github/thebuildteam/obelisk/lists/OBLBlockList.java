package com.github.thebuildteam.obelisk.lists;

import com.github.thebuildteam.obelisk.blocks.interiordecoration.*;
import com.github.thebuildteam.obelisk.blocks.obelisk.OBLStairsBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;

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
    public static final Block EARTH_OBELISK_FENCE = new FenceBlock(FabricBlockSettings.of(Material.METAL)
        .hardness(18000000).resistance(3600000).lightLevel(15));
}
