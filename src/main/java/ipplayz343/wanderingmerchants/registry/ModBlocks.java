package ipplayz343.wanderingmerchants.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block RUBY_ORE = new Block(FabricBlockSettings
            .of(Material.AMETHYST)
            .requiresTool()
            //.drops()
            .strength(3.0f, 6.0f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
    );
    public static final Item ITEM_RUBY_ORE = new BlockItem(ModBlocks.RUBY_ORE, new FabricItemSettings());
    public static void registerBlock(){
        Registry.register(Registries.BLOCK, new Identifier("wandering_merchants", "ruby_ore"), RUBY_ORE);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ITEM_RUBY_ORE));
        Registry.register(Registries.ITEM, new Identifier("wandering_merchants", "ruby_ore"), ITEM_RUBY_ORE);
    }
}