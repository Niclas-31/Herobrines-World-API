package de.niclasl.hw_api.api.transfer;

import com.mojang.serialization.Codec;
import de.niclasl.hw_api.registry.HWRegistries;
import net.minecraft.resources.Identifier;

public interface TransferMode {
    public static final Codec<TransferMode> CODEC =
            Identifier.CODEC.xmap(
                    HWRegistries.TRANSFER_MODES::get,
                    TransferMode::id
            );

    Identifier id();
}