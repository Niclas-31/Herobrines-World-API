package de.niclasl.hw_api.registry;

import de.niclasl.hw_api.api.access.AccessMode;
import de.niclasl.hw_api.api.transfer.TransferMode;
import net.minecraft.resources.Identifier;

import java.util.HashMap;
import java.util.Map;

public final class HWRegistries {

    private HWRegistries() {}

    public static final Map<Identifier, TransferMode> TRANSFER_MODES =
            new HashMap<>();

    public static final Map<Identifier, AccessMode> ACCESS_MODES =
            new HashMap<>();
}