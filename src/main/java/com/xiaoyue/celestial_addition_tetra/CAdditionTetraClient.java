package com.xiaoyue.celestial_addition_tetra;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static com.xiaoyue.celestial_addition_tetra.CelestiaAdditionTetra.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CAdditionTetraClient {

    @SubscribeEvent
    public static void onClientStep(FMLClientSetupEvent event) {

    }
}
