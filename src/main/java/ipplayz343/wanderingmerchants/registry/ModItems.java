package ipplayz343.wanderingmerchants.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ipplayz343.wanderingmerchants.items.Crown;

public class ModItems {
    //items
    public static final Crown Crown = new Crown();
    //blockItems
    public static void registerItems(){
        Registry.register(Registries.ITEM, new Identifier("wandering_merchants", "crown"), Crown);
    }
}
