package de.niclasl.herobrines_world_api.api.transfer.wrapper;

import net.minecraft.world.item.ItemStack;

public interface InventoryWrapper {

    int size();

    ItemStack get(int slot);

    void set(int slot, ItemStack stack);

    default boolean canAccept(ItemStack stack) {
        return true;
    }
}