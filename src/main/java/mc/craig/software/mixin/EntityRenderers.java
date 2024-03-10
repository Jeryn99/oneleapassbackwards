package mc.craig.software.mixin;

import mc.craig.software.entity.WeepingAngel;
import mc.craig.software.entity.client.RenderAngel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderDispatcher.class)
public class EntityRenderers {

    @Inject(at = @At("TAIL"), method = "<init>()V")
    private void init(CallbackInfo info) {
        EntityRenderDispatcher entityRenderDispatcher = (EntityRenderDispatcher) (Object) this;
        entityRenderDispatcher.renderers.put(WeepingAngel.class, new RenderAngel());

        for (Object entityRenderer : entityRenderDispatcher.renderers.values()) {
            if(entityRenderer instanceof EntityRenderer) {
                EntityRenderer dispatch = (EntityRenderer) entityRenderer;
                dispatch.setDispatcher(entityRenderDispatcher);
            }
        }
    }

}
