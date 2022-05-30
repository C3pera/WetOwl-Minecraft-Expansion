
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wetowlmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.wetowlmod.block.Mint3Block;
import net.mcreator.wetowlmod.block.Mint2Block;
import net.mcreator.wetowlmod.block.Mint1Block;
import net.mcreator.wetowlmod.block.Mint0Block;
import net.mcreator.wetowlmod.WetowlModMod;

public class WetowlModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WetowlModMod.MODID);
	public static final RegistryObject<Block> MINT_0 = REGISTRY.register("mint_0", () -> new Mint0Block());
	public static final RegistryObject<Block> MINT_1 = REGISTRY.register("mint_1", () -> new Mint1Block());
	public static final RegistryObject<Block> MINT_2 = REGISTRY.register("mint_2", () -> new Mint2Block());
	public static final RegistryObject<Block> MINT_3 = REGISTRY.register("mint_3", () -> new Mint3Block());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			Mint0Block.registerRenderLayer();
			Mint1Block.registerRenderLayer();
			Mint2Block.registerRenderLayer();
			Mint3Block.registerRenderLayer();
		}
	}
}
