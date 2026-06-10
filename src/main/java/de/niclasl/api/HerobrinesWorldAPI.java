package de.niclasl.api;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(HerobrinesWorldAPI.MOD_ID)
public class HerobrinesWorldAPI {
    public static final String MOD_ID = "herobrines_world_api";

    public HerobrinesWorldAPI(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
