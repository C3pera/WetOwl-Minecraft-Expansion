
package net.mcreator.wetowlmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class MintLeavesItem extends Item {

	public MintLeavesItem() {
		super(new Item.Properties().tab(WetowlModModTabs.TAB_DELETED_MOD_ELEMENT).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.2f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

}
