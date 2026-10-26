package de.niclasl.herobrines_world_api.leaderboard;

import java.util.UUID;

public record LeaderboardEntry(UUID uuid, String playerName, int souls, int level) {
}