package principle.singleresponsibility.my;

/**
 * @author 孟享广
 * @date 2020-08-06 11:55 上午
 * @description
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("c船");

    }
}
class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行！");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle + "在sky上运行！");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + "在shui上运行！");
    }
}