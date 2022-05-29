
package net.mcreator.wetowlmod.client.renderer;

public class PigTestRenderer extends MobRenderer<PigTestEntity, PigModel<PigTestEntity>> {

	public PigTestRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(PigTestEntity entity) {
		return new ResourceLocation("wetowl_mod:textures/brownpig_nopatch.png");
	}

}
