package mc.craig.software.entity.client;

import mc.craig.software.OBJLoader;
import mc.craig.software.Obj;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.CreeperModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

import java.io.File;
import java.io.FileNotFoundException;

public class RenderAngel extends LivingEntityRenderer {

    public static EntityModel model = new AngelModel();
    private static OBJLoader objLoader = new OBJLoader();
    private final Obj objModel;

    public RenderAngel() {
        super(model, 0.5F);
        try {
            objModel = objLoader.loadModel(new File("model.obj"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public RenderAngel(EntityModel arg, float f, Obj objModel) {
        super(arg, f);
        this.objModel = objModel;
    }

    @Override
    public void render(Entity entity, double x, double y, double z, float yaw, float pitch) {
        GL11.glPushMatrix();

        double interpolatedX = ((entity.prevRenderX + (entity.x - entity.prevRenderX) * 1) - BlockEntityRenderDispatcher.renderOffsetX);
        double interpolatedY = ((entity.prevRenderY + (entity.y - entity.prevRenderY) * 1) - BlockEntityRenderDispatcher.renderOffsetY);
        double interpolatedZ = ((entity.prevRenderZ + (entity.z - entity.prevRenderZ) * 1) - BlockEntityRenderDispatcher.renderOffsetZ);

        GL11.glShadeModel(GL11.GL_SMOOTH);

        this.tryBindTexture(entity.skinUrl, entity.getTextured());

        GL11.glTranslated(interpolatedX, interpolatedY, interpolatedZ);
        GL11.glRotatef(entity.yaw, 0, 1, 0);

        int scale = 1;
        GL11.glScaled(scale, scale, scale);

        objLoader.render(objModel);

        GL11.glPopMatrix();
    }
}
