
package net.mcreator.wetowlmod.client.renderer;

public class BoogeyRenderer extends MobRenderer<BoogeyEntity, Modelboogey<BoogeyEntity>> {

	public BoogeyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboogey(context.bakeLayer(Modelboogey.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(BoogeyEntity entity) {
		return new ResourceLocation("wetowl_mod:textures/boogey.png");
	}

}
