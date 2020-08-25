package com.github.thebuildteam.obelisk.lists;

import com.github.thebuildteam.obelisk.blocks.OBLWallmountedCandlestick;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class OBLBlockList {
    public static final Block WALLMOUNTED_CANDLESTICK = new OBLWallmountedCandlestick(FabricBlockSettings.of(Material.STONE)
        .hardness(0.2f).resistance(0.4f));
}
