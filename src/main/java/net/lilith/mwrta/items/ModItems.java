package net.lilith.mwrta.items;

import net.lilith.mwrta.mwrta;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    
    public static final DeferredRegister<Item> ITEMS =
    DeferredRegister.create(ForgeRegistries.ITEMS, mwrta.MODID);

    public static final RegistryObject<Item> SWORDHANDLE = ITEMS.register("swordhandle", 
    () -> new SwordItem(null, 2, 2, new Item.Properties()));
    public static final RegistryObject<Item> SWORDCORE = ITEMS.register("swordcore", 
    () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
