
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wetowlmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.wetowlmod.entity.WetOwlEntity;
import net.mcreator.wetowlmod.entity.RatEntity;
import net.mcreator.wetowlmod.entity.PigTestEntity;
import net.mcreator.wetowlmod.entity.BoogeyEntity;
import net.mcreator.wetowlmod.entity.BigFloppaEntity;
import net.mcreator.wetowlmod.WetowlModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WetowlModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, WetowlModMod.MODID);
	public static final RegistryObject<EntityType<WetOwlEntity>> WET_OWL = register("wet_owl",
			EntityType.Builder.<WetOwlEntity>of(WetOwlEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WetOwlEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BigFloppaEntity>> BIG_FLOPPA = register("big_floppa",
			EntityType.Builder.<BigFloppaEntity>of(BigFloppaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigFloppaEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<PigTestEntity>> PIG_TEST = register("pig_test",
			EntityType.Builder.<PigTestEntity>of(PigTestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PigTestEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<RatEntity>> RAT = register("rat",
			EntityType.Builder.<RatEntity>of(RatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RatEntity::new)

					.sized(0.6f, 0.4f));
	public static final RegistryObject<EntityType<BoogeyEntity>> BOOGEY = register("boogey",
			EntityType.Builder.<BoogeyEntity>of(BoogeyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BoogeyEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WetOwlEntity.init();
			BigFloppaEntity.init();
			PigTestEntity.init();
			RatEntity.init();
			BoogeyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WET_OWL.get(), WetOwlEntity.createAttributes().build());
		event.put(BIG_FLOPPA.get(), BigFloppaEntity.createAttributes().build());
		event.put(PIG_TEST.get(), PigTestEntity.createAttributes().build());
		event.put(RAT.get(), RatEntity.createAttributes().build());
		event.put(BOOGEY.get(), BoogeyEntity.createAttributes().build());
	}
}
