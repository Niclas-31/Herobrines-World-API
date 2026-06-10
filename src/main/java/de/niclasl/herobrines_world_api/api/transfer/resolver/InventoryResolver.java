package de.niclasl.herobrines_world_api.api.transfer.resolver;

import de.niclasl.herobrines_world_api.api.transfer.wrapper.InventoryWrapper;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;

public interface InventoryResolver {
    InventoryWrapper resolve(
            ServerLevel level,
            BlockPos pos,
            ResourceKey<Level> dimension
    );
}