
package net.mcreator.wetowlmod.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.wetowlmod.init.WetowlModModTabs;
import net.mcreator.wetowlmod.init.WetowlModModSounds;

public class DiscburningmemoryItem extends RecordItem {
	public DiscburningmemoryItem() {
		super(0, WetowlModModSounds.REGISTRY.get(new ResourceLocation("wetowl_mod:record_just_burning_memory")),
				new Item.Properties().tab(WetowlModModTabs.TAB_OWL_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
