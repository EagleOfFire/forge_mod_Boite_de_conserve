package net.youboite.conservemod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.CreativeModeTabSearchRegistry;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.youboite.conservemod.conservemod;

@Mod.EventBusSubscriber(modid = conservemod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab CONSERVE_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        CONSERVE_TAB = event.registerCreativeModeTab(new ResourceLocation(conservemod.MOD_ID, "conserve_tab"),
                builder -> builder.icon(() -> new ItemStack(Moditem.BOITE_DE_CONSERVE.get()))
                        .title(Component.translatable("creativemodtab.conserve_tab")));
    }
}
