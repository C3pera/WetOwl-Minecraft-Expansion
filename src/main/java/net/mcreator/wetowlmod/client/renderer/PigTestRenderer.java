
package net.mcreator.wetowlmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.wetowlmod.entity.PigTestEntity;

public class PigTestRenderer extends MobRenderer<PigTestEntity, PigModel<PigTestEntity>> {
	public PigTestRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PigTestEntity entity) {
		return new ResourceLocation("wetowl_mod:textures/brownpig_nopatch.png");
	}
}
