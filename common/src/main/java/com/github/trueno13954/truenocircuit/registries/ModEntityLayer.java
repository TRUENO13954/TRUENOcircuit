package com.github.trueno13954.truenocircuit.registries;

import com.github.trueno13954.truenocircuit.car.TamaEV;
import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import net.minecraft.client.model.geom.builders.LayerDefinition;

import java.util.function.Supplier;

public class ModEntityLayer {
    public static final Supplier<LayerDefinition> TAMAEV = () -> TamaEV.createBodyLayer(TamaEV.LAYER_LOCATION);

    public static void register() {
        EntityModelLayerRegistry.register(TamaEV.LAYER_LOCATION, TAMAEV);
    }
}
