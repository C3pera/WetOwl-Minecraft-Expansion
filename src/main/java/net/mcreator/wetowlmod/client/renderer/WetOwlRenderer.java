
package net.mcreator.wetowlmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wetowlmod.entity.WetOwlEntity;
import net.mcreator.wetowlmod.client.model.Modelcustom_model;

public class WetOwlRenderer extends MobRenderer<WetOwlEntity, Modelcustom_model<WetOwlEntity>> {
	public WetOwlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WetOwlEntity entity) {
		return new ResourceLocation("wetowl_mod:textures/wetowl3texture.png");
	}
}
