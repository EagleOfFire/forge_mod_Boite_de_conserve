package net.youboite.conservemod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.youboite.conservemod.conservemod;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput outpout, ExistingFileHelper existingFileHelper) {
        super(outpout, conservemod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
       //blockWithItem(ModBlock.);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
