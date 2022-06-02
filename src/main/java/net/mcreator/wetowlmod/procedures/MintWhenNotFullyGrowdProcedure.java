package net.mcreator.wetowlmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MintWhenNotFullyGrowdProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack itemSeeds = ItemStack.EMPTY;
		BlockState itemCrop0 = Blocks.AIR.defaultBlockState();
		BlockState itemCrop1 = Blocks.AIR.defaultBlockState();
		BlockState itemCrop2 = Blocks.AIR.defaultBlockState();
		BlockState thisBlock = Blocks.AIR.defaultBlockState();
		itemSeeds = new ItemStack(WetowlModModItems.MINT_SEED.get());
		itemCrop0 = WetowlModModBlocks.MINT_0.get().defaultBlockState();
		itemCrop1 = WetowlModModBlocks.MINT_1.get().defaultBlockState();
		itemCrop2 = WetowlModModBlocks.MINT_2.get().defaultBlockState();
		thisBlock = (world.getBlockState(new BlockPos(x, y, z)));
		if (thisBlock.getBlock() == itemCrop0.getBlock() || thisBlock.getBlock() == itemCrop1.getBlock()
				|| thisBlock.getBlock() == itemCrop2.getBlock()) {
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeeds);
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
