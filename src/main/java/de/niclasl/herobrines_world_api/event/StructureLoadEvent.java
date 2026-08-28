package de.niclasl.herobrines_world_api.event;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.Event;

public class StructureLoadEvent extends Event {

    private final Identifier id;
    private final BlockPos position;

    public StructureLoadEvent(Identifier id, BlockPos position) {
        this.id = id;
        this.position = position;
    }

    public Identifier getId() {
        return id;
    }

    public BlockPos getPosition() {
        return position;
    }

    public static class Pre extends StructureLoadEvent {
        public Pre(Identifier id, BlockPos position) {
            super(id, position);
        }
    }

    public static class Post extends StructureLoadEvent {
        public Post(Identifier id, BlockPos position) {
            super(id, position);
        }
    }
}