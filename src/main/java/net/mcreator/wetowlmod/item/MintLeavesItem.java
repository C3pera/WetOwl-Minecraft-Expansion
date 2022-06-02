
package net.mcreator.wetowlmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.wetowlmod.init.WetowlModModTabs;

public class MintLeavesItem extends Item {
	public MintLeavesItem() {
		super(new Item.Properties().tab(WetowlModModTabs.TAB_OWL_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.2f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
