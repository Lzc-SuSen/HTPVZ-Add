package com.susen36.pvzadd.client.model.entity.plant.defence;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.susen36.pvzadd.common.entity.plant.defence.SteelPumpkinEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class SteelPumpkinModel extends PVZPlantModel<SteelPumpkinEntity> {
	private final ModelRenderer total;
	private final ModelRenderer floor;
	private final ModelRenderer total2;
	private final ModelRenderer getPlantWholeBody;

	public SteelPumpkinModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, -5.0F, 0.0F);


		floor = new ModelRenderer(this);
		floor.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(floor);
		floor.texOffs(94, 85).addBox(-9.0F, 20.0F, -20.0F, 18.0F, 2.0F, 4.0F, 0.0F, false);
		floor.texOffs(94, 79).addBox(-9.0F, 12.0F, -20.0F, 18.0F, 2.0F, 4.0F, 0.0F, false);
		floor.texOffs(90, 91).addBox(-9.0F, 4.0F, -20.0F, 18.0F, 2.0F, 4.0F, 0.0F, false);
		floor.texOffs(64, 73).addBox(-9.0F, -4.0F, -20.0F, 18.0F, 2.0F, 4.0F, 0.0F, false);
		floor.texOffs(64, 67).addBox(-9.0F, -12.0F, -20.0F, 18.0F, 2.0F, 4.0F, 0.0F, false);
		floor.texOffs(0, 79).addBox(9.0F, -21.0F, -20.0F, 3.0F, 50.0F, 4.0F, 0.1F, false);
		floor.texOffs(14, 79).addBox(-12.0F, -21.0F, -20.0F, 3.0F, 50.0F, 4.0F, 0.1F, false);

		total2 = new ModelRenderer(this);
		total2.setPos(0.0F, 29.0F, 0.0F);
		total.addChild(total2);
		total2.texOffs(0, 0).addBox(-15.0F, -18.0F, -19.0F, 3.0F, 18.0F, 3.0F, 0.0F, false);
		total2.texOffs(68, 112).addBox(-6.0F, -19.0F, -9.0F, 15.0F, 1.0F, 15.0F, 0.0F, false);
		total2.texOffs(64, 50).addBox(-16.0F, -17.0F, -16.0F, 32.0F, 16.0F, 1.0F, 0.0F, false);
		total2.texOffs(64, 33).addBox(-16.0F, -17.0F, 15.0F, 32.0F, 16.0F, 1.0F, 0.0F, false);
		total2.texOffs(32, 49).addBox(-16.0F, -17.0F, -15.0F, 1.0F, 16.0F, 30.0F, 0.0F, false);
		total2.texOffs(0, 33).addBox(15.0F, -17.0F, -15.0F, 1.0F, 16.0F, 30.0F, 0.0F, false);
		total2.texOffs(0, 0).addBox(-16.0F, -1.0F, -16.0F, 32.0F, 1.0F, 32.0F, 0.0F, false);
		total2.texOffs(0, 0).addBox(-15.0F, -18.0F, -15.0F, 30.0F, 1.0F, 30.0F, 0.0F, false);
		total2.texOffs(38, 116).addBox(-2.0F, -23.5F, -5.0F, 7.0F, 5.0F, 7.0F, 0.0F, false);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}

	@Override
	public void setupAnim(SteelPumpkinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){

	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public EntityModel<SteelPumpkinEntity> getPlantModel() {
		return this;
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

}