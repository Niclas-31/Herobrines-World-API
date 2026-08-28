package de.niclasl.herobrines_world_api.transfer.node;

import de.niclasl.herobrines_world_api.transfer.wrapper.InventoryWrapper;
import net.minecraft.world.item.ItemStack;

public record StorageNode(InventoryWrapper inventory, ItemStack filter) {
}