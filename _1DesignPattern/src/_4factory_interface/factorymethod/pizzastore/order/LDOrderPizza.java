package _4factory_interface.factorymethod.pizzastore.order;

import _4factory_interface.factorymethod.pizzastore.pizza.LDCheesePizza;
import _4factory_interface.factorymethod.pizzastore.pizza.LDPepperPizza;
import _4factory_interface.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
