
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wetowlmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WetowlModModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("wetowl_mod", "record_juzz"), new SoundEvent(new ResourceLocation("wetowl_mod", "record_juzz")));
		REGISTRY.put(new ResourceLocation("wetowl_mod", "record_rhodes_lofi"),
				new SoundEvent(new ResourceLocation("wetowl_mod", "record_rhodes_lofi")));
		REGISTRY.put(new ResourceLocation("wetowl_mod", "record_just_burning_memory"),
				new SoundEvent(new ResourceLocation("wetowl_mod", "record_just_burning_memory")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
