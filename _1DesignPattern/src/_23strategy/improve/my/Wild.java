package _23strategy.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-15 4:00 下午
 * @description
 */
public class Wild extends Duck {

    public Wild() {
        GoodFlyBehavior goodFlyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("野鸭子");
    }
}
