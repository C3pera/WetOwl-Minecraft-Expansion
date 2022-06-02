
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wetowlmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.wetowlmod.client.model.Modelrat;
import net.mcreator.wetowlmod.client.model.Modelcustom_model;
import net.mcreator.wetowlmod.client.model.Modelboogey;
import net.mcreator.wetowlmod.client.model.Modelbigfloppa;
import net.mcreator.wetowlmod.client.model.Modelaxolotl_test_texturing;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WetowlModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelaxolotl_test_texturing.LAYER_LOCATION, Modelaxolotl_test_texturing::createBodyLayer);
		event.registerLayerDefinition(Modelbigfloppa.LAYER_LOCATION, Modelbigfloppa::createBodyLayer);
		event.registerLayerDefinition(Modelrat.LAYER_LOCATION, Modelrat::createBodyLayer);
		event.registerLayerDefinition(Modelboogey.LAYER_LOCATION, Modelboogey::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
