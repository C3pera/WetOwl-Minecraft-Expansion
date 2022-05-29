// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelrat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "rat"),
			"main");
	private final ModelPart backrightleg;
	private final ModelPart backleftleg;
	private final ModelPart frontleftleg;
	private final ModelPart frontrightleg;
	private final ModelPart tail;
	private final ModelPart head;
	private final ModelPart body;

	public Modelrat(ModelPart root) {
		this.backrightleg = root.getChild("backrightleg");
		this.backleftleg = root.getChild("backleftleg");
		this.frontleftleg = root.getChild("frontleftleg");
		this.frontrightleg = root.getChild("frontrightleg");
		this.tail = root.getChild("tail");
		this.head = root.getChild("head");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition backrightleg = partdefinition.addOrReplaceChild("backrightleg",
				CubeListBuilder.create().texOffs(0, 7)
						.addBox(-0.25F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 4)
						.addBox(-0.25F, 1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 22.0F, 3.25F));

		PartDefinition backleftleg = partdefinition.addOrReplaceChild("backleftleg",
				CubeListBuilder.create().texOffs(12, 12)
						.addBox(-0.75F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 14)
						.addBox(-0.75F, 1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 22.0F, 3.25F));

		PartDefinition frontleftleg = partdefinition.addOrReplaceChild("frontleftleg",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(0.0F, 1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 22.0F, -1.0F));

		PartDefinition frontrightleg = partdefinition.addOrReplaceChild("frontrightleg",
				CubeListBuilder.create().texOffs(16, 14)
						.addBox(-1.0F, 0.0436F, -2.001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 16)
						.addBox(-1.0F, 1.0436F, -3.001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 22.0F, -1.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(-0.5F, 21.0F, 6.0F));

		PartDefinition cube_r1 = tail
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -1.0F, -0.25F, 1.0F, 1.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(12, 0)
						.addBox(-1.0F, -1.5F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 14)
						.addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(0.25F, -1.4F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-1.25F, -1.4F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-1.75F, -2.25F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.75F, -2.25F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, -3.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(8, 7)
						.addBox(-1.5F, -3.5F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -4.0F, 0.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 17)
						.addBox(-0.5F, -3.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		backrightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backleftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frontleftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frontrightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.backleftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.tail.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.backrightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.frontrightleg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.frontleftleg.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}