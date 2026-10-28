package de.niclasl.herobrines_world_api.boss;

import com.mojang.serialization.Codec;
import net.minecraft.util.StringRepresentable;
import org.jspecify.annotations.NonNull;

import java.util.Locale;

public enum BossPhase implements StringRepresentable {
    PHASE_1, PHASE_2, PHASE_3, PHASE_4;

    public static final Codec<BossPhase> CODEC =
            StringRepresentable.fromEnum(BossPhase::values);

    @Override
    public @NonNull String getSerializedName() {
        return name().toLowerCase(Locale.ROOT);
    }
}