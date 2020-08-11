package _9decorator.my;

/**
 * @author 孟享广
 * @date 2020-08-11 3:58 下午
 * @description
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDes() {
        return super.des + super.getDes() +
                " && " + drink.getDes();
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.getPrice();
    }
}
