
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wetowlmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.wetowlmod.block.entity.Mint3BlockEntity;
import net.mcreator.wetowlmod.block.entity.Mint2BlockEntity;
import net.mcreator.wetowlmod.block.entity.Mint1BlockEntity;
import net.mcreator.wetowlmod.block.entity.Mint0BlockEntity;
import net.mcreator.wetowlmod.WetowlModMod;

public class WetowlModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, WetowlModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> MINT_0 = register("mint_0", WetowlModModBlocks.MINT_0, Mint0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MINT_1 = register("mint_1", WetowlModModBlocks.MINT_1, Mint1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MINT_2 = register("mint_2", WetowlModModBlocks.MINT_2, Mint2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MINT_3 = register("mint_3", WetowlModModBlocks.MINT_3, Mint3BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
