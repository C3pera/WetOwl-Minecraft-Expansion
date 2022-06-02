package net.mcreator.wetowlmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelaxolotl_test_texturing<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("wetowl_mod", "modelaxolotl_test_texturing"),
			"main");
	public final ModelPart details;
	public final ModelPart bb_main;

	public Modelaxolotl_test_texturing(ModelPart root) {
		this.details = root.getChild("details");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition details = partdefinition.addOrReplaceChild("details",
				CubeListBuilder.create().texOffs(0, 22).addBox(5.0F, -5.0F, -5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 16)
						.addBox(5.0F, -6.0F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 16)
						.addBox(5.0F, -7.0F, -7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 2)
						.addBox(5.0F, -5.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 4)
						.addBox(5.0F, -3.0F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(5.0F, -2.0F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 3)
						.addBox(5.0F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 4)
						.addBox(5.0F, -6.0F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(5.0F, -7.0F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 6)
						.addBox(5.0F, -1.0F, -5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 6)
						.addBox(5.0F, -6.0F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(5.0F, -6.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(5.0F, -2.0F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(5.0F, -7.0F, -3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 12)
						.addBox(5.0F, -7.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 14)
						.addBox(5.0F, -3.0F, -7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 14)
						.addBox(5.0F, -8.0F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 12)
						.addBox(5.0F, -8.0F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 24.0F, 0.0F));
		PartDefinition wingleft = details.addOrReplaceChild("wingleft", CubeListBuilder.create(), PartPose.offset(-3.0F, 0.0F, -2.0F));
		PartDefinition wing2left = wingleft.addOrReplaceChild("wing2left",
				CubeListBuilder.create().texOffs(4, 24).addBox(0.7071F, -1.0F, -4.7071F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(19, 26)
						.addBox(0.7071F, -1.0F, -0.7071F, 0.0F, 1.0F, -3.0F, new CubeDeformation(0.0F)).texOffs(12, 24)
						.addBox(0.7071F, -2.0F, -3.7071F, 0.0F, 3.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition wing1left = wingleft.addOrReplaceChild("wing1left",
				CubeListBuilder.create().texOffs(25, 26).addBox(0.7071F, -1.0F, -0.7071F, 0.0F, 1.0F, -3.0F, new CubeDeformation(0.0F)).texOffs(4, 25)
						.addBox(0.7071F, -1.0F, -4.7071F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(14, 24)
						.addBox(0.7071F, -2.0F, -3.7071F, 0.0F, 3.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition wingright = details.addOrReplaceChild("wingright", CubeListBuilder.create(), PartPose.offset(-3.0F, 0.0F, 7.0F));
		PartDefinition wing1right = wingright.addOrReplaceChild("wing1right",
				CubeListBuilder.create().texOffs(31, 26).addBox(-1.2071F, -1.0F, 2.2929F, 0.0F, 1.0F, -3.0F, new CubeDeformation(0.0F)).texOffs(9, 24)
						.addBox(-1.2071F, -2.0F, 3.2929F, 0.0F, 3.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(5, 24)
						.addBox(-1.2071F, -1.0F, 4.2929F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition wing2right = wingright.addOrReplaceChild("wing2right",
				CubeListBuilder.create().texOffs(5, 25).addBox(-0.7071F, -1.0F, 4.2929F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(7, 24)
						.addBox(-0.7071F, -2.0F, 3.2929F, 0.0F, 3.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(6, 29)
						.addBox(-0.7071F, -1.0F, 2.2929F, 0.0F, 1.0F, -3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, 0.0F, -3.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition tail = details.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(18, 5).addBox(-4.0F, -5.0F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition end = tail.addOrReplaceChild("end",
				CubeListBuilder.create().texOffs(18, 0).addBox(-6.0F, -5.0F, -1.0F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -4.0F, -1.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-11.0F, -3.0F, -1.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 0.0F, 1.0F));
		PartDefinition bb_main = partdefinition
				.addOrReplaceChild(
						"bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, -5.0F, -4.0F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
								.texOffs(0, 13).addBox(-6.0F, -4.0F, -3.0F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		details.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.details.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
