package com.jeipz.test.domain.pizza;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jeipz.main.domain.pizza.Topping;

public class ToppingTest {

	@Test
	public void validateToppings() {
		assertEquals(Topping.MOZZARELLA.toString(), "Mozzarella");
		assertEquals(Topping.OLIVES.toString(), "Olives");
		assertEquals(Topping.MUSHROOMS.toString(), "Mushrooms");
		assertEquals(Topping.TOMATOES.toString(), "Tomatoes");
		assertEquals(Topping.SALAMI.toString(), "Salami");
		assertEquals(Topping.ONIONS.toString(), "Onions");
		assertEquals(Topping.SPINACH.toString(), "Spinach");
		assertEquals(Topping.BELLPEPPERS.toString(), "Bell Peppers");
		assertEquals(Topping.BACON.toString(), "Bacon");
		assertEquals(Topping.HAM.toString(), "Ham");
		assertEquals(Topping.PINEAPPLE.toString(), "Pineapple");
	}
	
}
