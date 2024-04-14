package com.github.trueno13954.truenocircuit.car;

import com.github.trueno13954.truenocircuit.TRUENOcircuit;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class CarRenderer extends EntityRenderer<Car> {
    TamaEV tamaEV;

    public CarRenderer(EntityRendererProvider.Context context) {
        super(context);
        tamaEV = new TamaEV(context.bakeLayer(TamaEV.LAYER_LOCATION));
    }

    @Override
    public void render(Car entity, float f, float g, PoseStack poseStack, MultiBufferSource multiBufferSource, int i) {
        poseStack.pushPose();
        VertexConsumer consumer = multiBufferSource.getBuffer(tamaEV.renderType(new ResourceLocation(TRUENOcircuit.MOD_ID, "car")));
        tamaEV.renderToBuffer(poseStack, consumer, i, OverlayTexture.NO_OVERLAY, 1,1,1,1);
        poseStack.popPose();
        super.render(entity, f, g, poseStack, multiBufferSource, i);
    }

    @Override
    public ResourceLocation getTextureLocation(Car entity) {
        return null;
    }
}
