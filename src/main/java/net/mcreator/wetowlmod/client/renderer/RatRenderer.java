
package net.mcreator.wetowlmod.client.renderer;

public class RatRenderer extends MobRenderer<RatEntity, Modelrat<RatEntity>> {

	public RatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrat(context.bakeLayer(Modelrat.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(RatEntity entity) {
		return new ResourceLocation("wetowl_mod:textures/rat.png");
	}

}
