package tr4nt.withthursdayfabricated.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Knife extends Item {

    public Knife() {

        super(new Item.Settings().maxCount(1).maxDamage(20));
    }


    @Override
    public ItemStack getRecipeRemainder(ItemStack item)
    {
        ItemStack Knife = new ItemStack(this);
        Knife.setDamage(item.getDamage() + 1);
        if (Knife.getDamage() >= Knife.getMaxDamage())
        {
            return ItemStack.EMPTY;
        }
        return Knife;
    }


}
