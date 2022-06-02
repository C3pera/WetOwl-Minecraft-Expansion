
package net.mcreator.wetowlmod.item;

import net.minecraft.network.chat.Component;

public class DiscrhodeslofiItem extends RecordItem {

	public DiscrhodeslofiItem() {
		super(0, WetowlModModSounds.REGISTRY.get(new ResourceLocation("wetowl_mod:record_rhodes_lofi")),
				new Item.Properties().tab(WetowlModModTabs.TAB_DELETED_MOD_ELEMENT).stacksTo(1).rarity(Rarity.RARE));
	}

}
