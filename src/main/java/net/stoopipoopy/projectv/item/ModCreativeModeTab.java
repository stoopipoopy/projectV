package net.stoopipoopy.projectv.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ProjectV = new CreativeModeTab("ProjectV") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GIANT_PORKCHOP.get());
        }
    };
}
