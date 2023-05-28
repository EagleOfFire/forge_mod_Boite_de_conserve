package net.youboite.conservemod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.youboite.conservemod.conservemod;
import net.youboite.conservemod.item.Moditem;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, conservemod.MOD_ID);

        public static final RegistryObject<Block> BANANIA_WOOD = registerBlock( "banania_wood",
                () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(6f).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> BANANIA_LEAVES = registerBlock( "banania_leaves",
                () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES)
                        .strength(6f).requiresCorrectToolForDrops()));



        private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
            RegistryObject<T> toReturn = BLOCKS.register(name, block);
            registerBlockItem(name, toReturn);
            return toReturn;
        }

        private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
            return Moditem.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
        }

        public static void register(IEventBus eventBus) {
            BLOCKS.register(eventBus);
        }
}
