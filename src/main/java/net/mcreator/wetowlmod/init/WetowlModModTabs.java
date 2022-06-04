
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wetowlmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WetowlModModTabs {
	public static CreativeModeTab TAB_OWL_CREATURES;
	public static CreativeModeTab TAB_OWL_MISC;
	public static CreativeModeTab TAB_OWL_FOOD;

	public static void load() {
		TAB_OWL_CREATURES = new CreativeModeTab("tabowl_creatures") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.AXOLOTL_BUCKET);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_OWL_MISC = new CreativeModeTab("tabowl_misc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WetowlModModItems.DISC_EIENROJIN_MUSIC.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_OWL_FOOD = new CreativeModeTab("tabowl_food") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WetowlModModItems.MINT_LEAVES.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
