package com.github.thebuildteam.obelisk.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public class OBLWallmountedCandlestick extends HorizontalFacingBlock {
    public OBLWallmountedCandlestick(Settings settings) {
        super(settings);

    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }
}
