package net.youboite.conservemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.youboite.conservemod.conservemod;

public class Moditem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, conservemod.MOD_ID);

    //FOOD
    public  static final RegistryObject<Item> BANANE_EN_BOITE = ITEMS.register("banane_en_boite",
            () -> new Item(new Item.Properties().food(ModFoods.BANANE_EN_BOITE)));
    public  static final RegistryObject<Item> PASTEQUE_EN_BOITE = ITEMS.register("pasteque_en_boite",
            () -> new Item(new Item.Properties().food(ModFoods.PASTEQUE_EN_BOITE)));
    public  static final RegistryObject<Item> CASSOULET_EN_BOITE = ITEMS.register("cassoulet_en_boite",
            () -> new Item(new Item.Properties().food(ModFoods.CASSOULET_EN_BOITE)));
    public  static final RegistryObject<Item> BANANE = ITEMS.register("banane",
            () -> new Item(new Item.Properties().food(ModFoods.BANANE)));

    //MISC
    public  static final RegistryObject<Item> BOITE_DE_CONSERVE = ITEMS.register("boite_de_conserve",
            () -> new Item(new Item.Properties()));

    //WEAPON
    public  static final RegistryObject<Item> EPEE_EN_BOITE = ITEMS.register("epee_en_boite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)  {
        ITEMS.register(eventBus);
    }
}
