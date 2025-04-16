package com.agruleus.glorytothewyrm.item;

import com.agruleus.glorytothewyrm.GloryToTheWyrm;
import com.agruleus.glorytothewyrm.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GloryToTheWyrm.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GLORY_TO_THE_WYRM_TAB = CREATIVE_MODE_TABS.register("glory_to_the_wyrm_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SHIVERPIKE.get()))
                    .title(Component.translatable("creativetab.glorytothewyrm.glory_to_the_wyrm_stuff"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BLACKENED_STEEL_INGOT.get());
                        pOutput.accept(ModItems.BLACKENED_SCRAP.get());
                        pOutput.accept(ModItems.SHIVERPIKE.get());
                        pOutput.accept(ModItems.SHIVERPIKE_CHISEL.get());
                        pOutput.accept(ModItems.SHIVERPIKE_REFINED.get());
                        pOutput.accept(ModItems.SEOVE_FRUIT.get());
                        pOutput.accept(ModItems.SEOVE_FRUIT_COOKED.get());

                        pOutput.accept(ModBlocks.BLACKENED_ORE.get());
                        pOutput.accept(ModBlocks.BLACKENED_DEEPSLATE_ORE.get());
                        pOutput.accept(ModBlocks.BLACKENED_STEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.SHIVERPIKE_BLOCK.get());
                        pOutput.accept(ModBlocks.SHIVERPIKE_ORE.get());
                        pOutput.accept(ModBlocks.SHIVERPIKE_CLUMP.get());
                        pOutput.accept(ModBlocks.SHIVERPIKE_TILE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
