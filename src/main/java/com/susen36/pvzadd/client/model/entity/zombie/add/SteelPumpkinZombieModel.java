package com.susen36.pvzadd.client.model.entity.zombie.add;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.susen36.pvzadd.common.entity.zombie.add.SteelPumpkinZombieEntity;
import net.minecraft.client.renderer.model.ModelRenderer;

import java.util.Optional;

public class SteelPumpkinZombieModel extends PVZZombieModel<SteelPumpkinZombieEntity> {
    private final ModelRenderer total;
    private final ModelRenderer right_leg;
    private final ModelRenderer left_leg;
    private final ModelRenderer up;
    private final ModelRenderer body;
    private final ModelRenderer hammer;
    private final ModelRenderer left_hand;
    private final ModelRenderer right_hand;
    private final ModelRenderer head;
    private final ModelRenderer helmet;
    private final ModelRenderer ladder;
    private final ModelRenderer floor;
    private final ModelRenderer getZombieLeftHand;
    private final ModelRenderer getZombieRightHand;
    private final ModelRenderer getZombieLeftLeg;
    private final ModelRenderer getZombieRightLeg;
    private final ModelRenderer getZombieHead;
    private final ModelRenderer getZombieUpBody;
    private final ModelRenderer getZombieWholeBody;

    public SteelPumpkinZombieModel() {
        texWidth = 256;
        texHeight = 256;

        total = new ModelRenderer(this);
        total.setPos(0.0F, 24.0F, 0.0F);


        right_leg = new ModelRenderer(this);
        right_leg.setPos(-4.0F, -23.0F, 0.0F);
        total.addChild(right_leg);
        right_leg.texOffs(44, 0).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setPos(4.0F, -23.0F, 0.0F);
        total.addChild(left_leg);
        left_leg.texOffs(0, 0).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

        up = new ModelRenderer(this);
        up.setPos(0.0F, 0.0F, 0.0F);
        total.addChild(up);


        body = new ModelRenderer(this);
        body.setPos(0.0F, -23.0F, 0.0F);
        up.addChild(body);
        body.texOffs(0, 41).addBox(-8.0F, -25.0F, -4.0F, 16.0F, 24.0F, 8.0F, 0.0F, false);

        hammer = new ModelRenderer(this);
        hammer.setPos(9.0F, -1.0F, 0.5F);
        body.addChild(hammer);
        setRotationAngle(hammer, 0.4363F, 0.0F, 0.0F);


        left_hand = new ModelRenderer(this);
        left_hand.setPos(8.0F, -48.0F, 0.0F);
        up.addChild(left_hand);
        setRotationAngle(left_hand, -0.8727F, 0.0F, 0.0F);
        left_hand.texOffs(96, 60).addBox(0.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

        right_hand = new ModelRenderer(this);
        right_hand.setPos(-8.0F, -48.0F, 0.0F);
        up.addChild(right_hand);
        setRotationAngle(right_hand, -0.8727F, 0.0F, 0.0F);
        right_hand.texOffs(96, 0).addBox(-8.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, -48.0F, 0.0F);
        up.addChild(head);
        head.texOffs(16, 96).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);

        helmet = new ModelRenderer(this);
        helmet.setPos(0.0F, 19.0F, 0.0F);
        head.addChild(helmet);
        helmet.texOffs(196, 240).addBox(-6.0F, -38.0F, -9.0F, 15.0F, 1.0F, 15.0F, 0.0F, false);
        helmet.texOffs(158, 206).addBox(-16.0F, -36.0F, -16.0F, 32.0F, 16.0F, 1.0F, 0.0F, false);
        helmet.texOffs(190, 160).addBox(-16.0F, -36.0F, 15.0F, 32.0F, 16.0F, 1.0F, 0.0F, false);
        helmet.texOffs(161, 161).addBox(-16.0F, -36.0F, -15.0F, 1.0F, 16.0F, 30.0F, 0.0F, false);
        helmet.texOffs(194, 132).addBox(15.0F, -36.0F, -15.0F, 1.0F, 16.0F, 30.0F, 0.0F, false);
        helmet.texOffs(128, 130).addBox(-16.0F, -20.0F, -16.0F, 32.0F, 1.0F, 32.0F, 0.0F, false);
        helmet.texOffs(131, 130).addBox(-15.0F, -37.0F, -15.0F, 30.0F, 1.0F, 30.0F, 0.0F, false);
        helmet.texOffs(167, 244).addBox(-2.0F, -42.5F, -5.0F, 7.0F, 5.0F, 7.0F, 0.0F, false);

        ladder = new ModelRenderer(this);
        ladder.setPos(0.0F, -38.0F, -20.0F);
        up.addChild(ladder);
        setRotationAngle(ladder, 0.2182F, 0.0F, 0.0F);
        ladder.texOffs(15, 202).addBox(-12.0F, -22.0F, -2.0F, 3.0F, 50.0F, 4.0F, 0.1F, false);
        ladder.texOffs(0, 202).addBox(9.0F, -22.0F, -2.0F, 3.0F, 50.0F, 4.0F, 0.1F, false);
        ladder.texOffs(0, 194).addBox(8.0F, 28.0F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);
        ladder.texOffs(0, 185).addBox(-13.0F, 28.0F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);

        floor = new ModelRenderer(this);
        floor.setPos(0.0F, 0.0F, 0.0F);
        ladder.addChild(floor);
        floor.texOffs(31, 250).addBox(-9.0F, 20.0F, -2.0F, 18.0F, 2.0F, 4.0F, 0.0F, false);
        floor.texOffs(31, 242).addBox(-9.0F, 12.0F, -2.0F, 18.0F, 2.0F, 4.0F, 0.0F, false);
        floor.texOffs(30, 234).addBox(-9.0F, 4.0F, -2.0F, 18.0F, 2.0F, 4.0F, 0.0F, false);
        floor.texOffs(32, 225).addBox(-9.0F, -4.0F, -2.0F, 18.0F, 2.0F, 4.0F, 0.0F, false);
        floor.texOffs(30, 217).addBox(-9.0F, -12.0F, -2.0F, 18.0F, 2.0F, 4.0F, 0.0F, false);

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
    public void updateFreeParts(SteelPumpkinZombieEntity entity) {
        super.updateFreeParts(entity);
        final boolean hasLadder = entity.hasMetal();
        this.ladder.visible = hasLadder;
        this.isLeftHandFree = ! hasLadder;
        this.isRightHandFree = ! hasLadder;
    }

    @Override
    public void refreshAnim() {
        super.refreshAnim();
        this.right_hand.xRot = -0.8727F;
        this.left_hand.xRot = -0.8727F;
    }

    @Override
    public Optional<ModelRenderer> getHandDefence() {
        return Optional.ofNullable(this.ladder);
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