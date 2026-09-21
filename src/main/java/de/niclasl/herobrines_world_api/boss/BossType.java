package de.niclasl.herobrines_world.common.boss;

import de.niclasl.herobrines_world.common.boss.entity.HerobrineBoss;
import de.niclasl.herobrines_world.common.registries.entities.ModEntities;
import de.niclasl.herobrines_world.common.registries.entities.custom.Entity303;
import de.niclasl.herobrines_world_api.boss.IBoss;
import net.minecraft.server.level.ServerLevel;

public enum BossType {
    HEROBRINE_BOSS {
        @Override
        public IBoss create(ServerLevel level) {
            return new HerobrineBoss(ModEntities.HEROBRINE_BOSS.get(), level);
        }
    },
    ENTITY_303 {
        @Override
        public IBoss create(ServerLevel level) {
            return new Entity303(ModEntities.ENTITY_303.get(), level);
        }
    };

    public abstract IBoss create(ServerLevel level);
}