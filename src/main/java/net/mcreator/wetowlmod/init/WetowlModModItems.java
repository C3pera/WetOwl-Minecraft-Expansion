
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wetowlmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.wetowlmod.item.MintSeedItem;
import net.mcreator.wetowlmod.item.MintLeavesItem;
import net.mcreator.wetowlmod.item.DiscrhodeslofiItem;
import net.mcreator.wetowlmod.item.DiscburningmemoryItem;
import net.mcreator.wetowlmod.item.DiscEienrojinMusicItem;
import net.mcreator.wetowlmod.WetowlModMod;

public class WetowlModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WetowlModMod.MODID);
	public static final RegistryObject<Item> WET_OWL = REGISTRY.register("wet_owl_spawn_egg",
			() -> new ForgeSpawnEggItem(WetowlModModEntities.WET_OWL, -6513508, -12510180,
					new Item.Properties().tab(WetowlModModTabs.TAB_OWL_CREATURES)));
	public static final RegistryObject<Item> BIG_FLOPPA = REGISTRY.register("big_floppa_spawn_egg",
			() -> new ForgeSpawnEggItem(WetowlModModEntities.BIG_FLOPPA, -9745608, -12836070,
					new Item.Properties().tab(WetowlModModTabs.TAB_OWL_CREATURES)));
	public static final RegistryObject<Item> PIG_TEST = REGISTRY.register("pig_test_spawn_egg",
			() -> new ForgeSpawnEggItem(WetowlModModEntities.PIG_TEST, -1, -1, new Item.Properties().tab(WetowlModModTabs.TAB_OWL_CREATURES)));
	public static final RegistryObject<Item> RAT = REGISTRY.register("rat_spawn_egg",
			() -> new ForgeSpawnEggItem(WetowlModModEntities.RAT, -1, -20501, new Item.Properties().tab(WetowlModModTabs.TAB_OWL_CREATURES)));
	public static final RegistryObject<Item> AXOLOTL_TEST = REGISTRY.register("axolotl_test_spawn_egg",
			() -> new ForgeSpawnEggItem(WetowlModModEntities.AXOLOTL_TEST, -65293, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DISCRHODESLOFI = REGISTRY.register("discrhodeslofi", () -> new DiscrhodeslofiItem());
	public static final RegistryObject<Item> BOOGEY = REGISTRY.register("boogey_spawn_egg",
			() -> new ForgeSpawnEggItem(WetowlModModEntities.BOOGEY, -14869219, -6868466, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DISCBURNINGMEMORY = REGISTRY.register("discburningmemory", () -> new DiscburningmemoryItem());
	public static final RegistryObject<Item> DISC_EIENROJIN_MUSIC = REGISTRY.register("disc_eienrojin_music", () -> new DiscEienrojinMusicItem());
	public static final RegistryObject<Item> MINT_SEED = REGISTRY.register("mint_seed", () -> new MintSeedItem());
	public static final RegistryObject<Item> MINT_0 = block(WetowlModModBlocks.MINT_0, null);
	public static final RegistryObject<Item> MINT_1 = block(WetowlModModBlocks.MINT_1, null);
	public static final RegistryObject<Item> MINT_2 = block(WetowlModModBlocks.MINT_2, null);
	public static final RegistryObject<Item> MINT_3 = block(WetowlModModBlocks.MINT_3, null);
	public static final RegistryObject<Item> MINT_LEAVES = REGISTRY.register("mint_leaves", () -> new MintLeavesItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
