package de.niclasl.herobrines_world_api.boss;

import net.minecraft.world.entity.ai.goal.Goal;

public class FlyingGoal extends Goal {

    private final Boss boss;

    public FlyingGoal(Boss boss) {
        this.boss = boss;
    }

    @Override
    public boolean canUse() {
        return boss.getTarget() != null;
    }

    @Override
    public boolean canContinueToUse() {
        return boss.getTarget() != null;
    }

    @Override
    public void start() {
        super.start();
    }
}