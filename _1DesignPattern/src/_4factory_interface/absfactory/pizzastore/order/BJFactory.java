package _4factory_interface.absfactory.pizzastore.order;

import _4factory_interface.absfactory.pizzastore.pizza.BJCheesePizza;
import _4factory_interface.absfactory.pizzastore.pizza.BJPepperPizza;
import _4factory_interface.absfactory.pizzastore.pizza.Pizza;

//这是工厂子类
public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}