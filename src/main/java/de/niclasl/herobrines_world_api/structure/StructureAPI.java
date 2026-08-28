package de.niclasl.herobrines_world_api.structure;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;

public interface StructureAPI {

    void spawnStructure(ServerLevel level, Identifier id, BlockPos position);
}