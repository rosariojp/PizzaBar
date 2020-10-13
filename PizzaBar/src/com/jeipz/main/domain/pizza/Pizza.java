package com.jeipz.main.domain.pizza;

import java.util.LinkedHashSet;
import java.util.Set;

import com.jeipz.main.utils.Utility;

public class Pizza {

	private Crust crust;
	private Set<Topping> toppings;
	
	private Pizza(Baker baker) {
		this.crust = baker.crust;
		this.toppings = baker.toppings;
	}

	public static class Baker {
		private Crust crust;
		private Set<Topping> toppings;
		
		public Baker() {
			crust = Crust.REGULAR;
			toppings = new LinkedHashSet<Topping>();
		}
		
		/**
		 * Set the crust of the Pizza
		 * 
		 * @param crust such as {@code Crust.THIN, Crust.STUFFED}
		 * @return {@code instanceof Baker}
		 */
		public Baker setCrust(Crust crust) {
			this.crust = crust;
			return this;
		}
		
		/**
		 * Add topping of the Pizza
		 *  
		 * @param topping such as {@code Topping.HAM, Topping.ONIONS}
		 * @return {@code instanceof Baker}
		 */
		public Baker addTopping(Topping topping) {
			toppings.add(topping);
			return this;
		}
		
		/**
		 * Bake the Pizza
		 * @return {@code instanceof Pizza} with {@code Baker} properties
		 */
		public Pizza bake() {
			return new Pizza(this);
		}
	}
	
	public Crust getCrust() {
		return crust;
	}

	public Set<Topping> getToppings() {
		return toppings;
	}

	@Override
	public String toString() {
		String preparedPizza = crust + " Pizza";
		if (toppings.size() > 0) {
			preparedPizza += " with ";
		}
		preparedPizza += Utility.removeSetStringBrackets(toppings);
		preparedPizza = Utility.changeLastCommaToAnd(preparedPizza);
		return preparedPizza;
	}
	
}
