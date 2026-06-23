package de.niclasl.herobrines_world_api.api.event;

import de.niclasl.herobrines_world_api.api.transfer.resolver.InventoryResolver;
import net.neoforged.bus.api.Event;

import java.util.ArrayList;
import java.util.List;

public class RegisterResolverEvent extends Event {

    private final List<InventoryResolver> RESOLVERS = new ArrayList<>();

    public void registerResolver(InventoryResolver resolver) {
        for (InventoryResolver registered : RESOLVERS) {
            if (registered.getClass() == resolver.getClass()) {
                throw new IllegalStateException(
                        "Resolver already registered: " + resolver.getClass().getName()
                );
            }
        }

        RESOLVERS.add(resolver);
    }

    public List<InventoryResolver> getResolvers() {
        return List.copyOf(RESOLVERS);
    }
}