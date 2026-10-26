package de.niclasl.herobrines_world_api.registry;

import de.niclasl.herobrines_world_api.transfer.resolver.Resolver;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;

import java.util.*;

public class ResolverRegistry {

  private final Map<Class<?>, List<Resolver<?>>> resolvers = new HashMap<>();

  public <T> void register(Class<T> resolverClass, Resolver<? extends T> resolver) {
    if (resolvers.containsKey(resolverClass)) {
      throw new IllegalArgumentException("Resolver already registered: " + resolverClass.getName());
    }

    resolvers.computeIfAbsent(resolverClass, _ -> new  ArrayList<>()).add(resolver);
  }

  public <T> T resolve(Class<T> type, ServerLevel level, BlockPos pos) {
    for (Resolver<?> resolver : resolvers.getOrDefault(type, List.of())) {

      Object result = resolver.resolve(level, pos);

      if (type.isInstance(result)) {
        return type.cast(result);
      }
    }

    return null;
  }
}