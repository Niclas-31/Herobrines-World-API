package de.niclasl.herobrines_world_api.structure;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ArenaBox(
        double minX,
        double minY,
        double minZ,
        double maxX,
        double maxY,
        double maxZ
) {

    public static final Codec<ArenaBox> CODEC =
            RecordCodecBuilder.create(instance -> instance.group(
                    Codec.DOUBLE.fieldOf("minX").forGetter(ArenaBox::minX),
                    Codec.DOUBLE.fieldOf("minY").forGetter(ArenaBox::minY),
                    Codec.DOUBLE.fieldOf("minZ").forGetter(ArenaBox::minZ),
                    Codec.DOUBLE.fieldOf("maxX").forGetter(ArenaBox::maxX),
                    Codec.DOUBLE.fieldOf("maxY").forGetter(ArenaBox::maxY),
                    Codec.DOUBLE.fieldOf("maxZ").forGetter(ArenaBox::maxZ)
            ).apply(instance, ArenaBox::new));

    public boolean contains(double x, double y, double z) {
        return x >= minX && x <= maxX
                && y >= minY && y <= maxY
                && z >= minZ && z <= maxZ;
    }
}