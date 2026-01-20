package com.xiaoyue.celestial_addition_tetra.effects;

import com.xiaoyue.celestial_addition_tetra.register.ItemEffects;
import com.xiaoyue.celestial_addition_tetra.utils.ModularUtils;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class Fabricated {

    public static void breakSpeed(PlayerEvent.BreakSpeed event, ItemStack stack, float config) {
        int level = ModularUtils.getEffectLevel(stack, ItemEffects.FABRICATED);
        int total = EnchantmentHelper.getEnchantments(stack).size();
        event.setNewSpeed(event.getNewSpeed() * (1 + level * total * config));
    }

    public static void onHurtEntity(LivingHurtEvent event, LivingEntity attacker, float config) {
        ItemStack stack = attacker.getMainHandItem();
        int level = ModularUtils.getEffectLevel(stack, ItemEffects.FABRICATED);
        int total = EnchantmentHelper.getEnchantments(stack).size();
        event.setAmount(event.getAmount() * 1 + (level * total * config));
    }
}
