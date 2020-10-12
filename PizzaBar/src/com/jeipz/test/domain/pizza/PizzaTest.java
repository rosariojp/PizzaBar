package com.jeipz.test.domain.pizza;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jeipz.main.domain.pizza.Crust;
import com.jeipz.main.domain.pizza.Pizza;
import com.jeipz.main.domain.pizza.Topping;

public class PizzaTest {

	@Test
	public void bakePizzaRightAway() {
		Pizza pizza = new Pizza.Baker().bake();
		assertEquals(pizza.toString(), "Regular Crust Pizza");
	}
	
	@Test
	public void bakePizzaWithoutTopping() {
		Pizza pizza = new Pizza.Baker().setCrust(Crust.THIN).bake();
		assertEquals(pizza.toString(), "Thin Crust Pizza");
	}

	@Test
	public void bakePizzaWithOneTopping() {
		Pizza pizza = new Pizza.Baker().setCrust(Crust.STUFFED).addTopping(Topping.PINEAPPLE).bake();
		assertEquals(pizza.toString(), "Stuffed Crust Pizza with Pineapple");
	}

	@Test
	public void bakePizzaWithMoreThanOneTopping() {
		Pizza aPizza = new Pizza.Baker().setCrust(Crust.THIN).addTopping(Topping.BACON)
				.addTopping(Topping.MOZZARELLA).bake();
		assertEquals(aPizza.toString(), "Thin Crust Pizza with Bacon and Mozzarella");

		Pizza bPizza = new Pizza.Baker().setCrust(Crust.REGULAR).addTopping(Topping.HAM)
				.addTopping(Topping.BELLPEPPERS).addTopping(Topping.TOMATOES).addTopping(Topping.OLIVES).bake();
		assertEquals(bPizza.toString(), "Regular Crust Pizza with Ham, Bell Peppers, Tomatoes and Olives");
	}

	@Test
	public void multiplePizzaSetCrust( ) {
		Pizza pizza = new Pizza.Baker().setCrust(Crust.REGULAR).setCrust(Crust.STUFFED).bake();
		assertEquals(pizza.toString(), "Stuffed Crust Pizza");
	}
	
	@Test
	public void duplicatePizzaTopping( ) {
		Pizza pizza = new Pizza.Baker().setCrust(Crust.THIN).addTopping(Topping.HAM).addTopping(Topping.HAM).addTopping(Topping.TOMATOES).bake();
		assertEquals(pizza.toString(), "Thin Crust Pizza with Ham and Tomatoes");
	}
	
}
