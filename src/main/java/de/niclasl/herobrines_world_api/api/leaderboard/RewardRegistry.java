package de.niclasl.herobrines_world_api.api.leaderboard;

import net.minecraft.resources.Identifier;

import java.util.Collection;

public interface RewardRegistry {

    void register(RewardType type);

    RewardType get(Identifier id);

    Collection<RewardType> all();
}