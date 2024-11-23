package tr4nt.withthursdayfabricated.init;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import tr4nt.withthursdayfabricated.WithThursdayFabricated;

public class WithThursdayGroup
{
   public static final RegistryKey<ItemGroup> ItemGroupKey = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(WithThursdayFabricated.MOD_ID, "item_group"));
   public static final net.minecraft.item.ItemGroup WithThursdayItemGroup = FabricItemGroup.builder().icon(() -> new ItemStack(ItemRegister.BaconPaNini))
           .displayName(Text.translatable("itemGroup.WithThursday")).build();

   public static void register()
   {
      Registry.register(Registries.ITEM_GROUP, ItemGroupKey, WithThursdayItemGroup);
      ItemGroupEvents.modifyEntriesEvent(ItemGroupKey).register(itemGroup -> {
        ItemRegister.FoodList.forEach(itemGroup::add);
      });
   }
}
