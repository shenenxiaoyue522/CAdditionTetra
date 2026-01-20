package com.xiaoyue.celestial_addition_tetra;

import com.mojang.logging.LogUtils;
import com.tterrag.registrate.providers.ProviderType;
import com.xiaoyue.celestial_addition_tetra.data.CATLang;
import dev.xkmc.l2library.base.L2Registrate;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

import static com.xiaoyue.celestial_addition_tetra.CelestiaAdditionTetra.MODID;

@Mod(CelestiaAdditionTetra.MODID)
@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CelestiaAdditionTetra
{
    public static final String MODID = "celestial_addition_tetra";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final L2Registrate REGISTRATE = new L2Registrate(MODID);

    public CelestiaAdditionTetra() {
    }

    public static ResourceLocation loc(String s) {
        return new ResourceLocation(MODID, s);
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        REGISTRATE.addDataGenerator(ProviderType.LANG, CATLang::addRawLang);
    }
}
