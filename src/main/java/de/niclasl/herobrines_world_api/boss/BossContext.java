package de.niclasl.herobrines_world_api.boss;

import net.minecraft.world.level.Level;

public class BossContext {

    private final Level level;
    private final Boss boss;

    private BossFightState state;

    private int attackCooldown;
    private int abilityCooldown;
    private int minionCooldown;
    private int teleportCooldown;

    private int healCooldown;
    private int healChargeTicks;
    private boolean healing;

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

        if (teleportCooldown > 0) {
            teleportCooldown--;
        }

        if (healCooldown > 0) {
            healCooldown--;
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

    public int getAttackCooldown() {
        return attackCooldown;
    }

    public void setAttackCooldown(int attackCooldown) {
        this.attackCooldown = attackCooldown;
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

    public int getTeleportCooldown() {
        return teleportCooldown;
    }

    public void setTeleportCooldown(int teleportCooldown) {
        this.teleportCooldown = teleportCooldown;
    }

    public int getHealCooldown() {
        return healCooldown;
    }

    public void setHealCooldown(int healCooldown) {
        this.healCooldown = healCooldown;
    }

    public int getHealChargeTicks() {
        return healChargeTicks;
    }

    public void setHealChargeTicks(int healChargeTicks) {
        this.healChargeTicks = healChargeTicks;
    }

    public boolean isHealing() {
        return healing;
    }

    public void setHealing(boolean healing) {
        this.healing = healing;
    }
}