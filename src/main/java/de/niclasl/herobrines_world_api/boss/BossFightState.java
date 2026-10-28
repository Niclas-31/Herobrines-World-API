package de.niclasl.herobrines_world_api.boss;

import com.mojang.serialization.Codec;
import net.minecraft.util.StringRepresentable;
import org.jspecify.annotations.NonNull;

import java.util.Locale;

public enum BossFightState implements StringRepresentable {
    NOT_STARTED,
    STARTING,
    ACTIVE,
    DEFEATED,
    FAILED;

    public static final Codec<BossFightState> CODEC =
            StringRepresentable.fromEnum(BossFightState::values);

    @Override
    public @NonNull String getSerializedName() {
        return name().toLowerCase(Locale.ROOT);
    }
}