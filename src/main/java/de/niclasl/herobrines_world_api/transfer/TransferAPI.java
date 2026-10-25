package de.niclasl.herobrines_world_api.transfer;

import de.niclasl.herobrines_world_api.transfer.resolver.Resolver;

import java.util.ArrayList;
import java.util.List;

public class TransferAPI {
    private static final List<Resolver<?>> RESOLVERS = new ArrayList<>();

    public static void registerResolver(Resolver<?> resolver) {
        for (Resolver<?> registered : RESOLVERS) {
            if (registered.getClass() == resolver.getClass()) {
                throw new IllegalStateException("Resolver already registered: " + resolver.getClass().getName());
            }
        }

        RESOLVERS.add(resolver);
    }

    public static <R extends Resolver<?>> List<R> getResolvers(Class<R> resolverType) {
        return RESOLVERS.stream()
                .filter(resolverType::isInstance)
                .map(resolverType::cast)
                .toList();
    }
}