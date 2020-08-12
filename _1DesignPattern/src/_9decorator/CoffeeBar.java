package _9decorator;

public class CoffeeBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack

		// 1. 点一份 LongBlack
		Drink drink = new LongBlack();
		System.out.println("费用1=" + drink.cost());
		System.out.println("描述=" + drink.getDes());

		// 2. drink 加入一份牛奶
		drink = new Milk(drink);

		System.out.println("drink 加入一份牛奶 费用 =" + drink.cost());
		System.out.println("drink 加入一份牛奶 描述 = " + drink.getDes());

		// 3. drink 加入一份巧克力

		drink = new Chocolate(drink);

		System.out.println("drink 加入一份牛奶 加入一份巧克力  费用 =" + drink.cost());
		System.out.println("drink 加入一份牛奶 加入一份巧克力 描述 = " + drink.getDes());

		// 3. drink 加入一份巧克力

		drink = new Chocolate(drink);

		System.out.println("drink 加入一份牛奶 加入2份巧克力   费用 =" + drink.cost());
		System.out.println("drink 加入一份牛奶 加入2份巧克力 描述 = " + drink.getDes());

		System.out.println("===========================");

		Drink order2 = new DeCaf();

		System.out.println("order2 无因咖啡  费用 =" + order2.cost());
		System.out.println("order2 无因咖啡 描述 = " + order2.getDes());

		order2 = new Milk(order2);

		System.out.println("order2 无因咖啡 加入一份牛奶  费用 =" + order2.cost());
		System.out.println("order2 无因咖啡 加入一份牛奶 描述 = " + order2.getDes());


	}

}