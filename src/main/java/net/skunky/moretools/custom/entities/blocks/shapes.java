package net.skunky.moretools.custom.entities.blocks;

import net.minecraft.block.Block;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.stream.Stream;

public class shapes {

    public static final VoxelShape SOUL_FURNACE_N = Stream.of(
            Block.createCuboidShape(2, 0, 2, 14, 6, 12),
            Block.createCuboidShape(4, 0, 12, 14, 6, 14),
            Block.createCuboidShape(0, 0, 12, 4, 13, 16),
            Block.createCuboidShape(0, 13, 12, 1, 14, 13),
            Block.createCuboidShape(0, 13, 15, 1, 14, 16),
            Block.createCuboidShape(3, 13, 12, 4, 14, 13),
            Block.createCuboidShape(3, 13, 15, 4, 14, 16),
            Block.createCuboidShape(0, 14, 12, 4, 15, 16),
            Block.createCuboidShape(0, 0, 0, 2, 8, 2),
            Block.createCuboidShape(14, 0, 0, 16, 8, 2),
            Block.createCuboidShape(14, 0, 14, 16, 8, 16),
            Block.createCuboidShape(0, 8, 0, 16, 10, 12),
            Block.createCuboidShape(4, 8, 12, 16, 10, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape SOUL_FURNACE_E = Stream.of(
            Block.createCuboidShape(4, 0, 2, 14, 6, 14),
            Block.createCuboidShape(2, 0, 4, 4, 6, 14),
            Block.createCuboidShape(0, 0, 0, 4, 13, 4),
            Block.createCuboidShape(3, 13, 0, 4, 14, 1),
            Block.createCuboidShape(0, 13, 0, 1, 14, 1),
            Block.createCuboidShape(3, 13, 3, 4, 14, 4),
            Block.createCuboidShape(0, 13, 3, 1, 14, 4),
            Block.createCuboidShape(0, 14, 0, 4, 15, 4),
            Block.createCuboidShape(14, 0, 0, 16, 8, 2),
            Block.createCuboidShape(14, 0, 14, 16, 8, 16),
            Block.createCuboidShape(0, 0, 14, 2, 8, 16),
            Block.createCuboidShape(4, 8, 0, 16, 10, 16),
            Block.createCuboidShape(0, 8, 4, 4, 10, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape SOUL_FURNACE_S = Stream.of(
            Block.createCuboidShape(2, 0, 4, 14, 6, 14),
            Block.createCuboidShape(2, 0, 2, 12, 6, 4),
            Block.createCuboidShape(12, 0, 0, 16, 13, 4),
            Block.createCuboidShape(15, 13, 3, 16, 14, 4),
            Block.createCuboidShape(15, 13, 0, 16, 14, 1),
            Block.createCuboidShape(12, 13, 3, 13, 14, 4),
            Block.createCuboidShape(12, 13, 0, 13, 14, 1),
            Block.createCuboidShape(12, 14, 0, 16, 15, 4),
            Block.createCuboidShape(14, 0, 14, 16, 8, 16),
            Block.createCuboidShape(0, 0, 14, 2, 8, 16),
            Block.createCuboidShape(0, 0, 0, 2, 8, 2),
            Block.createCuboidShape(0, 8, 4, 16, 10, 16),
            Block.createCuboidShape(0, 8, 0, 12, 10, 4)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape SOUL_FURNACE_W = Stream.of(
            Block.createCuboidShape(2, 0, 2, 12, 6, 14),
            Block.createCuboidShape(12, 0, 2, 14, 6, 12),
            Block.createCuboidShape(12, 0, 12, 16, 13, 16),
            Block.createCuboidShape(12, 13, 15, 13, 14, 16),
            Block.createCuboidShape(15, 13, 15, 16, 14, 16),
            Block.createCuboidShape(12, 13, 12, 13, 14, 13),
            Block.createCuboidShape(15, 13, 12, 16, 14, 13),
            Block.createCuboidShape(12, 14, 12, 16, 15, 16),
            Block.createCuboidShape(0, 0, 14, 2, 8, 16),
            Block.createCuboidShape(0, 0, 0, 2, 8, 2),
            Block.createCuboidShape(14, 0, 0, 16, 8, 2),
            Block.createCuboidShape(0, 8, 0, 12, 10, 16),
            Block.createCuboidShape(12, 8, 0, 16, 10, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape SHAPE_CRYSTAL_TABLE = null;
}
