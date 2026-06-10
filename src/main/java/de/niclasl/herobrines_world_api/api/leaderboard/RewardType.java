package de.niclasl.herobrines_world_api.api.leaderboard;

import net.minecraft.resources.Identifier;

public interface RewardType {
    Identifier id();

    void apply(RewardContext context, RewardEntry entry);
}