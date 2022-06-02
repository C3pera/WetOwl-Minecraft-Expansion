
package net.mcreator.wetowlmod.client.renderer;

public class AxolotlTestRenderer extends HumanoidMobRenderer<AxolotlTestEntity, HumanoidModel<AxolotlTestEntity>> {

	public AxolotlTestRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(AxolotlTestEntity entity) {
		return new ResourceLocation("wetowl_mod:textures/axolotl_black.png");
	}

}
