package de.niclasl.herobrines_world_api.version;

import com.google.gson.Gson;
import de.niclasl.herobrines_world_api.HerobrinesWorldAPI;
import org.slf4j.Logger;
import org.spongepowered.include.com.google.common.base.Charsets;

import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class ApiVersionChecker {

    private static final String VERSION_URL = "https://raw.githubusercontent.com/Niclas-31/Herobrines-World-API/main/src/main/resources/api_versions.json";

    public static void check(Logger logger) {
        logger.info("Starting Herobrines World API version checker...");

        CompletableFuture.runAsync(() -> {
            try {
                URI uri = new URI(VERSION_URL);
                URL url = uri.toURL();

                Gson gson = new Gson();

                ApiVersionsFile file;

                try (InputStreamReader reader = new InputStreamReader(url.openStream(), Charsets.UTF_8)) {

                    file = gson.fromJson(reader, ApiVersionsFile.class);
                }

                ApiVersion online = file.getLatest();

                if (HerobrinesWorldAPI.API_VERSION.isOlderThan(online)) {
                    logger.warn("================================================");
                    logger.warn("{} -> {}", HerobrinesWorldAPI.API_VERSION, online);
                    logger.warn("Please update Herobrines World API.");
                    logger.warn("================================================");
                } else {
                    logger.info("Herobrines World API is up to date.");
                }

            } catch (Exception e) {
                logger.error("Failed to check Herobrines World API version", e);
            }
        });
    }
}