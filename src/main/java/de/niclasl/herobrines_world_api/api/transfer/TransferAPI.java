package de.niclasl.herobrines_world_api.api.transfer;

import de.niclasl.herobrines_world_api.api.transfer.resolver.InventoryResolver;

public final class TransferAPI {
    private static InventoryResolver resolver;

    public static void setResolver(InventoryResolver resolver) {
        TransferAPI.resolver = resolver;
    }

    public static InventoryResolver resolver() {
        return resolver;
    }
}