
package net.mcreator.wetowlmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.wetowlmod.entity.AxolotlTestEntity;

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
