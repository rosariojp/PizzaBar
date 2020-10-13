package com.jeipz.test.domain.order;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import com.jeipz.main.domain.customer.Customer;
import com.jeipz.main.domain.order.Order;
import com.jeipz.main.domain.order.OrderProcessor;
import com.jeipz.main.domain.pizza.Crust;
import com.jeipz.main.domain.pizza.Pizza;
import com.jeipz.main.domain.pizza.Topping;

public class OrderProcessorTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog().mute();
	
	@Test
	public void testRun() {
		Order.setCount(0);
		
		Customer customer = new Customer("Eddy Dayag");
		Pizza pizza = new Pizza.Baker().setCrust(Crust.REGULAR).addTopping(Topping.BELLPEPPERS).addTopping(Topping.OLIVES).addTopping(Topping.TOMATOES).bake();
		Order order = new Order(customer, pizza);

		Thread t1 = new Thread(new OrderProcessor(order));
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		assertTrue(systemOutRule.getLog().contains("[RECEIVED] ID=1, Order=Regular Crust Pizza with Bell Peppers, Olives and Tomatoes, Customer=Eddy Dayag"));
		assertTrue(systemOutRule.getLog().contains("ID=1, Preparing -> Regular Crust"));
		assertTrue(systemOutRule.getLog().contains("ID=1, Putting toppings -> Bell Peppers, Olives, Tomatoes"));
		assertTrue(systemOutRule.getLog().contains("ID=1, Baking -> Regular Crust Pizza with Bell Peppers, Olives and Tomatoes"));
		assertTrue(systemOutRule.getLog().contains("[DONE] Hand over Regular Crust Pizza with Bell Peppers, Olives and Tomatoes order to Eddy Dayag"));
		
	}
	
}
