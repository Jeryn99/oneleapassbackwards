package mc.craig.software.mixin;

import mc.craig.software.WeepingAngels;
import mc.craig.software.entity.WeepingAngel;
import net.minecraft.client.gui.screen.menu.MainMenuScreen;
import net.minecraft.entity.living.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class ExampleMixin {

    @Inject(at = @At("HEAD"), method = "tick()V")
    private void init(CallbackInfo info) {
        PlayerEntity player = (PlayerEntity) (Object) this;

       /* if(!player.level.isRemote) {
            WeepingAngel weepingAngel = new WeepingAngel(player.level);
            weepingAngel.setPosition(player.x, player.y, player.z);
            player.level.spawnEntity(weepingAngel);

            WeepingAngels.LOGGER.info("This line is printed by an example mod mixin!");
        }*/
    }
}
