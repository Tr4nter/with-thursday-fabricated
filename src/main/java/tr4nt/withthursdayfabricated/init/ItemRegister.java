package tr4nt.withthursdayfabricated.init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import tr4nt.withthursdayfabricated.WithThursdayFabricated;

import java.util.ArrayList;

public class ItemRegister {

    public static ArrayList<Item> FoodList = new ArrayList<>();
    public static ArrayList<Item> ToolList = new ArrayList<>();


    public static final Item knife = registerItem("knife", ItemList.Knife());
    public static final Item crumbs = registerItem("crumbs", ItemList.item());
    public static final Item empty_cup = registerItem("empty_cup", ItemList.item());
    public static final Item Orleans = registerItem("orleans", ItemList.item());
    public static final Item BeatenEggs = registerItem("beaten_eggs",ItemList.Drink(0, 1, false, false, true) );
    public static final Item Cheese = registerItem("cheese",ItemList.food(2, 3, false, false, true) );
    public static final Item CoffeeFlour = registerItem( "coffee_flour",ItemList.item());
    public static final Item Chocolate = registerItem("chocolate_bar",ItemList.food(2, 3, false, false, true) );


    // food.
    /* Chicken  */

    public static final Item ChickenWings = registerItem("chicken_wings",ItemList.food(2, 2, true, false, true) );
    public static final Item CookedChickenWings = registerItem("cooked_chicken_wings",ItemList.food(6, 2, true, false, true) );
    public static final Item ChickenBreast = registerItem("chicken_breast",ItemList.food(2, 2, true, false, true) );
    public static final Item CookedChickenBreast = registerItem("cooked_chicken_breast",ItemList.food(6, 4, true, false, true) );
    public static final Item DicedChicken = registerItem("diced_chicken",ItemList.food(1, 0, true, true, true) );
    public static final Item CookedDicedChicken = registerItem("cooked_diced_chicken",ItemList.food(2, 1, true, true, true) );

    // restaurant 2 Update
    public static final Item OriginalRecipe = registerItem("original_recipe",ItemList.food(10, 16, true, false, true) );
    public static final Item ChickBucket = registerItem("chicken_bucket",ItemList.food(18,20,false,false,true) );


    /* Snack */
    public static final Item OrleansRoastedWings = registerItem("orleans_roasted_wings", ItemList.food(4, 6, false, false, true));
    public static final Item PopcornChicken = registerItem("chicken_pop",ItemList.food(7, 5, true, false, true) );
    public static final Item ChickenNugget = registerItem("chicken_nugget",ItemList.food(4, 2, true, false, true) );
    public static final Item SpicySquid = registerItem("spicy_squid",ItemList.food(4, 2, true, false, true) );
    public static final Item CornSalad = registerItem("corn_salad",ItemList.food(6, 5, true, false, true) );
    public static final Item PotatoChips = registerItem("potato_chips",ItemList.food(2, 2, true, false, true) );
    public static final Item FrenchFries = registerItem("french_fries",ItemList.food(6, 2, true, false, true) );
    public static final Item MashedPotato = registerItem("mashed_potato",ItemList.food(6, 2, true, false, true) );

    // restaurant 2 Update
    public static final Item SunEgg = registerItem("sun_egg",ItemList.food(2, 2, false, true, true) );
    public static final Item PaNiNiBread = registerItem("pnn_bread",ItemList.food(2, 2, false, true, true) );
    public static final Item PotatoPie = registerItem("potato_pie",ItemList.food(6, 8, false, true, true) );
    public static final Item ThuringiaSausage = registerItem("thuringia_sausage",ItemList.food(2, 2, false, true, true) );
    public static final Item FleshBonePlus = registerItem("flesh_bone",ItemList.food(3, 2, true, true, true) );
    public static final Item Bacon = registerItem("bacon",ItemList.food(3, 2, true, true, true) );


    /* WithPack */
    public static final Item BreakfastPack = registerItem("breakfast",ItemList.food(12, 16, false, false, true) );
    public static final Item Sundae = registerItem("sundae",ItemList.Drink(3, 3,false, true, false) );

    // PaNini
    public static final Item BaconPaNini = registerItem("bacon_panini",ItemList.food(9, 7, false, false, true) );
    public static final Item ChickenPaNini = registerItem("chicken_panini",ItemList.food(9, 7, false, false, true) );
    public static final Item BeefPaNini = registerItem("beef_panini",ItemList.food(9, 7, false, false, true) );
    public static final Item PorkPaNini = registerItem("pork_panini",ItemList.food(9, 7, false, false, true) );

    // Burger
    public static final Item Extra_TastyCrispyBurger = registerItem("etc_burger",ItemList.food(7, 7, false, false, true) );
    public static final Item ChickenBurger = registerItem("chicken_burger",ItemList.food(7, 7, false, false, true) );
    public static final Item BaconChickenBurger = registerItem("bacon_chicken_burger",ItemList.food(7, 7, false, false, true) );
    public static final Item OrleansBurger = registerItem("orleans_burger",ItemList.food(7, 7, false, false, true) );
    public static final Item BBQPorkBurger = registerItem("bbq_burger",ItemList.food(7, 7, false, false, true) );
    public static final Item ChickPorkBurger = registerItem("cp_burger",ItemList.food(14, 14, false, false, true) );

    // Drink
    public static final Item Cola = registerItem("cola",ItemList.Drink(2, 2, false, false, true) );
    public static final Item AppleJuice = registerItem("apple_juice",ItemList.Drink(2, 2, false, false, true) );
    public static final Item SparklingAppleJuiceDrink = registerItem("sparkling_apple_juice",ItemList.Drink(2, 2, false, false, true) );
    public static final Item Ice_creamFloatCoffee = registerItem("ice_cream_float",ItemList.Drink(2, 2, false, false, true) );
    public static final Item classicCoffee = registerItem("classic_coffee",ItemList.Drink(2, 2, false, false, true) );
    public static final Item USA = registerItem("usa_cofe",ItemList.Drink(2, 2, false, false, true) );
    public static final Item Cappuccino = registerItem("cappuccino",ItemList.Drink(2, 2, false, false, true) );
    public static final Item Mocha = registerItem("mocha",ItemList.Drink(2, 2, false, false, true) );
    public static final Item MilkTea = registerItem("milk_tea", ItemList.Drink(4, 6, false, false, true));

    private static Item registerItem(String name, Item item)
    {
        Item newFood =  Registry.register(Registries.ITEM, Identifier.of(WithThursdayFabricated.MOD_ID, name), item);
        if (name != "knife")
        {
            FoodList.add(newFood);
        }
        else
        {
            ToolList.add(newFood);
        }
        return newFood;
    }

    public static void register()
    {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries ->
        {

            FoodList.forEach(fabricItemGroupEntries::add);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries ->
        {

            ToolList.forEach(fabricItemGroupEntries::add);

        });
    }
}
