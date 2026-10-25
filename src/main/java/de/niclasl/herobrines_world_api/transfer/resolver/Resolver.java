package de.niclasl.herobrines_world_api.transfer.resolver;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;

public abstract class Resolver<T> {

  public abstract T resolve(ServerLevel level, BlockPos pos);
}
