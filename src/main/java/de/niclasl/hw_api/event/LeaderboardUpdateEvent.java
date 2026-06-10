package de.niclasl.hw_api.event;

import de.niclasl.hw_api.api.leaderboard.LeaderboardEntry;
import net.neoforged.bus.api.Event;

public class LeaderboardUpdateEvent extends Event {

    private final LeaderboardEntry entry;

    public LeaderboardUpdateEvent(LeaderboardEntry entry) {
        this.entry = entry;
    }

    public LeaderboardEntry getEntry() {
        return entry;
    }
}