package _1principle._1singleresponsibility.my;

/**
 * @author 孟享广
 * @date 2020-08-06 11:49 上午
 * @description
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托好");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

    }

}


class RoadVehicle{
    public void run(String v){
        System.out.println(v+"公路run");
    }
}
class AirVehicle{
    public void run(String v){
        System.out.println(v+"sky run");
    }
}
class WaterVehicle{
    public void run(String v){
        System.out.println(v+"水 run");
    }
}