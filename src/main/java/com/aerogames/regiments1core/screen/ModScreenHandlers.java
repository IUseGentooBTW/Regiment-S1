package com.aerogames.regiments1core.screen;

import com.aerogames.regiments1core.RegimentS1Core;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<OvenScreenHandler> OVEN_SCREEN_HAANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(RegimentS1Core.MOD_ID, "oven"),
                    new ExtendedScreenHandlerType<>(OvenScreenHandler::new));

    public static void registerScreenHandlers() {
        RegimentS1Core.LOGGER.info("Registering Screen Handlers" + RegimentS1Core.MOD_ID);
    }
}
