package de.niclasl.hw_api.api.transfer.node;

import de.niclasl.hw_api.api.transfer.wrapper.InventoryWrapper;
import net.minecraft.world.item.ItemStack;

public record StorageNode(InventoryWrapper inventory, ItemStack filter) {
}