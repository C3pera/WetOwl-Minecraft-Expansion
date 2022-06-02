package net.mcreator.wetowlmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class Mint0WhenAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putDouble("TotalGrowthTime", 400);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putDouble("GrowthTime", (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "TotalGrowthTime")));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x + 0.5, y + 0.5, z + 0.5),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant")), SoundSource.BLOCKS, (float) 0.45,
							(float) 1.2);
				} else {
					_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant")), SoundSource.BLOCKS, (float) 0.45,
							(float) 1.2, false);
				}
			}
		}
	}
}
