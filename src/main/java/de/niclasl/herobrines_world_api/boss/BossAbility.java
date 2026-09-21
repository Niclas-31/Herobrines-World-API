package de.niclasl.herobrines_world_api.boss;

public abstract class BossAbility implements Ability {

    private final String id;

    protected BossAbility(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}