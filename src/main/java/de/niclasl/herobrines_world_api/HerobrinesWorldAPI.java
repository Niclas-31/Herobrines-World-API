package de.niclasl.herobrines_world_api;

import com.mojang.logging.LogUtils;
import de.niclasl.herobrines_world_api.version.ApiSupportChecker;
import de.niclasl.herobrines_world_api.version.ApiVersion;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(HerobrinesWorldAPI.MOD_ID)
public class HerobrinesWorldAPI {
    public static final String MOD_ID = "herobrines_world_api";

    public static final ApiVersion API_VERSION = new ApiVersion(3, 0);

    public static final Logger LOGGER = LogUtils.getLogger();

    public HerobrinesWorldAPI() {
        ApiSupportChecker.check(LOGGER);
    }
}