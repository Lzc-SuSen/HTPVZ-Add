package com.susen36.pvzadd.client.model.entity.zombie.add;

import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.api.paz.IZombieModel;
import com.hungteen.pvz.utils.AnimationUtil;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.susen36.pvzadd.common.entity.zombie.add.Edgar090547Entity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class Edgar090547Model<T extends Edgar090547Entity> extends EntityModel<T> implements IZombieModel<T>{
	private final ModelRenderer total;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer up;
	private final ModelRenderer body;
	private final ModelRenderer pipe1;
	private final ModelRenderer pipe2;
	private final ModelRenderer head;
	private final ModelRenderer mouse;
	private final ModelRenderer bone3;
	private final ModelRenderer angry;
	private final ModelRenderer left_arm;
	private final ModelRenderer pole;
	private final ModelRenderer right_arm;
	private final ModelRenderer back;
	private final ModelRenderer imp;
	private final ModelRenderer left_leg3;
	private final ModelRenderer right_leg3;
	private final ModelRenderer up3;
	private final ModelRenderer body3;
	private final ModelRenderer right_arm2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer left_arm2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer head3;
	private final ModelRenderer bone;


	public Edgar090547Model() {
		texWidth = 256;
		texHeight = 256;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		left_leg = new ModelRenderer(this);
		left_leg.setPos(6.0F, -41.0F, 0.0F);
		total.addChild(left_leg);
		left_leg.texOffs(155, 211).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 33.0F, 10.0F, 0.0F, false);
		left_leg.texOffs(198, 230).addBox(-6.0F, 33.0F, -8.0F, 12.0F, 8.0F, 16.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setPos(-7.0F, -41.0F, 0.0F);
		total.addChild(right_leg);
		right_leg.texOffs(154, 164).addBox(-4.0F, 0.0F, -3.0F, 10.0F, 33.0F, 10.0F, 0.0F, false);
		right_leg.texOffs(198, 187).addBox(-5.0F, 33.0F, -8.0F, 12.0F, 8.0F, 16.0F, 0.0F, false);

		up = new ModelRenderer(this);
		up.setPos(0.0F, -41.0F, 0.0F);
		total.addChild(up);


		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		up.addChild(body);
		body.texOffs(186, 2).addBox(-11.0F, -40.0F, -4.0F, 22.0F, 40.0F, 12.0F, 0.0F, false);

		pipe1 = new ModelRenderer(this);
		pipe1.setPos(9.0F, -39.0F, 6.0F);
		body.addChild(pipe1);
		setRotationAngle(pipe1, -0.6109F, 0.0F, 0.0F);
		pipe1.texOffs(200, 170).addBox(1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
		pipe1.texOffs(245, 166).addBox(1.0F, -2.0F, 10.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);

		pipe2 = new ModelRenderer(this);
		pipe2.setPos(9.0F, -39.0F, 6.0F);
		body.addChild(pipe2);
		setRotationAngle(pipe2, -0.6109F, 0.0F, 0.0F);
		pipe2.texOffs(226, 150).addBox(-21.0F, -2.0F, 0.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
		pipe2.texOffs(210, 146).addBox(-21.0F, -2.0F, 10.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -40.0F, -3.0F);
		up.addChild(head);
		head.texOffs(188, 58).addBox(-8.0F, -9.0F, -16.0F, 16.0F, 13.0F, 16.0F, 0.0F, false);
		head.texOffs(195, 118).addBox(2.0F, -13.0F, -13.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		head.texOffs(195, 134).addBox(-4.0F, -13.0F, -13.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		head.texOffs(172, 97).addBox(8.0F, -4.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.texOffs(171, 77).addBox(9.0F, -5.0F, -10.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		head.texOffs(176, 103).addBox(-9.0F, -4.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.texOffs(154, 98).addBox(-11.0F, -5.0F, -10.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		mouse = new ModelRenderer(this);
		mouse.setPos(0.0F, 6.0F, -1.0F);
		head.addChild(mouse);
		mouse.texOffs(186, 91).addBox(-8.0F, 0.0F, -15.0F, 16.0F, 3.0F, 16.0F, 0.0F, false);
		mouse.texOffs(134, 6).addBox(-8.0F, -2.0F, -3.0F, 16.0F, 2.0F, 4.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(-1.0F, -1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(1.0F, -2.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(4.0F, -2.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(-2.0F, -2.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(-5.0F, -2.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(-7.0F, -2.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(-8.0F, -2.0F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(-8.0F, -2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(-8.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(7.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(7.0F, -2.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(-1.0F, -1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(2.0F, -1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(6.0F, -1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(-5.0F, -1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(-8.0F, -1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(-8.0F, -1.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(-8.0F, -1.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(7.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(7.0F, -1.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mouse.texOffs(0, 0).addBox(7.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(0.0F, 0.0F, 2.0F);
		head.addChild(bone3);
		setRotationAngle(bone3, 1.1345F, 0.0F, 0.0F);
		bone3.texOffs(151, 151).addBox(-11.0F, -3.0F, 0.0F, 22.0F, 3.0F, 3.0F, 0.0F, false);
		bone3.texOffs(155, 126).addBox(-11.0F, -3.0F, -11.0F, 3.0F, 3.0F, 11.0F, 0.0F, false);
		bone3.texOffs(152, 108).addBox(8.0F, -3.0F, -11.0F, 3.0F, 3.0F, 11.0F, 0.0F, false);
		bone3.texOffs(102, 247).addBox(-11.0F, -3.0F, -14.0F, 22.0F, 3.0F, 3.0F, 0.0F, false);

		angry = new ModelRenderer(this);
		angry.setPos(-2.0F, -1.0F, -17.0F);
		head.addChild(angry);


		left_arm = new ModelRenderer(this);
		left_arm.setPos(15.0F, -35.0F, 2.0F);
		up.addChild(left_arm);
		left_arm.texOffs(108, 180).addBox(-4.0F, 0.0F, -5.0F, 10.0F, 44.0F, 10.0F, 0.6F, false);

		pole = new ModelRenderer(this);
		pole.setPos(4.0F, 46.0F, -12.0F);
		left_arm.addChild(pole);
		pole.texOffs(185, 98).addBox(-1.0F, 7.0F, -39.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		pole.texOffs(185, 98).addBox(-1.0F, -10.0F, -39.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		pole.texOffs(0, 102).addBox(-2.0F, -3.0F, -50.0F, 4.0F, 4.0F, 72.0F, 0.0F, false);
		pole.texOffs(47, 117).addBox(-2.0F, -13.0F, -36.0F, 4.0F, 24.0F, 3.0F, 0.2F, false);
		pole.texOffs(47, 117).addBox(-2.0F, -9.0F, -46.0F, 4.0F, 16.0F, 3.0F, 0.2F, false);
		pole.texOffs(185, 98).addBox(-1.0F, -7.0F, -49.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		pole.texOffs(185, 98).addBox(-1.0F, 3.0F, -49.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setPos(-16.0F, -35.0F, 2.0F);
		up.addChild(right_arm);
		right_arm.texOffs(108, 180).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 44.0F, 10.0F, 0.6F, false);

		back = new ModelRenderer(this);
		back.setPos(0.0F, -23.0F, 23.0F);
		up.addChild(back);
		back.texOffs(135, 16).addBox(-8.0F, -15.0F, -15.0F, 16.0F, 17.0F, 1.0F, 0.0F, false);
		back.texOffs(40, 84).addBox(-8.0F, 2.0F, -15.0F, 16.0F, 1.0F, 17.0F, 0.0F, false);
		back.texOffs(29, 211).addBox(8.0F, -15.0F, -15.0F, 1.0F, 17.0F, 18.0F, 0.0F, false);
		back.texOffs(33, 96).addBox(-8.0F, -15.0F, 2.0F, 16.0F, 17.0F, 1.0F, 0.0F, false);
		back.texOffs(29, 211).addBox(-9.0F, -15.0F, -15.0F, 1.0F, 17.0F, 18.0F, 0.0F, false);

		imp = new ModelRenderer(this);
		imp.setPos(0.0F, 3.0F, -1.0F);
		back.addChild(imp);


		left_leg3 = new ModelRenderer(this);
		left_leg3.setPos(2.0F, -12.0F, 0.0F);
		imp.addChild(left_leg3);
		left_leg3.texOffs(125, 82).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		right_leg3 = new ModelRenderer(this);
		right_leg3.setPos(-3.0F, -12.0F, 0.0F);
		imp.addChild(right_leg3);
		right_leg3.texOffs(6, 76).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		up3 = new ModelRenderer(this);
		up3.setPos(0.0F, -12.0F, 0.0F);
		imp.addChild(up3);


		body3 = new ModelRenderer(this);
		body3.setPos(0.0F, 0.0F, 0.0F);
		up3.addChild(body3);
		body3.texOffs(2, 24).addBox(-5.0F, -16.0F, -2.0F, 10.0F, 15.0F, 4.0F, 0.0F, false);

		right_arm2 = new ModelRenderer(this);
		right_arm2.setPos(-7.0F, -14.0F, 0.0F);
		up3.addChild(right_arm2);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.25F, 0.0F, 0.0F);
		right_arm2.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.texOffs(0, 1).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 15.0F, 4.0F, -0.1F, false);

		left_arm2 = new ModelRenderer(this);
		left_arm2.setPos(7.0F, -14.0F, 0.0F);
		up3.addChild(left_arm2);


		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-0.25F, 0.0F, 0.0F);
		left_arm2.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
		cube_r2.texOffs(146, 68).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 15.0F, 4.0F, -0.1F, false);

		head3 = new ModelRenderer(this);
		head3.setPos(0.0F, -16.0F, 0.0F);
		up3.addChild(head3);


		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 89.0F, -22.0F);
		head3.addChild(bone);
		bone.texOffs(49, 23).addBox(-5.0F, -97.0F, 17.0F, 10.0F, 10.0F, 10.0F, 0.3F, false);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.head.yRot = netHeadYaw / (180F / (float)Math.PI);
		this.head.xRot = headPitch / (180F / (float)Math.PI);
		if(entity.getAttackTime() == 0) {
			this.left_leg.xRot = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
			this.right_leg.xRot = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
			this.right_arm.xRot = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
			this.left_arm.xRot = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
			this.up.xRot = 0;
		} else if(entity.getAttackTime() > 0) {// normal attack
			int total = entity.getCrushCD();
			int now = total - entity.getAttackTime();
			int frontT = total * 2 / 3;
			if(now < frontT) {
				this.left_arm.xRot = AnimationUtil.getUpDown(now, frontT, - 120);
				this.left_arm.yRot = 0;
			} else {
				this.left_arm.xRot = AnimationUtil.getUpDown(now - frontT , total - frontT, 30);
				this.left_arm.yRot = AnimationUtil.getUpDown(now - frontT , total - frontT, 30);
			}
			this.up.xRot = AnimationUtil.getUpDownUpDown(now, total, - 15);
			this.right_leg.xRot = 0;
			this.left_leg.xRot = 0;
			this.right_arm.xRot = 0;
		} else {
			int total = entity.getThrowCD();
			int now = total + entity.getAttackTime();
			int frontT = total * 3 / 4;
			if(now < frontT) {
				this.right_arm.xRot = AnimationUtil.getUp(now, frontT, - 225);
			} else {
				this.right_arm.xRot = AnimationUtil.getDown(now - frontT, total - frontT, - 225);
			}
			this.left_arm.xRot = 0;
			this.right_leg.xRot = 0;
			this.left_leg.xRot = 0;
			this.up.xRot = 0;
		}
			this.angry.visible = entity.isSad;
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public void tickPartAnim(IBodyEntity entity, float limbSwing, float limbSwingAmount,
			float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderBody(IBodyEntity entity, MatrixStack stack, IVertexBuilder buffer, int packedLight,
						   int packedOverlay) {

		this.angry.visible = entity.hasHandDefence();
		this.total.render(stack, buffer, packedLight, packedOverlay);
	}
	


	@Override
	public EntityModel<T> getZombieModel() {
		return this;
	}
}