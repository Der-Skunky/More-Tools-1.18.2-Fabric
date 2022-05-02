package net.skunky.moretools.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import net.skunky.moretools.custom.screen.initScreenHandler;
import net.skunky.moretools.init.initBlocks;

@Environment(EnvType.CLIENT)
public class MoreToolsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(initBlocks.CRYSTAL_TABLE, RenderLayer.getCutout());

        //ScreenRegistry.register(initScreenHandler.CRYSTAL_TABLE_SCREEN_HANDLER, CrystalTableScreen::new);
    }
}
