
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wetowlmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.wetowlmod.WetowlModMod;

public class WetowlModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WetowlModMod.MODID);
	public static final RegistryObject<Item> WET_OWL = REGISTRY.register("wet_owl_spawn_egg",
			() -> new ForgeSpawnEggItem(WetowlModModEntities.WET_OWL, -8026747, -14218228, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BIG_FLOPPA = REGISTRY.register("big_floppa_spawn_egg",
			() -> new ForgeSpawnEggItem(WetowlModModEntities.BIG_FLOPPA, -9745608, -12836070, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
