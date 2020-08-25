package com.github.thebuildteam.obelisk.blocks.interiordecoration;

import com.github.thebuildteam.obelisk.utility.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class OBLEarthenwareMug extends HorizontalFacingBlock {
    public static VoxelShape colliderBox;

    public OBLEarthenwareMug(Settings builder) {
        super(builder);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        colliderBox = VoxelShapeHelper.rotateShape(Direction.NORTH, state.get(Properties.HORIZONTAL_FACING),
                VoxelShapes.cuboid(0.625, 0, 0.5625, 0.9375, 0.4375, 1.0));

        return colliderBox;
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext context) {
        BlockState blockstate = super.getPlacementState(context);

        if (blockstate != null) {
            blockstate = blockstate.with(Properties.HORIZONTAL_FACING, context.getPlayerFacing().getOpposite());
        }
        return blockstate;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }
}
