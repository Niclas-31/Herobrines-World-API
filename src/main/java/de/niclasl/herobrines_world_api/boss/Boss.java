package de.niclasl.herobrines_world_api.boss;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

import java.util.List;

public abstract class Boss extends Monster implements IBoss {

    protected Boss(EntityType<? extends Monster> type, Level level) {
        super(type, level);
    }

    public abstract List<Mob> getMinions();
}