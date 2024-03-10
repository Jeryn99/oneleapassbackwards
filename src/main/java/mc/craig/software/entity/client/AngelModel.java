package mc.craig.software.entity.client;


import net.minecraft.client.model.Cuboid;
import net.minecraft.client.render.entity.model.BipedModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;

public class AngelModel extends EntityModel {
    private Cuboid head;
    private Cuboid torso;
    private Cuboid wings;
    private Cuboid cube_r1;
    private Cuboid cube_r2;
    private Cuboid leftarm;
    private Cuboid rightarm;
    private Cuboid legs;

    public AngelModel() {

        head = new Cuboid( 0, 0);
        head.addCuboid(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotation(head, -0.3054F, 0.0F, 0.0F);


        torso = new Cuboid( 50, 0);
        torso.addCuboid(-4F, -12F, -2F, 8, 9, 4);
        torso.setRotationPoint(0.0F, 12.0F, 0.0F);

        wings = new Cuboid( 0, 0);
        wings.setRotationPoint(0.0F, 12.0F, 0.0F);
       // torso.addChild(wings);

        cube_r1 = new Cuboid( 0, 0);
        cube_r1.addCuboid(0F, -9F, -12F, 0, 24, 12);
        cube_r1.setRotationPoint(-2.0F, -21.0F, -2.0F);
        setRotation(cube_r1, 0.0F, 0.6109F, 0.0F);
       // wings.addChild(cube_r1);

        cube_r2 = new Cuboid( 0, 0);
        cube_r2.addCuboid(0F, -9F, -12F, 0, 24, 12);
        cube_r2.setRotationPoint(2.0F, -21.0F, -2.0F);
        setRotation(cube_r2, 0.0F, -0.6109F, 0.0F);
     //   wings.addChild(cube_r2);

        leftarm = new Cuboid( 56, 29);
        leftarm.addCuboid(0F, -2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(4.0F, 2.0F, 0.0F);
        setRotation(leftarm, 2.1468F, -0.1396F, -0.5061F);

        rightarm = new Cuboid( 56, 13);
        rightarm.addCuboid(-4F, -2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(-4.0F, 2.0F, 0.0F);
        setRotation(rightarm, 2.1468F, 0.1396F, 0.5061F);

        legs = new Cuboid( 0, 0);
        legs.addCuboid(-6F, 8F, -4F, 12, 4, 8);
        legs.addCuboid(-5F, -3F, -3F, 10, 11, 6);
        legs.setRotationPoint(0.0F, 12.0F, 0.0F);


    }



    @Override
    public void render(float f, float g, float h, float i, float j, float k) {
        super.render(f, g, h, i, j, k);
        head.render(k);
        torso.render(k);
        leftarm.render(k);
        rightarm.render(k);
        legs.render(k);
    }

    private void setRotation(Cuboid model, float x, float y, float z) {
        model.roll = x;
        model.yaw = y;
        model.pitch = z;
    }
}
