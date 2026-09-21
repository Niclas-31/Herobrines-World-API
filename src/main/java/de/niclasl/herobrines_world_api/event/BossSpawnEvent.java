package de.niclasl.herobrines_world_api.event;

import de.niclasl.herobrines_world_api.boss.BossType;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.neoforged.bus.api.Event;

public class BossSpawnEvent extends Event {

    private final ServerLevel level;
    private final BlockPos position;
    private final BossType bossType;
    private final Entity boss;

    public BossSpawnEvent(ServerLevel level, BlockPos position, BossType bossType, Entity boss) {
        this.level = level;
        this.position = position;
        this.bossType = bossType;
        this.boss = boss;
    }

    public ServerLevel getLevel() {
        return level;
    }

    public BlockPos getPosition() {
        return position;
    }

    public BossType getBossType() {
        return bossType;
    }

    public Entity getBoss() {
        return boss;
    }
}