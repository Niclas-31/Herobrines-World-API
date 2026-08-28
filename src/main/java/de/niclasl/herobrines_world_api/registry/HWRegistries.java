package de.niclasl.herobrines_world_api.registry;

import de.niclasl.herobrines_world_api.access.AccessMode;
import de.niclasl.herobrines_world_api.boss.Ability;
import de.niclasl.herobrines_world_api.boss.BossDefinition;
import de.niclasl.herobrines_world_api.leaderboard.RewardType;
import de.niclasl.herobrines_world_api.structure.StructureAPI;
import de.niclasl.herobrines_world_api.structure.StructureDefinition;
import de.niclasl.herobrines_world_api.transfer.TransferMode;

public class HWRegistries {
    public static final HWRegistry<TransferMode> TRANSFER_MODES = new HWRegistry<>();
    public static final HWRegistry<AccessMode> ACCESS_MODES = new HWRegistry<>();
    public static final HWRegistry<RewardType> REWARD_TYPES = new HWRegistry<>();
    public static final HWRegistry<StructureDefinition> STRUCTURES = new HWRegistry<>();
    public static final HWRegistry<BossDefinition> BOSSES = new HWRegistry<>();
    public static final HWRegistry<Ability> ABILITIES = new HWRegistry<>();

    private static StructureAPI structureAPI;

    public static void registerStructureAPI(StructureAPI api){
        structureAPI = api;
    }

    public static StructureAPI structures(){
        return structureAPI;
    }
}