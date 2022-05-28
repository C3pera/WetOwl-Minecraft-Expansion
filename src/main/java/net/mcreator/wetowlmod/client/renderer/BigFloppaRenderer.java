
package net.mcreator.wetowlmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wetowlmod.entity.BigFloppaEntity;
import net.mcreator.wetowlmod.client.model.Modelbigfloppa;

public class BigFloppaRenderer extends MobRenderer<BigFloppaEntity, Modelbigfloppa<BigFloppaEntity>> {
	public BigFloppaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigfloppa(context.bakeLayer(Modelbigfloppa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigFloppaEntity entity) {
		return new ResourceLocation("wetowl_mod:textures/bigfloppafin.png");
	}
}
