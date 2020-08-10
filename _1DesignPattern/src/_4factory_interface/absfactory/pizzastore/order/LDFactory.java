package _4factory_interface.absfactory.pizzastore.order;


import _4factory_interface.absfactory.pizzastore.pizza.LDCheesePizza;
import _4factory_interface.absfactory.pizzastore.pizza.LDPepperPizza;
import _4factory_interface.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}