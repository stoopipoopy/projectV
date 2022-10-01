package net.stoopipoopy.projectv.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stoopipoopy.projectv.projectv;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, projectv.MOD_ID);
    public static final RegistryObject<Item> GIANT_PORKCHOP = ITEMS.register("giantporkchop",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ProjectV))
    );
    public static final RegistryObject<Item> AXOLOTL_AQUARIUM = ITEMS.register("axolotlaquarium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ProjectV).stacksTo(1))
    );
    public static final RegistryObject<Item> CHOO_CHOO_TRAIN = ITEMS.register("choochootrain",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ProjectV).stacksTo(1))
    );
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
