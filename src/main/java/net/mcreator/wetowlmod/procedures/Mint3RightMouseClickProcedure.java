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
