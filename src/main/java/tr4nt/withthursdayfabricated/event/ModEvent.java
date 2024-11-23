package tr4nt.withthursdayfabricated.event;


import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.item.ItemStack;
import tr4nt.withthursdayfabricated.init.ItemRegister;

public class ModEvent implements ServerLivingEntityEvents.AfterDeath{

    @Override
    public void afterDeath(LivingEntity livingEntity, DamageSource damageSource) {
        if (livingEntity == null) return;
        if (livingEntity instanceof ChickenEntity)
        {
            if (livingEntity.isOnFire())
            {
                livingEntity.dropItem(new ItemStack(ItemRegister.CookedChickenWings).getItem());
            }
            else
            {
                livingEntity.dropItem(new ItemStack(ItemRegister.ChickenWings).getItem());
            }

        }

    }
}
