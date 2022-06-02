package net.mcreator.wetowlmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class Mint3WhenFullyGrowdProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randomNumber = 0;
		ItemStack itemCrop = ItemStack.EMPTY;
		ItemStack itemSeed = ItemStack.EMPTY;
		itemSeed = new ItemStack(WetowlModModItems.MINT_SEED.get());
		itemCrop = new ItemStack(WetowlModModItems.MINT_LEAVES.get());
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WetowlModModBlocks.MINT_3.get()) {
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (!world.isClientSide()) {
					randomNumber = Math.random();
				}
				if (randomNumber > 0.809 && randomNumber <= 1) {
					for (int index0 = 0; index0 < (int) (2); index0++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeed);
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					for (int index1 = 0; index1 < (int) (3); index1++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemCrop);
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.39 && randomNumber <= 0.809) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeed);
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					for (int index2 = 0; index2 < (int) (2); index2++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemCrop);
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (randomNumber >= 0 && randomNumber <= 0.39) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeed);
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					for (int index3 = 0; index3 < (int) (3); index3++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemCrop);
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}
