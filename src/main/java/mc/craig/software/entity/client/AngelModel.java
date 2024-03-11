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

        head = new Cuboid(24, 29);
        head.addCuboid(-4, 24, -4, 8, 8, 8);
        head.setRotationPoint(0, 24, 0);
      //  head.addCuboid(-4, 24, -4, 8, 8, 8, 0.5F);
        setRotationAngle(head, 17, 0.0F, 0.0F);


       /* head = new Cuboid(24, 45);
        head.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(head, -0.3054F, 0.0F, 0.0F);
        head.addCuboid(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        head.addCuboid(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);

        torso = new Cuboid( 50, 0);
        torso.setRotationPoint(0.0F, 12.0F, 0.0F);
        torso.addCuboid(-4.0F, -12.0F, -2.0F, 8, 9, 4, 0.0F);

        wings = new Cuboid(0, 0);
        wings.setRotationPoint(0.0F, 12.0F, 0.0F);
        //torso.addChild(wings);

        cube_r1 = new Cuboid(0, 0);
        cube_r1.setRotationPoint(-2.0F, -21.0F, -2.0F);
      //  wings.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.6109F, 0.0F);
        cube_r1.addCuboid(0.0F, -9.0F, -12.0F, 0, 24, 12, 0.0F);

        cube_r2 = new Cuboid( 0, 0);
        cube_r2.setRotationPoint(2.0F, -21.0F, -2.0F);
     //   wings.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.6109F, 0.0F);
        cube_r2.addCuboid(0.0F, -9.0F, -12.0F, 0, 24, 12, 0.0F);

        leftarm = new Cuboid(56, 29);
        leftarm.setRotationPoint(4.0F, 2.0F, 0.0F);
        setRotationAngle(leftarm, 2.1468F, -0.1396F, -0.5061F);
        leftarm.addCuboid(0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);

        rightarm = new Cuboid(56, 13);
        rightarm.setRotationPoint(-4.0F, 2.0F, 0.0F);
        setRotationAngle(rightarm, 2.1468F, 0.1396F, 0.5061F);
        rightarm.addCuboid(-4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);

        legs = new Cuboid(0, 0);
        legs.setRotationPoint(0.0F, 12.0F, 0.0F);
        legs.addCuboid(-6.0F, 8.0F, -4.0F, 12, 4, 8, 0.0F);
        legs.addCuboid(-5.0F, -3.0F, -3.0F, 10, 11, 6, 0.0F);*/

    }



    @Override
    public void render(float f, float g, float h, float i, float j, float k) {
        super.render(f, g, h, i, j, k);
        head.render(k);
       /* torso.render(k);
        leftarm.render(k);
        rightarm.render(k);
        legs.render(k);*/
    }

    private void setRotationAngle(Cuboid model, float x, float y, float z) {
        model.roll = x;
        model.yaw = y;
        model.pitch = z;
    }
}
