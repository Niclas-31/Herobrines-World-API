package de.niclasl.herobrines_world.common.boss.entity.goal;

import net.minecraft.world.entity.ai.goal.Goal;

public class FlyingGoal extends Goal {

    private final Boss boss;

    @Override
    public boolean canUse() {
        return false;
    }
}