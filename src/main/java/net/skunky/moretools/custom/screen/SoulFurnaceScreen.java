package net.skunky.moretools.custom.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.Identifier;
import net.skunky.moretools.MoreTools;
import net.minecraft.text.Text;
import net.skunky.moretools.init.initCraftingCosts;


public class SoulFurnaceScreen extends HandledScreen<SoulFurnaceScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(MoreTools.MOD_ID, "textures/gui/soul_furnace.png");

    int x;
    int y;

    int souls;
    int maxSouls;

    public SoulFurnaceScreen(SoulFurnaceScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleX = backgroundWidth - textRenderer.getWidth(title) - 5;

    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        this.x = (width - backgroundWidth) /2;
        this.y  = (height - backgroundHeight) /2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);

        if (handler.isCrafting()) {
            drawTexture(matrices, x + 120, y + 26, 176, 0, handler.getScaledProgress(25), 37);
        }

        if (handler.hasFuel()) {
            drawTexture(matrices, x + 17, y + 44 - handler.getScaledFuelProgress(16), 176,
                    54 -handler.getScaledFuelProgress(16), 15, handler.getScaledFuelProgress(16));
        }

        if (handler.hasSouls()) {
            drawTexture(matrices, x + 54, y + 69 -handler.getScaledSoulProgress(49), 202,
                    49 - handler.getScaledSoulProgress(49), 16, handler.getScaledSoulProgress(49));
        }


        if (handler.isCrafting()) {
            drawTexture(matrices, x + 151, y + 54, 185, 56, 8, 7); // recipe accepted
            renderTip(matrices, "Recipe accepted", mouseX, mouseY);
        } else {
            drawTexture(matrices, x + 151, y + 54, 176, 56, 8, 7); // something is missing
            renderTip(matrices, "Something is missing", mouseX, mouseY);
        }


        this.souls = handler.getSouls();
        this.maxSouls = handler.getMaxSouls();
    }

    private void renderTip(MatrixStack matrices, String text, int mouseX, int mouseY) {
        if (mouseX >= x + 151 && mouseX <= x + 158) {
            if (mouseY >= y + 54 && mouseY <= y + 60) {
                renderTooltip(matrices, Text.of(text), mouseX, mouseY);
            }
        }
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);

        if (mouseX >= x + 53 && mouseX <= x + 70) {
            if (mouseY >= y + 19 && mouseY <= y + 69) {
                renderTooltip(matrices, Text.of(souls + " / " + maxSouls), mouseX, mouseY);
            }
        }
    }
}
