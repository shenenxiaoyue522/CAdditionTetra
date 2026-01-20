package com.xiaoyue.celestial_addition_tetra.data;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class CATLang {

    public static void getMetaLang(RegistrateLangProvider pvd, String name) {
        pvd.add("tetra.material." + name, RegistrateLangProvider.toEnglishName(name));
        pvd.add("tetra.material." + name + ".prefix", RegistrateLangProvider.toEnglishName(name));
    }

    public static void getStatLang(RegistrateLangProvider pvd, String name, String info) {
        pvd.add("tetra.stats." + name, RegistrateLangProvider.toEnglishName(name));
        pvd.add("tetra.stats." + name + ".tooltip_short", info);
    }

    public static void addRawLang(RegistrateLangProvider pvd) {
        getMetaLang(pvd, "ocean_ingot");
        getMetaLang(pvd, "guardian_ingot");
        getMetaLang(pvd, "sakura_steel");
        getMetaLang(pvd, "virtual_gold");
        getMetaLang(pvd, "earth_core");
        getStatLang(pvd, "aquatic", "Offset the underwater excavation penalty");
        getStatLang(pvd, "nature", "The tool slowly regains durability in the backpack");
        getStatLang(pvd, "fabricated", "Each enchantment on this weapon increases attack damage and mining speed");
    }
}
