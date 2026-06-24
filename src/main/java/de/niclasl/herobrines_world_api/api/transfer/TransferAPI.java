package de.niclasl.herobrines_world_api.api.transfer;

import de.niclasl.herobrines_world_api.api.transfer.resolver.InventoryResolver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransferAPI {
    private static final List<InventoryResolver> RESOLVERS = new ArrayList<>();

    public static void registerResolver(InventoryResolver resolver) {
        for (InventoryResolver registered : RESOLVERS) {
            if (registered.getClass() == resolver.getClass()) {
                throw new IllegalStateException(
                        "Resolver already registered: " + resolver.getClass().getName()
                );
            }
        }

        RESOLVERS.add(resolver);
    }

    public static List<InventoryResolver> getResolvers() {
        return Collections.unmodifiableList(RESOLVERS);
    }
}