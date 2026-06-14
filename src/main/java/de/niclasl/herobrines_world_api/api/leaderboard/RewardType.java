package de.niclasl.herobrines_world_api.api.leaderboard;

import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public interface RewardType {
    @NotNull Identifier id();

    int priority();

    void apply(RewardContext context, RewardEntry entry);
}