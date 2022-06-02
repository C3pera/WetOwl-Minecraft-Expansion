// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelboogey<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "boogey"), "main");
	private final ModelPart face;
	private final ModelPart body;
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart leftleg;
	private final ModelPart rightleg;

	public Modelboogey(ModelPart root) {
		this.face = root.getChild("face");
		this.body = root.getChild("body");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition face = partdefinition.addOrReplaceChild("face", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = face.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(6, 34)
						.addBox(-1.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-1.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -3.5F, -3.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -9.0F, -3.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(16, 24)
						.addBox(-4.0F, -9.0F, -3.05F, 7.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-4.0F, -8.9F, 3.05F, 7.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -7.0F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, -8.0F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -7.0F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -6.0F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -8.0F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 8).addBox(-3.0F, -3.9F, -9.05F, 7.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -1.5708F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-3.1F, -8.9F, -3.05F, 7.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 14)
						.addBox(-3.0F, -8.9F, 3.05F, 7.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 34)
				.addBox(-1.0F, -1.05F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 17.05F, 0.5F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(32, 22)
				.addBox(-1.0F, -1.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 17.0F, 0.5F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(32, 16)
				.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 22.0F, 0.5F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(29, 31)
				.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 22.0F, 0.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		face.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}