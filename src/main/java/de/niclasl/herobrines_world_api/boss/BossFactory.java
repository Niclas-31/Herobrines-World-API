package de.niclasl.herobrines_world_api.boss;

import net.minecraft.server.level.ServerLevel;

@FunctionalInterface
public interface BossFactory {

    IBoss create(ServerLevel level);
}