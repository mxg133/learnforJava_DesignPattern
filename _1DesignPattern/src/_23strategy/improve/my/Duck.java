package _23strategy.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-15 3:56 下午
 * @description
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    public abstract void display();//显示鸭子信息

    public Duck() {
    }

    public void quack() {
        System.out.println("鸭子嘎嘎叫~~");
    }

    public void swim() {
        System.out.println("鸭子会游泳~~");
    }

    public void fly(){
        if (flyBehavior != null){
            flyBehavior.fly();
        }
    }
}
