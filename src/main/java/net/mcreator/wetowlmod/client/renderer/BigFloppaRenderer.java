
package net.mcreator.wetowlmod.client.renderer;

public class BigFloppaRenderer extends MobRenderer<BigFloppaEntity, Modelbigfloppa<BigFloppaEntity>> {

	public BigFloppaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigfloppa(context.bakeLayer(Modelbigfloppa.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(BigFloppaEntity entity) {
		return new ResourceLocation("wetowl_mod:textures/bigfloppafin.png");
	}

}
