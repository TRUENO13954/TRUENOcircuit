package com.github.trueno13954.truenocircuit.car;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class CarRenderer extends EntityRenderer<Car> {
    public CarRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public void render(Car entity, float f, float g, PoseStack poseStack, MultiBufferSource multiBufferSource, int i) {
        poseStack.pushPose();
        poseStack.popPose();
        super.render(entity, f, g, poseStack, multiBufferSource, i);
    }

    @Override
    public ResourceLocation getTextureLocation(Car entity) {
        return null;
    }
}
