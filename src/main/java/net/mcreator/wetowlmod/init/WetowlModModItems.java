
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

import net.mcreator.wetowlmod.item.RhodeslofiItem;
import net.mcreator.wetowlmod.item.BurningMemoryItem;
import net.mcreator.wetowlmod.WetowlModMod;

public class WetowlModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WetowlModMod.MODID);
	public static final RegistryObject<Item> WET_OWL = REGISTRY.register("wet_owl_spawn_egg",
			() -> new ForgeSpawnEggItem(WetowlModModEntities.WET_OWL, -6513508, -12510180, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RHODESLOFI = REGISTRY.register("rhodeslofi", () -> new RhodeslofiItem());
	public static final RegistryObject<Item> BURNING_MEMORY = REGISTRY.register("burning_memory", () -> new BurningMemoryItem());
			() -> new ForgeSpawnEggItem(WetowlModModEntities.WET_OWL, -8026747, -14218228, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BIG_FLOPPA = REGISTRY.register("big_floppa_spawn_egg",
			() -> new ForgeSpawnEggItem(WetowlModModEntities.BIG_FLOPPA, -9745608, -12836070, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PIG_TEST = REGISTRY.register("pig_test_spawn_egg",
			() -> new ForgeSpawnEggItem(WetowlModModEntities.PIG_TEST, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RAT = REGISTRY.register("rat_spawn_egg",
			() -> new ForgeSpawnEggItem(WetowlModModEntities.RAT, -1, -20501, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
