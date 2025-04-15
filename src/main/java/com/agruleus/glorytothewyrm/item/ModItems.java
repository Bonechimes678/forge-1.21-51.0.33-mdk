package com.agruleus.glorytothewyrm.item;

import com.agruleus.glorytothewyrm.GloryToTheWyrm;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GloryToTheWyrm.MOD_ID);

    public static final RegistryObject<Item> SHIVERPIKE =ITEMS.register("shiverpike", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHIVERPIKE_REFINED =ITEMS.register("shiverpike_refined", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
