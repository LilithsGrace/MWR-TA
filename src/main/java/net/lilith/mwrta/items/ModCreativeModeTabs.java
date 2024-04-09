package net.lilith.mwrta.items;

import net.lilith.mwrta.mwrta;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
    DeferredRegister.create(Registries.CREATIVE_MODE_TAB, mwrta.MODID);

    public static final RegistryObject<CreativeModeTab> MWRTAB = CREATIVE_MODE_TABS.register("MWR", () -> CreativeModeTab.builder()
    .icon(() -> ModItems.SWORDHANDLE.get().getDefaultInstance())
    .title(Component.translatable("MWR"))
    .displayItems((parameters, output) -> {
        output.accept(ModItems.SWORDHANDLE.get());
        output.accept(ModItems.SWORDCORE.get());
    })
    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
