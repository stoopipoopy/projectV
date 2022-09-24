package net.stoopipoopy.projectv.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stoopipoopy.projectv.projectv;

import java.awt.event.InputEvent;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, projectv.MOD_ID);
    public static final RegistryObject<Item> GIANT_PORKCHOP = ITEMS.register("giantporkchop",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
            );

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
