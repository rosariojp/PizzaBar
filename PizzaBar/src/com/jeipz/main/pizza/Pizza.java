package com.jeipz.main.pizza;

import java.util.ArrayList;
import java.util.List;

import com.jeipz.main.pizza.crust.Crust;
import com.jeipz.main.pizza.topping.Topping;
import com.jeipz.main.utils.Utility;

public class Pizza {

	private Crust crust;
	private List<Topping> toppings;
	
	private Pizza(Baker baker) {
		this.crust = baker.crust;
		this.toppings = baker.toppings;
	}

	public static class Baker {
		private Crust crust;
		private List<Topping> toppings;
		
		public Baker() {
			crust = Crust.REGULAR;
			toppings = new ArrayList<Topping>();
		}
		
		public Baker setCrust(Crust crust) {
			this.crust = crust;
			return this;
		}
		
		public Baker addTopping(Topping topping) {
			toppings.add(topping);
			return this;
		}
		
		public Pizza bake() {
			return new Pizza(this);
		}
	}
	
	@Override
	public String toString() {
		String preparedPizza = crust + " Pizza";
		if (toppings.size() > 0) {
			preparedPizza += " with ";
		}

		preparedPizza += Utility.removeListStringBrackets(toppings);
		preparedPizza = Utility.changeLastCommaToAnd(preparedPizza);
		return preparedPizza;
	}
	
}