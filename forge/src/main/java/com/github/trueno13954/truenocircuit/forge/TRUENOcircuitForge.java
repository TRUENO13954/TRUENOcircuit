package com.github.trueno13954.truenocircuit.forge;

import dev.architectury.platform.forge.EventBuses;
import com.github.trueno13954.truenocircuit.TRUENOcircuit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TRUENOcircuit.MOD_ID)
public class TRUENOcircuitForge {
    public TRUENOcircuitForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(TRUENOcircuit.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        TRUENOcircuit.init();
    }
}