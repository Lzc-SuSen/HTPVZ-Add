package com.susen36.pvzadd.client.model.entity.zombie.add;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.susen36.pvzadd.common.entity.zombie.add.TargetArrowZombieEntity;
import net.minecraft.client.renderer.model.ModelRenderer;

import java.util.Optional;

public class TargetArrowZombieModel extends PVZZombieModel<TargetArrowZombieEntity> {
    private final ModelRenderer total;
    private final ModelRenderer right_leg;
    private final ModelRenderer left_leg;
    private final ModelRenderer up;
    private final ModelRenderer body;
    private final ModelRenderer left_hand;
    private final ModelRenderer right_hand;
    private final ModelRenderer target;
    private final ModelRenderer head;
    private final ModelRenderer getZombieLeftHand;
    private final ModelRenderer getZombieRightHand;
    private final ModelRenderer getZombieLeftLeg;
    private final ModelRenderer getZombieRightLeg;
    private final ModelRenderer getZombieHead;
    private final ModelRenderer getZombieUpBody;
    private final ModelRenderer getZombieWholeBody;

    public TargetArrowZombieModel() {
        texWidth = 256;
        texHeight = 256;

        total = new ModelRenderer(this);
        total.setPos(0.0F, 24.0F, 0.0F);


        right_leg = new ModelRenderer(this);
        right_leg.setPos(-4.0F, -24.0F, 0.0F);
        total.addChild(right_leg);
        right_leg.texOffs(44, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setPos(4.0F, -24.0F, 0.0F);
        total.addChild(left_leg);
        left_leg.texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

        up = new ModelRenderer(this);
        up.setPos(0.0F, -24.0F, 0.0F);
        total.addChild(up);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);
        up.addChild(body);
        body.texOffs(0, 41).addBox(-8.0F, -24.0F, -4.0F, 16.0F, 24.0F, 8.0F, 0.0F, false);

        left_hand = new ModelRenderer(this);
        left_hand.setPos(12.0F, -20.0F, 0.0F);
        up.addChild(left_hand);
        setRotationAngle(left_hand, -1.0472F, 0.0F, 0.0F);
        left_hand.texOffs(96, 60).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

        right_hand = new ModelRenderer(this);
        right_hand.setPos(-12.0F, -20.0F, 0.0F);
        up.addChild(right_hand);
        setRotationAngle(right_hand, -1.0472F, 0.0F, 0.0F);
        right_hand.texOffs(96, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

        target = new ModelRenderer(this);
        target.setPos(12.0F, 23.0F, 1.0F);
        right_hand.addChild(target);
        setRotationAngle(target, 1.0472F, 0.0F, 0.0F);
        target.texOffs(192, 184).addBox(-10.0F, -16.0F, 1.0F, 20.0F, 20.0F, 2.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, -24.0F, 0.0F);
        up.addChild(head);
        head.texOffs(16, 96).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);

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
    public void updateFreeParts(TargetArrowZombieEntity entity) {
        super.updateFreeParts(entity);
        final boolean isPartDestroyed = ! entity.canPartsExist();
        this.target.visible = ! isPartDestroyed;
        this.isLeftHandFree = isPartDestroyed;
        this.isRightHandFree = isPartDestroyed;
    }

    @Override
    public void refreshAnim() {
        this.getZombieLeftHand().xRot = -1.0472F;
        this.getZombieRightHand().xRot = -1.0472F;
    }

    @Override
    public Optional<ModelRenderer> getHandDefence() {
        return Optional.ofNullable(this.target);
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