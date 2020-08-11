package _9decorator.my;

/**
 * @author 孟享广
 * @date 2020-08-11 4:08 下午
 * @description
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
