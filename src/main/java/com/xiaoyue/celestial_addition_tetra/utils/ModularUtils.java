package com.xiaoyue.celestial_addition_tetra.utils;

import net.minecraft.world.item.ItemStack;
import se.mickelus.tetra.effect.ItemEffect;
import se.mickelus.tetra.items.modular.ModularItem;

public class ModularUtils {

    public static ItemEffect getItemEffect(String key) {
        return ItemEffect.get(key);
    }

    public static int getEffectLevel(ItemStack stack, ItemEffect effect) {
        if (stack.getItem() instanceof ModularItem modular) {
            return modular.getEffectLevel(stack, effect);
        }
        return 0;
    }
}
