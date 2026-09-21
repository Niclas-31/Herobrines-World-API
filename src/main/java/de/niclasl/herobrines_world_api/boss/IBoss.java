package de.niclasl.herobrines_world_api.boss;

public interface IBoss {

    BossType getBossType();

    void setBossContext(BossContext bossContext);
}