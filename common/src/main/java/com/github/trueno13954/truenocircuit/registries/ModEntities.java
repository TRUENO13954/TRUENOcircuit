package com.github.trueno13954.truenocircuit.registries;

import com.github.trueno13954.truenocircuit.TRUENOcircuit;
import com.github.trueno13954.truenocircuit.car.Car;
import com.github.trueno13954.truenocircuit.car.CarRenderer;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.Level;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> MOD_ENTITIES = DeferredRegister.create(TRUENOcircuit.MOD_ID, Registries.ENTITY_TYPE);

    public static final RegistrySupplier<? extends EntityType<? extends Car>> CAR = MOD_ENTITIES.register(new ResourceLocation(TRUENOcircuit.MOD_ID, "car"), () -> EntityType.Builder.of(Car::new, MobCategory.MISC).build("car"));

    public static void registerRenderer() {
        EntityRendererRegistry.register(CAR, CarRenderer::new);
    }

    public static void register() {
        MOD_ENTITIES.register();
        registerRenderer();
    }
}
