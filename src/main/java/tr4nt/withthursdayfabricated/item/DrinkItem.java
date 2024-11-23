package tr4nt.withthursdayfabricated.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import tr4nt.withthursdayfabricated.init.ItemRegister;


public class DrinkItem extends Item {
    public DrinkItem(Item.Settings Setting)
    {
        super(Setting);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }


    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user)
    {
        if (user instanceof PlayerEntity)
        {
            if(!((PlayerEntity) user).getInventory().insertStack(new ItemStack(ItemRegister.empty_cup)))
            {
                ((PlayerEntity) user).dropItem(new ItemStack(ItemRegister.empty_cup), false);
            }
        }
        return super.finishUsing(stack, world, user);

    }
}
