package top.cs1.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.cs1.ScioModClient;
import top.cs1.Seiomod;

public class Modltems {
    public static final Item CITRINE = registerItem("Xan and YuTouf",
            new Item(new FabricItemSettings()));
    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(Seiomod.MOD_ID, name), item);
        for (ItemGroup itemGroup : itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }
    public static void registerModItem() {
        Seiomod.LOGGER.debug("Registering mod items for" + Seiomod.MOD_ID);
    }
}
