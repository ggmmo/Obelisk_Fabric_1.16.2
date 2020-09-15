package com.github.thebuildteam.obelisk.blocks.interiordecoration;

import com.github.thebuildteam.obelisk.Obelisk;
import com.github.thebuildteam.obelisk.utility.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OBLMerchantSign extends HorizontalFacingBlock {
    public static VoxelShape colliderBox;

    public OBLMerchantSign(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        super.appendTooltip(stack, world, tooltip, options);
        tooltip.add(new TranslatableText("block."+ Obelisk.modid+".merchant_sign.tooltip").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        colliderBox = VoxelShapeHelper.rotateShape(Direction.NORTH, state.get(Properties.HORIZONTAL_FACING),
                VoxelShapes.cuboid(0.375, 0, 0, 0.625, 1.0, 1.0));
        return colliderBox;
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockstate =  super.getPlacementState(ctx);

        if (blockstate != null) {
            blockstate =blockstate.with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing());
        }

        return blockstate;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }
}
