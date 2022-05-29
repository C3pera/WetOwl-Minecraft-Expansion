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
public class Modelbigfloppa<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("wetowl_mod", "modelbigfloppa"), "main");
	public final ModelPart tail;
	public final ModelPart backleftleg;
	public final ModelPart backrightleg;
	public final ModelPart frontrightleg;
	public final ModelPart frontleftleg;
	public final ModelPart body;
	public final ModelPart head;

	public Modelbigfloppa(ModelPart root) {
		this.tail = root.getChild("tail");
		this.backleftleg = root.getChild("backleftleg");
		this.backrightleg = root.getChild("backrightleg");
		this.frontrightleg = root.getChild("frontrightleg");
		this.frontleftleg = root.getChild("frontleftleg");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 9.0F));
		PartDefinition cube_r1 = tail.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(26, 23).addBox(-0.65F, -1.0F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 7.0F));
		PartDefinition cube_r2 = tail2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(14, 24).addBox(-0.65F, 4.5F, 7.4F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, -8.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition backleftleg = partdefinition.addOrReplaceChild("backleftleg",
				CubeListBuilder.create().texOffs(0, 34).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 17.0F, 6.0F));
		PartDefinition backrightleg = partdefinition.addOrReplaceChild("backrightleg",
				CubeListBuilder.create().texOffs(26, 23).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 17.0F, 6.0F));
		PartDefinition frontrightleg = partdefinition.addOrReplaceChild("frontrightleg",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.6F, 14.0F, -4.0F));
		PartDefinition frontleftleg = partdefinition.addOrReplaceChild("frontleftleg",
				CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 14.0F, -4.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.7F, -2.0F, -8.0F, 5.0F, 6.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 23).addBox(-3.5F, -3.0F, -5.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(-2.0F, -1.0F, -6.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 3)
						.addBox(0.0F, -6.0F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 7)
						.addBox(-3.0F, -6.0F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 34)
						.addBox(1.0F, -8.0F, -3.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 34).mirror()
						.addBox(-5.0F, -8.0F, -3.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.3F, 14.0F, -9.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backleftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backrightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frontrightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frontleftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.backleftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.tail.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.backrightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.frontrightleg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.frontleftleg.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
