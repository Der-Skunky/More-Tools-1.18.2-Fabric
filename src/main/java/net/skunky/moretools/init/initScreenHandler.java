package net.skunky.moretools.init;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.skunky.moretools.MoreTools;
import net.skunky.moretools.custom.screen.SoulFurnaceScreenHandler;

public class initScreenHandler {
    /*
    This class is used to register your Custom ScreenHandler for every custom Block Entity
    public static ScreenHandlerType<BLOCK ENTITY SCREEN HANDLER> SCREEN_HANDLER_NAME;
     */

    public static ScreenHandlerType<SoulFurnaceScreenHandler> SOUL_FURNACE_SCREEN_HANDLER;

    public static void init() {
        SOUL_FURNACE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(MoreTools.MOD_ID, "soul_furnace"), SoulFurnaceScreenHandler::new);

    }
}