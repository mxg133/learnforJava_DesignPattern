package _9decorator.my;

/**
 * @author 孟享广
 * @date 2020-08-11 4:06 下午
 * @description
 */
public class Chocolate extends Decorator {



    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.0f);

    }




}
