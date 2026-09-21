package de.niclasl.herobrines_world_api.boss;

import net.minecraft.world.level.Level;

public class BossContext {

    private final Level level;
    private final Boss boss;

    private BossFightState state;

    private int abilityCooldown;
    private int minionCooldown;

    public BossContext(
            Level level,
            Boss boss,
            BossFightState state
    ) {
        this.level = level;
        this.boss = boss;
        this.state = state;
    }

    public void tick() {
        tickCooldowns();
    }

    private void tickCooldowns() {
        if (abilityCooldown > 0) {
            abilityCooldown--;
        }

        if (minionCooldown > 0) {
            minionCooldown--;
        }
    }

    public Level getLevel() {
        return level;
    }

    public Boss getBoss() {
        return boss;
    }

    public BossFightState getState() {
        return state;
    }

    public void setState(BossFightState state) {
        this.state = state;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public void setAbilityCooldown(int abilityCooldown) {
        this.abilityCooldown = abilityCooldown;
    }

    public int getMinionCooldown() {
        return minionCooldown;
    }

    public void setMinionCooldown(int minionCooldown) {
        this.minionCooldown = minionCooldown;
    }
}