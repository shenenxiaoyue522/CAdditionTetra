package com.xiaoyue.celestial_addition_tetra.effects;

import com.xiaoyue.celestial_addition_tetra.register.ItemEffects;
import com.xiaoyue.celestial_addition_tetra.utils.ModularUtils;
import com.xiaoyue.celestial_core.utils.ItemUtils;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class Nature {

    public static void playerTick(Player player, int config) {
        if (player.tickCount % (config * 20) == 0) {
            for (ItemStack stack : player.getInventory().items) {
                int level = ModularUtils.getEffectLevel(stack, ItemEffects.NATURE);
                if (level > 0 && stack.isDamaged()) {
                    ItemUtils.repairStack(stack, level);
                }
            }
        }
    }
}
