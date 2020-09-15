package com.github.thebuildteam.obelisk;

import com.github.thebuildteam.obelisk.registries.BlockRegistry;
import com.github.thebuildteam.obelisk.registries.ItemRegistry;
import net.fabricmc.api.ModInitializer;

public class Obelisk implements ModInitializer {
    public static String modid = "obeliskmod";

    @Override
    public void onInitialize() {
        ItemRegistry.register();
        BlockRegistry.register();
    }
}
