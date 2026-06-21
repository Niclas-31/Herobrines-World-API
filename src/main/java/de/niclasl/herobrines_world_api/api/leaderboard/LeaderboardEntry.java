package de.niclasl.herobrines_world_api.api.leaderboard;

import java.util.UUID;

public record LeaderboardEntry(UUID player, String playerName, int value, int level) {
}