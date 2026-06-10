package de.niclasl.hw_api.api.access;

import com.mojang.serialization.Codec;
import de.niclasl.hw_api.registry.HWRegistries;
import net.minecraft.resources.Identifier;

public interface AccessMode {
    public static final Codec<AccessMode> CODEC =
            Identifier.CODEC.xmap(
                    HWRegistries.ACCESS_MODES::get,
                    AccessMode::id
            );

    Identifier id();
}