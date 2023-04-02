package ipplayz343.wanderingmerchants.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Crown extends Item {
    public Crown(){
        super(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(this));
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (hand == hand.MAIN_HAND){
            user.playSound(SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME,5.0f,1.0f);
        }
        return super.use(world, user, hand);
    }
}
