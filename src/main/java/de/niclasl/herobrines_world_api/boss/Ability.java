package de.niclasl.herobrines_world_api.boss;


import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface Ability {
    @NotNull Identifier id();

    default void execute(BossContext context, int amount) {
    }

    default void execute(BossContext context, int amount, List<EntityType<?>> entities) {
    }
}