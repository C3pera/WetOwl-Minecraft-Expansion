package net.mcreator.wetowlmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CropLightGrothConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(new BlockPos(x + 0.5, y + 0.5, z + 0.5)) >= 9) {
			return true;
		}
		return false;
	}
}
