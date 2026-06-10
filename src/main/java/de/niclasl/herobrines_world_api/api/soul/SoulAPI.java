package de.niclasl.herobrines_world_api.api.soul;

import java.util.UUID;

public interface SoulAPI {
    long getSouls(UUID player);
    void addSouls(UUID player, long amount);
}