package de.niclasl.herobrines_world_api.registry;

import de.niclasl.herobrines_world_api.api.access.AccessMode;
import de.niclasl.herobrines_world_api.api.leaderboard.RewardType;
import de.niclasl.herobrines_world_api.api.transfer.TransferMode;
import net.minecraft.resources.Identifier;

import java.util.HashMap;
import java.util.Map;

public class HWRegistries {
    public static final Map<Identifier, TransferMode> TRANSFER_MODES = new HashMap<>();
    public static final Map<Identifier, AccessMode> ACCESS_MODES = new HashMap<>();
    public static final Map<Identifier, RewardType> REWARD_TYPES = new HashMap<>();
}