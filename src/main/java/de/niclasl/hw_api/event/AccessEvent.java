package de.niclasl.hw_api.event;

import de.niclasl.hw_api.api.access.AccessMode;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.ICancellableEvent;

public class AccessEvent extends Event implements ICancellableEvent {

    private final Player player;
    private final AccessMode mode;
    private final boolean allowed;

    public AccessEvent(
            Player player,
            AccessMode mode,
            boolean allowed
    ) {
        this.player = player;
        this.mode = mode;
        this.allowed = allowed;
    }

    public Player getPlayer() {
        return player;
    }

    public AccessMode getMode() {
        return mode;
    }

    public boolean isAllowed() {
        return allowed;
    }
}