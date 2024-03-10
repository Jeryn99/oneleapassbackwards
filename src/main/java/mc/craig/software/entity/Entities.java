package mc.craig.software.entity;

import mc.craig.software.WeepingAngels;
import mc.craig.software.entity.client.RenderAngel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.BipedModel;
import net.minecraft.entity.EntityRegistry;
import net.minecraft.entity.living.LivingEntity;

public class Entities {

    public static void init(){
        EntityRegistry.register(WeepingAngel.class, WeepingAngels.MODID, 66);
    }
}
