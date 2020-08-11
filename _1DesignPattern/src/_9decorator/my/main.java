package _9decorator.my;

/**
 * @author 孟享广
 * @date 2020-08-11 4:10 下午
 * @description
 */
public class main {
    public static void main(String[] args) {
        Drink drink =  new LongBlack();
        System.out.println(drink.cost());
        System.out.println(drink.getDes());

        drink = new Milk(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDes());

        drink =  new Chocolate(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDes());

        drink =  new Chocolate(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDes());


    }
}
