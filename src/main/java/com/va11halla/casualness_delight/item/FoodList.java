package com.va11halla.casualness_delight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class FoodList {
    public static final FoodProperties FishAndChips = new FoodProperties.Builder().nutrition(14).saturationMod(0.5F).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(),6000,0), 1).build();
    public static final FoodProperties YorkshirePudding = new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties BeefNoodles = new FoodProperties.Builder().nutrition(10).saturationMod(0.6F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1).build();
    public static final FoodProperties CheeseWheelSlice = new FoodProperties.Builder().nutrition(5).saturationMod(0.5F).build();
    public static final FoodProperties StargazyPieSlice = new FoodProperties.Builder().nutrition(5).saturationMod(0.5F).effect(() -> new MobEffectInstance(MobEffects.CONFUSION,200,0), 1).effect(() -> new MobEffectInstance(MobEffects.BLINDNESS,300,0), 0.5F).build();
    public static final FoodProperties QuicheLorraineSlice = new FoodProperties.Builder().nutrition(5).saturationMod(0.5F).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(),1800,0), 1).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1).build();
}