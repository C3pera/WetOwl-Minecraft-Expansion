package net.mcreator.wetowlmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class Mint3RightMouseClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack itemSeeds = ItemStack.EMPTY;
		ItemStack itemCrop = ItemStack.EMPTY;
		ItemStack itemSeed = ItemStack.EMPTY;
		itemCrop = new ItemStack(WetowlModModItems.MINT_LEAVES.get());
		if (!world.isClientSide()) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemCrop);
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			world.setBlock(new BlockPos(x, y, z), WetowlModModBlocks.MINT_2.get().defaultBlockState(), 3);
		}
	}
}
