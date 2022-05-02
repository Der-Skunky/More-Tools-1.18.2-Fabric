package net.skunky.moretools.custom.entities.blocks;

import net.minecraft.block.Block;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.stream.Stream;

public class shapes {

    public static final VoxelShape SHAPE_CRYSTAL_TABLE = Stream.of(
            Block.createCuboidShape(3, 0, 3, 13, 1, 13),
            Block.createCuboidShape(3, 12, 3, 13, 13, 13),
            Block.createCuboidShape(2, 13, 2, 14, 14, 14),
            Block.createCuboidShape(4, 1, 4, 12, 2, 12),
            Block.createCuboidShape(4, 11, 4, 12, 12, 12),
            Block.createCuboidShape(5, 2, 5, 11, 11, 11),
            Block.createCuboidShape(4, 14, 4, 12, 14, 12),
            Block.createCuboidShape(11, 14, 11, 13, 14, 13),
            Block.createCuboidShape(12, 14, 12, 14, 14, 14),
            Block.createCuboidShape(11, 14, 11, 13, 14, 13),
            Block.createCuboidShape(13, 14, 12, 15, 14, 14),
            Block.createCuboidShape(10, 14, 14, 12, 14, 16),
            Block.createCuboidShape(11, 14, 11, 13, 14, 13),
            Block.createCuboidShape(4, 14, 11, 6, 14, 13),
            Block.createCuboidShape(2, 14, 10, 4, 14, 12),
            Block.createCuboidShape(2, 14, 11, 4, 14, 13),
            Block.createCuboidShape(8, 14, 1, 10, 14, 3),
            Block.createCuboidShape(10, 14, 3, 12, 14, 5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
}
