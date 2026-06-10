package de.niclasl.hw_api.api.transfer;

import de.niclasl.hw_api.api.transfer.wrapper.InventoryWrapper;
import net.minecraft.world.item.ItemStack;

public interface TransferAPI {
    void transfer(
            InventoryWrapper source,
            InventoryWrapper target,
            TransferMode mode,
            int maxSlots
    );

    ItemStack insertInto(
            InventoryWrapper target,
            ItemStack stack
    );
}