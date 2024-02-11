package com.github.trueno13954.truenocircuit.fabric;

import com.github.trueno13954.truenocircuit.TRUENOcircuit;
import net.fabricmc.api.ModInitializer;

public class TRUENOcircuitFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TRUENOcircuit.init();
    }
}