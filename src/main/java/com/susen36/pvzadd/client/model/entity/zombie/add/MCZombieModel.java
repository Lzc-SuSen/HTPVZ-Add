package com.susen36.pvzadd.client.model.entity.zombie.add;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.susen36.pvzadd.common.entity.zombie.add.MCZombieEntity;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class MCZombieModel extends PVZZombieModel<MCZombieEntity> {
	private final ModelRenderer total;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer up;
	private final ModelRenderer body;
	private final ModelRenderer left_hand;
	private final ModelRenderer right_hand;
	private final ModelRenderer head;
	private final ModelRenderer getZombieLeftHand;
	private final ModelRenderer getZombieRightHand;
	private final ModelRenderer getZombieLeftLeg;
	private final ModelRenderer getZombieRightLeg;
	private final ModelRenderer getZombieHead;
	private final ModelRenderer getZombieUpBody;
	private final ModelRenderer getZombieWholeBody;

	public MCZombieModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		right_leg = new ModelRenderer(this);
		right_leg.setPos(-4.0F, -24.0F, 0.0F);
		total.addChild(right_leg);
		right_leg.texOffs(0, 32).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(4.0F, -24.0F, 0.0F);
		total.addChild(left_leg);
		left_leg.texOffs(0, 32).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		up = new ModelRenderer(this);
		up.setPos(0.0F, -24.0F, 0.0F);
		total.addChild(up);


		body = new ModelRenderer(this);
		body.setPos(0.0F, -7.0F, 0.0F);
		up.addChild(body);
		body.texOffs(32, 32).addBox(-8.0F, -17.0F, -4.0F, 16.0F, 24.0F, 8.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(12.0F, -20.0F, 0.0F);
		up.addChild(left_hand);
		left_hand.texOffs(80, 32).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-12.0F, -20.0F, 0.0F);
		up.addChild(right_hand);
		right_hand.texOffs(80, 32).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -24.0F, 0.0F);
		up.addChild(head);
		head.texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);

		getZombieLeftHand = new ModelRenderer(this);
		getZombieLeftHand.setPos(0.0F, 0.0F, 0.0F);


		getZombieRightHand = new ModelRenderer(this);
		getZombieRightHand.setPos(0.0F, 0.0F, 0.0F);


		getZombieLeftLeg = new ModelRenderer(this);
		getZombieLeftLeg.setPos(0.0F, 0.0F, 0.0F);


		getZombieRightLeg = new ModelRenderer(this);
		getZombieRightLeg.setPos(0.0F, 0.0F, 0.0F);


		getZombieHead = new ModelRenderer(this);
		getZombieHead.setPos(0.0F, 0.0F, 0.0F);


		getZombieUpBody = new ModelRenderer(this);
		getZombieUpBody.setPos(0.0F, 0.0F, 0.0F);


		getZombieWholeBody = new ModelRenderer(this);
		getZombieWholeBody.setPos(0.0F, 0.0F, 0.0F);

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