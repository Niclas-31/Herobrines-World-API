package de.niclasl.herobrines_world_api.version;

import de.niclasl.herobrines_world_api.HerobrinesWorldAPI;
import net.neoforged.fml.loading.FMLEnvironment;
import org.slf4j.Logger;

public final class ApiSupportChecker {

    private ApiSupportChecker() {
    }

    public static void check(Logger logger) {
        try {
            ApiVersionHolder holder = HerobrinesApiVersions.getHolder(HerobrinesWorldAPI.API_VERSION.major());

            if (holder == null) {
                logger.error("Unknown Herobrines World API major version: {}", HerobrinesWorldAPI.API_VERSION.major());
                return;
            }

            if (!FMLEnvironment.isProduction()) {
                switch (holder.status()) {
                    case SUPPORTED -> {
                    }
                    case DEPRECATED -> logger.warn(
                            "Herobrines World API {} is deprecated. It is still supported, but is no longer recommended for new projects.",
                            HerobrinesWorldAPI.API_VERSION
                    );
                    case UNSUPPORTED -> throw new IllegalStateException("Herobrines World API " + HerobrinesWorldAPI.API_VERSION + " is no longer supported.");
                }
                return;
            }

            if (holder.status() == ApiSupportStatus.UNSUPPORTED) {
                logger.error("Herobrines World API {} is no longer supported.", HerobrinesWorldAPI.API_VERSION);
            }

        } catch (Exception e) {
            logger.debug("Could not check Herobrines World API support status", e);
        }
    }
}