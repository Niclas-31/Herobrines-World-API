package de.niclasl.herobrines_world_api.api.transfer;

import com.mojang.serialization.Codec;
import de.niclasl.herobrines_world_api.registry.HWRegistries;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public interface TransferMode {
    Codec<TransferMode> CODEC =
            Identifier.CODEC.xmap(
                    HWRegistries.TRANSFER_MODES::get,
                    TransferMode::id
            );

    @NotNull Identifier id();

    int priority();
}