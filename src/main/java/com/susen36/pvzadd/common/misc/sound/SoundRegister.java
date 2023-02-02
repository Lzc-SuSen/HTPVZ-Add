package com.susen36.pvzadd.common.misc.sound;

import com.hungteen.pvz.utils.StringUtil;
import com.susen36.pvzadd.PVZAdd;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundRegister {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PVZAdd.MOD_ID);

    //disc
    public static final RegistryObject<SoundEvent> WATRY_GRAVES = registerSound("watery_graves");
    public static final RegistryObject<SoundEvent> BRAINIAC_MANIAC = registerSound("brainiac_maniac");
    public static final RegistryObject<SoundEvent> LOONBOON = registerSound("loonboon");
    public static final RegistryObject<SoundEvent> GRAZE_THE_ROOF = registerSound("graze_the_roof");

    private static RegistryObject<SoundEvent> registerSound(String name){
        return SOUNDS.register(name, ()-> new SoundEvent(StringUtil.prefix(name)));
    }

}
