package de.niclasl.herobrines_world_api.api.leaderboard;

import java.util.List;
import java.util.UUID;

public interface LeaderboardAPI {
    List<LeaderboardEntry> getTop(String board, int limit);

    int getRank(UUID player);
}