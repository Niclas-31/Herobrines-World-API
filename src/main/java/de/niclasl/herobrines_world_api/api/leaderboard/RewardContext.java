package de.niclasl.herobrines_world_api.api.leaderboard;

import net.minecraft.server.level.ServerPlayer;

public record RewardContext(ServerPlayer player, int rank) {}