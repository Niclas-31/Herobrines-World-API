package de.niclasl.herobrines_world_api.structure;

import net.minecraft.core.BlockPos;

import java.util.List;

public record BossArena(BlockPos origin, List<ArenaBox> boxes) {

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