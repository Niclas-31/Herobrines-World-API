package de.niclasl.hw_api.api.soul;

import java.util.UUID;

public interface SoulAPI {
    long getSouls(UUID player);
    void addSouls(UUID player, long amount);
}