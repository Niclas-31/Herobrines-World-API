package de.niclasl.herobrines_world_api.api.leaderboard;

import java.util.List;

public interface LeaderboardAPI {
    List<LeaderboardEntry> getTop(String board, int limit);
}