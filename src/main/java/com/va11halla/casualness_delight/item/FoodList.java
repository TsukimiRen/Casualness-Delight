package com.va11halla.casualness_delight.item;

import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
import com.va11halla.casualness_delight.registry.EffectRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodList {
    public static final FoodComponent FishAndChips = new FoodComponent.Builder().hunger(14).saturationModifier(0.5F).statusEffect(new StatusEffectInstance(EffectsRegistry.COMFORT.get(), 6000, 0), 1).build();
    public static final FoodComponent YorkshirePudding = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent BeefNoodles = new FoodComponent.Builder().hunger(10).saturationModifier(0.6F).statusEffect(new StatusEffectInstance(EffectsRegistry.COMFORT.get(), 3600, 0), 1).build();
    public static final FoodComponent CheeseWheelSlice = new FoodComponent.Builder().hunger(5).saturationModifier(0.5F).build();
    public static final FoodComponent StargazyPieSlice = new FoodComponent.Builder().hunger(5).saturationModifier(0.5F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 1).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 300, 0), 0.5F).build();
    public static final FoodComponent QuicheLorraineSlice = new FoodComponent.Builder().hunger(5).saturationModifier(0.5F).statusEffect(new StatusEffectInstance(EffectsRegistry.COMFORT.get(), 1800, 0), 1).statusEffect(new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 1200, 0), 1).build();
    public static final FoodComponent PhantomDumplings = new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1200, 0), 1).build();
    public static final FoodComponent PhantomPuff = new FoodComponent.Builder().hunger(4).saturationModifier(0.8F).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 800, 0), 1).build();
    public static final FoodComponent SpicyStrips = new FoodComponent.Builder().hunger(3).saturationModifier(0.5F).alwaysEdible().snack().statusEffect(new StatusEffectInstance(EffectRegistry.ROTTEN.get(), 1200, 0), 0.8F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 1), 1).build();
    public static final FoodComponent GreenTongue = new FoodComponent.Builder().hunger(3).saturationModifier(0.2F).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 160, 0), 1).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 300, 2), 1).build();
    public static final FoodComponent RoastGluten = new FoodComponent.Builder().hunger(8).saturationModifier(1F).alwaysEdible().snack().build();
    public static final FoodComponent RawDonkeyMeat = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).build();
    public static final FoodComponent CookedDonkeyMeat = new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).build();
    public static final FoodComponent DonkeyBurger = new FoodComponent.Builder().hunger(14).saturationModifier(0.8F).build();
    public static final FoodComponent BowlOfPaperWrappedFish = new FoodComponent.Builder().hunger(10).saturationModifier(0.8F).statusEffect(new StatusEffectInstance(EffectsRegistry.COMFORT.get(), 3600, 0),1).build();
    public static final FoodComponent PotatoBoboChicken = new FoodComponent.Builder().hunger(4).saturationModifier(0.8F).statusEffect(new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 600, 0), 1).build();
    public static final FoodComponent ChickenBoboChicken = new FoodComponent.Builder().hunger(4).saturationModifier(0.8F).statusEffect(new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 600, 0), 1).build();
    public static final FoodComponent CabbageBoboChicken = new FoodComponent.Builder().hunger(4).saturationModifier(0.8F).statusEffect(new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 600, 0), 1).build();
    public static final FoodComponent PotatoChip = new FoodComponent.Builder().hunger(4).saturationModifier(1.0F).build();
    public static final FoodComponent SpringRoll = new FoodComponent.Builder().hunger(6).saturationModifier(0.8F).statusEffect(new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 600, 0), 1).build();
    public static final FoodComponent FriedChickenChip = new FoodComponent.Builder().hunger(3).saturationModifier(0.8F).build();
    public static final FoodComponent FriedFish = new FoodComponent.Builder().hunger(4).saturationModifier(0.7F).build();
    public static final FoodComponent Tonkatsu = new FoodComponent.Builder().hunger(8).saturationModifier(0.85F).build();
    public static final FoodComponent FriedDumpling = new FoodComponent.Builder().hunger(16).saturationModifier(0.7F).statusEffect(new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 3600, 0), 1).build();
    public static final FoodComponent BowlOfFriedDumpling = new FoodComponent.Builder().hunger(4).saturationModifier(0.7F).build();
    public static final FoodComponent BowlOfSweetRice = new FoodComponent.Builder().hunger(4).saturationModifier(0.7F).build();
}