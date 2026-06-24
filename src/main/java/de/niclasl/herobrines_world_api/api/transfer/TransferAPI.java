package de.niclasl.herobrines_world_api.api.transfer;

import de.niclasl.herobrines_world_api.api.transfer.resolver.InventoryResolver;
import de.niclasl.herobrines_world_api.api.transfer.wrapper.InventoryWrapper;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TransferAPI {
    private static final List<InventoryResolver> RESOLVERS = new ArrayList<>();

    public static void registerResolver(InventoryResolver resolver) {
        Objects.requireNonNull(resolver, "resolver");

        for (InventoryResolver registered : RESOLVERS) {
            if (registered.getClass() == resolver.getClass()) {
                throw new IllegalStateException(
                        "Resolver already registered: " + resolver.getClass().getName()
                );
            }
        }

        RESOLVERS.add(resolver);
    }

    public static Optional<InventoryWrapper> resolve(ServerLevel level, BlockPos pos, ResourceKey<Level> dimension) {
        Objects.requireNonNull(level, "level");
        Objects.requireNonNull(pos, "pos");
        Objects.requireNonNull(dimension, "dimension");

        for (InventoryResolver resolver : RESOLVERS) {
            InventoryWrapper wrapper = resolver.resolve(level, pos, dimension);

            if (wrapper != null) {
                return Optional.of(wrapper);
            }
        }

        return Optional.empty();
    }
}