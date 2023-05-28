package net.youboite.conservemod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.youboite.conservemod.block.ModBlocks;
import net.youboite.conservemod.item.ModCreativeModeTabs;
import net.youboite.conservemod.item.Moditem;
import org.slf4j.Logger;

@Mod(conservemod.MOD_ID)
public class conservemod {

    public static final String MOD_ID = "conservemod";

    private static final Logger LOGGER = LogUtils.getLogger();


  public conservemod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Moditem.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(Moditem.BANANE_EN_BOITE);
            event.accept(Moditem.PASTEQUE_EN_BOITE);
            event.accept(Moditem.CASSOULET_EN_BOITE);
            event.accept(Moditem.BOITE_DE_CONSERVE);
            event.accept(Moditem.BANANE);
        }

        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.BANANIA_WOOD);


        }

        if(event.getTab() == CreativeModeTabs.COMBAT){
            event.accept(Moditem.EPEE_EN_BOITE);
        }

        if(event.getTab() == ModCreativeModeTabs.CONSERVE_TAB) {
            event.accept(Moditem.BANANE_EN_BOITE);
            event.accept(Moditem.PASTEQUE_EN_BOITE);
            event.accept(Moditem.CASSOULET_EN_BOITE);
            event.accept(Moditem.BOITE_DE_CONSERVE);
            event.accept(Moditem.BANANE);

            event.accept(ModBlocks.BANANIA_WOOD);

            event.accept(Moditem.EPEE_EN_BOITE);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
