package de.niclasl.herobrines_world_api.api.access;

import com.mojang.serialization.Codec;
import de.niclasl.herobrines_world_api.registry.HWRegistries;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public interface AccessMode {
    Codec<AccessMode> CODEC =
            Identifier.CODEC.xmap(
                    HWRegistries.ACCESS_MODES::get,
                    AccessMode::id
            );

    @NotNull Identifier id();

    int priority();
}