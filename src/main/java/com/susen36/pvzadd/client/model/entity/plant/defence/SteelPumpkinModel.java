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
	private final ModelRenderer inside;

	public SteelPumpkinModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);
		setRotationAngle(total, 0.0F, 1.5708F, 0.0F);
		total.texOffs(0, 0).addBox(-8.5F, -10.0F, -8.5F, 17.0F, 10.0F, 17.0F, 0.0F, false);
		total.texOffs(2, 27).addBox(8.0F, -6.0F, -8.5F, 1.0F, 6.0F, 17.0F, 0.0F, false);
		total.texOffs(0, 86).addBox(-8.75F, -26.0F, -8.0F, 1.0F, 26.0F, 16.0F, 0.0F, false);
		total.texOffs(34, 97).addBox(-8.75F, -15.0F, -8.0F, 1.0F, 15.0F, 16.0F, 0.1F, false);

		inside = new ModelRenderer(this);
		inside.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(inside);
		inside.texOffs(0, 50).addBox(-8.0F, -9.5F, -8.0F, 16.0F, 9.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(SteelPumpkinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final boolean isSolid = entity.isSolid();
		this.inside.visible = isSolid;
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