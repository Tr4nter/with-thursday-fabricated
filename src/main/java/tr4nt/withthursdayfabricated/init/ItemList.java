package tr4nt.withthursdayfabricated.init;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponent.Builder;

import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import tr4nt.withthursdayfabricated.item.DrinkItem;
import tr4nt.withthursdayfabricated.item.Knife;


public class ItemList {
    public static Item item() {
        Item.Settings Properties = new Item.Settings();
        FoodComponent.Builder Builder = new FoodComponent.Builder();
        return new Item(Properties);
    }

    public static Item food(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat) {
        Settings Setting = new Settings();
        Builder Builder = new FoodComponent.Builder();
        Builder.saturationModifier(saturation);
        Builder.hunger(nutrition);
        if (isMeat) {
            Builder.meat();
        }
        if (fastFood) {
            Builder.snack();
        }
        if (alwaysEat) {
            Builder.alwaysEdible();
        }
        Setting.food(Builder.build());
        return new Item(Setting);
    }
    public static Item Drink(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat) {
        Settings Setting = new Settings();
        Builder Builder = new FoodComponent.Builder();
        Builder.hunger(nutrition);
        Builder.saturationModifier(saturation);
        if (isMeat) {
            Builder.meat();
        }
        if (fastFood) {
            Builder.snack();
        }
        if (alwaysEat) {
            Builder.alwaysEdible();
        }
        Setting.food(Builder.build());
        return new DrinkItem(Setting);
    }
    public static Item Knife() {
        return new Knife();
    }


}
