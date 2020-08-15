package _23strategy.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-15 3:56 下午
 * @description
 */
public class NoFlyBehavior implements  FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 不能飞 ");
    }
}
