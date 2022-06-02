
package net.mcreator.wetowlmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wetowlmod.entity.BoogeyEntity;
import net.mcreator.wetowlmod.client.model.Modelboogey;

public class BoogeyRenderer extends MobRenderer<BoogeyEntity, Modelboogey<BoogeyEntity>> {
	public BoogeyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboogey(context.bakeLayer(Modelboogey.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoogeyEntity entity) {
		return new ResourceLocation("wetowl_mod:textures/boogey.png");
	}
}
