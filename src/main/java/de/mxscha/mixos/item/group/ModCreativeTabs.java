package de.mxscha.mixos.item.group;

import de.mxscha.mixos.Mixos;
import de.mxscha.mixos.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mixos.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs {

    public static CreativeModeTab MIXOS_TAB;

    @SubscribeEvent
    public static void registerCreativeTabs(CreativeModeTabEvent.Register event) {
        MIXOS_TAB = event.registerCreativeModeTab(new ResourceLocation(Mixos.MOD_ID, "mixos_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.RUBY_GEM.get())).title(Component.translatable("creativemodetab.mixos_tab")));
    }
}
