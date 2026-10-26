package de.niclasl.herobrines_world_api.leaderboard;

import java.util.List;
import java.util.UUID;

public interface LeaderboardAPI {
    List<LeaderboardEntry> getTop(int limit);

    int getRank(UUID player);
}