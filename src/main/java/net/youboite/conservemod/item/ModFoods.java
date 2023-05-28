package net.youboite.conservemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BANANE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 1), 1.0F).alwaysEat().build();
    public static final FoodProperties BANANE_EN_BOITE = (new FoodProperties.Builder()).nutrition(12).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 500, 1), 1.0F).alwaysEat().build();
    public static final FoodProperties CASSOULET_EN_BOITE = (new FoodProperties.Builder()).nutrition(24).saturationMod(2.4F).alwaysEat().build();
    public static final FoodProperties PASTEQUE_EN_BOITE = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.9F).alwaysEat().build();
}
