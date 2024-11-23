package tr4nt.withthursdayfabricated;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tr4nt.withthursdayfabricated.event.ModEvent;
import tr4nt.withthursdayfabricated.init.ItemRegister;
import tr4nt.withthursdayfabricated.init.WithThursdayGroup;

public class WithThursdayFabricated implements ModInitializer {
	public static final String MOD_ID = "with-thursday-fabricated";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ItemRegister.register();
		WithThursdayGroup.register();
		ServerLivingEntityEvents.AFTER_DEATH.register(new ModEvent());
	}
}