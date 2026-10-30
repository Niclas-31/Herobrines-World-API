package de.niclasl.herobrines_world_api.structure;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;

import java.util.List;

public record BossArena(BlockPos origin, List<ArenaBox> boxes) {

    public static final Codec<BossArena> CODEC =
            RecordCodecBuilder.create(instance -> instance.group(
                    BlockPos.CODEC.fieldOf("origin")
                            .forGetter(BossArena::origin),
                    ArenaBox.CODEC.listOf().fieldOf("boxes")
                            .forGetter(BossArena::boxes)
            ).apply(instance, BossArena::new));

    public boolean contains(BlockPos pos) {
        double localX = pos.getX() - origin.getX();
        double localY = pos.getY() - origin.getY();
        double localZ = pos.getZ() - origin.getZ();

        for (ArenaBox box : boxes) {
            if (box.contains(localX, localY, localZ)) {
                return true;
            }
        }

        return false;
    }
}