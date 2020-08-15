package _23strategy.my;

/**
 * @author 孟享广
 * @date 2020-08-15 2:58 下午
 * @description
 */
public abstract class Duck {
    public Duck() {
    }

    public abstract void display();

    public void quack(){
        System.out.println("鸭子哈哈叫········");
    }

    public void swim(){
        System.out.println("鸭子会游泳·······");
    }

    public void fly() {
        System.out.println("鸭子会飞翔~~~");
}}
