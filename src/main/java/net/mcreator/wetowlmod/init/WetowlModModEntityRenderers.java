
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wetowlmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.wetowlmod.client.renderer.WetOwlRenderer;
import net.mcreator.wetowlmod.client.renderer.RatRenderer;
import net.mcreator.wetowlmod.client.renderer.PigTestRenderer;
import net.mcreator.wetowlmod.client.renderer.BoogeyRenderer;
import net.mcreator.wetowlmod.client.renderer.BigFloppaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WetowlModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WetowlModModEntities.WET_OWL.get(), WetOwlRenderer::new);
		event.registerEntityRenderer(WetowlModModEntities.BIG_FLOPPA.get(), BigFloppaRenderer::new);
		event.registerEntityRenderer(WetowlModModEntities.PIG_TEST.get(), PigTestRenderer::new);
		event.registerEntityRenderer(WetowlModModEntities.RAT.get(), RatRenderer::new);
		event.registerEntityRenderer(WetowlModModEntities.BOOGEY.get(), BoogeyRenderer::new);
	}
}
