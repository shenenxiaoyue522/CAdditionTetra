package com.xiaoyue.celestial_addition_tetra.effects;

import com.xiaoyue.celestial_addition_tetra.register.ItemEffects;
import com.xiaoyue.celestial_addition_tetra.utils.ModularUtils;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class Aquatic {

    public static void breakSpeed(PlayerEvent.BreakSpeed event, Player player, ItemStack stack) {
        if (player.isUnderWater()) {
            int level = ModularUtils.getEffectLevel(stack, ItemEffects.AQUATIC);
            if (level > 0) {
                event.setNewSpeed(event.getNewSpeed() * 5f);
            }
        }
    }
}
