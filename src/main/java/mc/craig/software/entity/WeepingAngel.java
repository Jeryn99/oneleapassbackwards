package mc.craig.software.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.living.LivingEntity;
import net.minecraft.entity.living.MobEntity;
import net.minecraft.entity.living.monster.MonsterEntity;
import net.minecraft.level.Level;
import org.lwjgl.Sys;

public class WeepingAngel extends MonsterEntity {

    public WeepingAngel(Level level) {
        super(level);
        immuneToFire = true;
        this.movementSpeed = 0.5F;
        this.attackDamage = 5;
        this.texture = "/mob/weeping_angel.png";

    }



    @Override
    protected String getDeathSound() {
        return Block.STONE_SOUNDS.getBreakSound();
    }

    @Override
    public void baseTick() {
        movementSpeed = 0;
        super.baseTick();
    }

    @Override
    protected int getMobDrops() {
        return 4;
    }
}
