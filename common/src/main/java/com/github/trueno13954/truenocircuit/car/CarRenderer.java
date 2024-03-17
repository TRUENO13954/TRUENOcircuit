package com.github.trueno13954.truenocircuit.car;

import com.github.trueno13954.truenocircuit.TRUENOcircuit;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.PandaModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class CarRenderer extends EntityRenderer<Car> {
    TamaEV tamaEV;

    public CarRenderer(EntityRendererProvider.Context context) {
        super(context);
        tamaEV = new TamaEV(context.bakeLayer(new ModelLayerLocation(new ResourceLocation(TRUENOcircuit.MOD_ID, "tamaev"), "main")));
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
