package com.jeipz.test.utils;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import com.jeipz.main.domain.pizza.Topping;
import com.jeipz.main.utils.Utility;

public class UtilityTest {

	@Test
	public void validateCommaFormatting() {
		assertEquals(Utility.changeLastCommaToAnd("text without comma"), "text without comma");
		assertEquals(Utility.changeLastCommaToAnd("Bacon, Olives"), "Bacon and Olives");
		assertEquals(Utility.changeLastCommaToAnd("Ham, Cheese, Bell Peppers, Pineapple"), "Ham, Cheese, Bell Peppers and Pineapple");
	}
	
	@Test
	public void validateBracketFormatting() {
		Set<Topping> toppings = new LinkedHashSet<Topping>();
		assertEquals(Utility.removeSetStringBrackets(toppings), "");
		
		toppings.add(Topping.MOZZARELLA);
		assertEquals(Utility.removeSetStringBrackets(toppings), "Mozzarella");
		
		toppings.add(Topping.MUSHROOMS);
		toppings.add(Topping.SPINACH);
		toppings.add(Topping.SALAMI);
		assertEquals(Utility.removeSetStringBrackets(toppings), "Mozzarella, Mushrooms, Spinach, Salami");
	}
	
}
