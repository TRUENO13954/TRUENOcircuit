package com.github.trueno13954.truenocircuit;

import com.github.trueno13954.truenocircuit.registries.ModEntities;
import com.github.trueno13954.truenocircuit.registries.ModEntityLayer;
import com.github.trueno13954.truenocircuit.registries.groups.ItemGroups;

public class TRUENOcircuit
{
	public static final String MOD_ID = "truenocircuit";

	public static void init() {
		ItemGroups.register();
		ModEntities.register();
		ModEntityLayer.register();
	}
}
