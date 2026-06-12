package de.niclasl.herobrines_world_api.api.leaderboard;

public class LeaderboardAPIHolder {

    private static LeaderboardAPI INSTANCE;

    public static void init(LeaderboardAPI api) {
        INSTANCE = api;
    }

    public static LeaderboardAPI get() {
        return INSTANCE;
    }
}