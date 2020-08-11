package _9decorator.my;

/**
 * @author 孟享广
 * @date 2020-08-11 4:09 下午
 * @description
 */
public class Soy extends Decorator {

    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(1.5f);

    }

}
