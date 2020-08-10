package _4factory_interface.factorymethod.pizzastore.order;

import _4factory_interface.factorymethod.pizzastore.pizza.BJCheesePizza;
import _4factory_interface.factorymethod.pizzastore.pizza.BJPepperPizza;
import _4factory_interface.factorymethod.pizzastore.pizza.Pizza;


public class BJOrderPizza extends OrderPizza {


	@Override
	Pizza createPizza(String orderType) {

		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
