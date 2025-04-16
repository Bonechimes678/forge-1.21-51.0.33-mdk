package com.agruleus.glorytothewyrm.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SEOVE_FRUIT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 100), 0.75f).build();

    public static final FoodProperties SEOVE_FRUIT_COOKED = new FoodProperties.Builder().nutrition(4).saturationModifier(0.7f).build();
}
