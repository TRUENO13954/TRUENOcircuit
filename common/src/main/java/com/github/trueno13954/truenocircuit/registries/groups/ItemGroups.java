package com.github.trueno13954.truenocircuit.registries.groups;

import com.github.trueno13954.truenocircuit.TRUENOcircuit;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class ItemGroups {
    public static final DeferredRegister<CreativeModeTab> MOD_GROUPS = DeferredRegister.create(TRUENOcircuit.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> MAIN_GROUP = MOD_GROUPS.register(new ResourceLocation(TRUENOcircuit.MOD_ID, "main_group"), () -> MainItemGroup.get());

    public static void register() {
        MOD_GROUPS.register();
    }
}
