package de.niclasl.herobrines_world_api.structure;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;

public record StructureDefinition(Identifier id, ResourceKey<Level> dimension, boolean enabled) {
}