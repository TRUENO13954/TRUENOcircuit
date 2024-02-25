package com.github.trueno13954.truenocircuit.registries.groups;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.function.Supplier;

public class MainItemGroup {
    public static final ItemStack[] ITEMS = ((Supplier<ItemStack[]>)() -> {
        return new ItemStack[] {
                Items.ACACIA_BOAT.getDefaultInstance()
        };
    }).get();

    public static CreativeModeTab get() {
        CreativeModeTab.Builder builder = CreativeModeTab.builder(null, -1);
        builder.title(Component.translatable("itemGroup.truenocircuit.main"));
        builder.displayItems((p, o) -> {
            for (ItemStack stack:ITEMS) {
                o.accept(stack);
            }
        });

        return builder.build();
    }
}
