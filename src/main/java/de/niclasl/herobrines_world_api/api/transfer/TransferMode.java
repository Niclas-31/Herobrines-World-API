package de.niclasl.herobrines_world_api.api.transfer;

import com.mojang.serialization.Codec;
import de.niclasl.herobrines_world_api.registry.HWRegistries;
import net.minecraft.resources.Identifier;

public interface TransferMode {
    Codec<TransferMode> CODEC =
            Identifier.CODEC.xmap(
                    HWRegistries.TRANSFER_MODES::get,
                    TransferMode::id
            );

    Identifier id();
}