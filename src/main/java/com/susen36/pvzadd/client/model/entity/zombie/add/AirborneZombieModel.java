package com.susen36.pvzadd.client.model.entity.zombie.add;

import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.susen36.pvzadd.common.entity.zombie.add.AirborneZombieEntity;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class AirborneZombieModel extends PVZZombieModel<AirborneZombieEntity> {
	private final ModelRenderer total;
	private final ModelRenderer zombie;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer up;
	private final ModelRenderer left_hand;
	private final ModelRenderer right_hand;
	private final ModelRenderer head;

	public AirborneZombieModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, -12.0F, 0.0F);
		setRotationAngle(total, 0.7854F, 0.0F, 0.0F);


		zombie = new ModelRenderer(this);
		zombie.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(zombie);


		left_leg = new ModelRenderer(this);
		left_leg.setPos(4.0F, 13.0F, 0.0F);
		zombie.addChild(left_leg);
		setRotationAngle(left_leg, -0.7854F, 0.0F, 0.0F);
		left_leg.texOffs(44, 0).addBox(-5.0F, -1.0F, -3.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setPos(-4.0F, 13.0F, 0.0F);
		zombie.addChild(right_leg);
		setRotationAngle(right_leg, -0.7854F, 0.0F, 0.0F);
		right_leg.texOffs(0, 0).addBox(-5.0F, -1.0F, -3.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		up = new ModelRenderer(this);
		up.setPos(0.0F, 12.0F, 0.0F);
		zombie.addChild(up);
		setRotationAngle(up, 0.5236F, 0.0F, 0.0F);
		up.texOffs(0, 41).addBox(-8.0F, -24.0F, -4.0F, 16.0F, 24.0F, 8.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(12.0F, -20.0F, 0.0F);
		up.addChild(left_hand);
		setRotationAngle(left_hand, -1.5708F, -0.2182F, 0.0F);
		left_hand.texOffs(96, 60).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-12.0F, -20.0F, 0.0F);
		up.addChild(right_hand);
		setRotationAngle(right_hand, -1.6144F, 0.2182F, 0.0F);
		right_hand.texOffs(96, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -24.0F, 0.0F);
		up.addChild(head);
		setRotationAngle(head, -1.0908F, 0.0F, 0.0F);
		head.texOffs(16, 96).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
	}


	@Override
	public void setupAnim(AirborneZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final boolean hasLine = entity.hasLine();

		if(hasLine) {
			this.zombie.xRot = 1.0472F;
			this.left_leg.xRot = - 0.7854F;
			this.right_leg.xRot = - 0.7854F;
			this.up.xRot = 0.2618F;
			this.left_hand.xRot = -1.7453F;
			this.right_hand.xRot = -1.7453F;
			this.head.xRot = -1.0472F;
			this.head.yRot = 0;
			this.updateFreeParts(entity);
		} else {
			this.up.xRot = 0;
			this.zombie.xRot = -0.75F;
			
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
		this.updateFreeParts(entity);
	}

	@Override
	public void updateFreeParts(AirborneZombieEntity entity) {
		super.updateFreeParts(entity);
		final boolean hasLine = entity.hasLine();

		this.isLeftHandFree = !hasLine;
	    this.isRightHandFree = !hasLine;
	}

	@Override
	public void tickPartAnim(IBodyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.left_leg.xRot = 0;
		this.right_leg.xRot = 0;
		this.up.xRot = 0;
		this.head.xRot = 0;
		this.left_hand.xRot = 0;
		this.right_hand.xRot = 0;
		this.zombie.xRot = 0;

		super.tickPartAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}

	@Override
	public void renderBody(IBodyEntity entity, MatrixStack stack, IVertexBuilder buffer, int packedLight,
						   int packedOverlay) {

		super.renderBody(entity, stack, buffer, packedLight, packedOverlay);
	}


	@Override
	public ModelRenderer getZombieLeftHand() {
		return this.left_hand;
	}

	@Override
	public ModelRenderer getZombieRightHand() {
		return this.right_hand;
	}

	@Override
	public ModelRenderer getZombieLeftLeg() {
		return this.left_leg;
	}

	@Override
	public ModelRenderer getZombieRightLeg() {
		return this.right_leg;
	}

	@Override
	public ModelRenderer getZombieHead() {
		return this.head;
	}

	@Override
	public ModelRenderer getZombieUpBody() {
		return this.up;
	}

	@Override
	public ModelRenderer getZombieWholeBody() {
		return this.total;
	}
}