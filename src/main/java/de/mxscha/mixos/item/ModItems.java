package de.mxscha.mixos.item;

import de.mxscha.mixos.Mixos;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mixos.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE_GEM = ITEMS.register("sapphire_gem", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_GEM = ITEMS.register("ruby_gem", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE_GEM = ITEMS.register("jade_gem", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRIC_ALLOY = ITEMS.register("electric_alloy", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDER_INGOT = ITEMS.register("ender_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAERULA_INGOT = ITEMS.register("caerula_ingot", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
