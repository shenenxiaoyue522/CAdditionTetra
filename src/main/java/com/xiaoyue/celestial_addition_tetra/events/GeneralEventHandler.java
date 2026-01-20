package com.xiaoyue.celestial_addition_tetra.events;

import com.xiaoyue.celestial_addition_tetra.effects.Aquatic;
import com.xiaoyue.celestial_addition_tetra.effects.Fabricated;
import com.xiaoyue.celestial_addition_tetra.effects.Nature;
import com.xiaoyue.celestial_core.data.CCModConfig;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.xiaoyue.celestial_addition_tetra.CelestiaAdditionTetra.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GeneralEventHandler {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        int config = CCModConfig.COMMON.sakuraToolRecoveryTime.get();
        Nature.playerTick(event.player, config);
    }

    @SubscribeEvent
    public static void onPlayerBreak(PlayerEvent.BreakSpeed event) {
        Player player = event.getEntity();
        ItemStack stack = player.getMainHandItem();
        Aquatic.breakSpeed(event, player, stack);
        float config = CCModConfig.COMMON.virtualGoldToolPerAdd.get().floatValue();
        Fabricated.breakSpeed(event, stack, config);
    }

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        if (event.getSource().getEntity() instanceof LivingEntity entity) {
            float config = CCModConfig.COMMON.virtualGoldToolPerAdd.get().floatValue();
            Fabricated.onHurtEntity(event, entity, config);
        }
    }
}
