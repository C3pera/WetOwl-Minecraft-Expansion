
package net.mcreator.wetowlmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.wetowlmod.init.WetowlModModTabs;

public class RusalkaClawItem extends Item {
	public RusalkaClawItem() {
		super(new Item.Properties().tab(WetowlModModTabs.TAB_OWL_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
