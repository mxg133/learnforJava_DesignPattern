package singleresponsibility.principle.my;

/**
 * @author 孟享广
 * @date 2020-08-06 11:27 上午
 * @description
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托🏍️");
        vehicle.run("汽车🚗");
        vehicle.run("飞机✈️");

    }
}

class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行！");
    }
}