package de.mxscha.mixos;

import com.mojang.logging.LogUtils;
import de.mxscha.mixos.item.ModItems;
import de.mxscha.mixos.item.group.ModCreativeTabs;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(Mixos.MOD_ID)
public class Mixos {

    public static final String MOD_ID = "mixos";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Mixos() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        registerMixos(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void registerMixos(IEventBus eventBus) {
        ModItems.register(eventBus);
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ModCreativeTabs.MIXOS_TAB) {
            event.accept(ModItems.SAPPHIRE_GEM);
            event.accept(ModItems.RUBY_GEM);
            event.accept(ModItems.JADE_GEM);
            event.accept(ModItems.ELECTRIC_ALLOY);
            event.accept(ModItems.TIN_INGOT);
            event.accept(ModItems.ENDER_INGOT);
            event.accept(ModItems.CAERULA_INGOT);
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
