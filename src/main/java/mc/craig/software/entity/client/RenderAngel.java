package mc.craig.software.entity.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.CreeperModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;

public class RenderAngel extends LivingEntityRenderer {

    public static EntityModel model = new AngelModel();

    public RenderAngel() {
        super(model, 0.5F);

    }
    public RenderAngel(EntityModel arg, float f) {
        super(arg, f);
    }



}
