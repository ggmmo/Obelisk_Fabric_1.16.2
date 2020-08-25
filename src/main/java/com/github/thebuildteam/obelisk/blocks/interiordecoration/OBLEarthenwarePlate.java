package com.github.thebuildteam.obelisk.blocks.interiordecoration;

import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class OBLEarthenwarePlate extends HorizontalFacingBlock {
    public static final VoxelShape colliderBox = VoxelShapes.cuboid(0.125, 0, 0.125, 0.875, 0.125, 0.875);

    public OBLEarthenwarePlate(Settings properties) {
        super(properties);
    }

    @Override
    @Deprecated
    public VoxelShape getOutlineShape(BlockState state, BlockView worldIn, BlockPos pos, ShapeContext context)
    {
        return colliderBox;
    }


}
