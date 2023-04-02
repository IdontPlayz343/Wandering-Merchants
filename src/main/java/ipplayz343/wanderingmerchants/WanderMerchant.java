package ipplayz343.wanderingmerchants;

import net.fabricmc.api.ModInitializer;
import ipplayz343.wanderingmerchants.registry.ModBlocks;
import ipplayz343.wanderingmerchants.registry.ModItems;

public class WanderMerchant implements ModInitializer {
    public static final String MOD_ID = "wandering_merchants";
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlock();
    }
}

