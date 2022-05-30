package net.mcreator.wetowlmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.wetowlmod.init.WetowlModModItems;
import net.mcreator.wetowlmod.init.WetowlModModBlocks;

public class Mint3RightMouseClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randomNumber = 0;
		ItemStack itemSeeds = ItemStack.EMPTY;
		ItemStack itemCrop = ItemStack.EMPTY;
		ItemStack itemSeed = ItemStack.EMPTY;
		itemCrop = new ItemStack(WetowlModModItems.MINT_LEAVES.get());
		if (!world.isClientSide()) {
			randomNumber = Math.random();
		}
		if (randomNumber > 0.7 && randomNumber <= 1) {
			for (int index0 = 0; index0 < (int) (3); index0++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeed);
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (randomNumber > 0.4 && randomNumber <= 0.7) {
			for (int index1 = 0; index1 < (int) (2); index1++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeed);
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (randomNumber > 0.07 && randomNumber <= 0.4) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeed);
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (world instanceof Level _level && !_level.isClientSide()) {
			ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemCrop);
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
		world.setBlock(new BlockPos(x, y, z), WetowlModModBlocks.MINT_2.get().defaultBlockState(), 3);
	}
}
