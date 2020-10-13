package com.jeipz.test.domain.worker;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import com.jeipz.main.domain.customer.Customer;
import com.jeipz.main.domain.order.Order;
import com.jeipz.main.domain.pizza.Crust;
import com.jeipz.main.domain.pizza.Pizza;
import com.jeipz.main.domain.pizza.Topping;
import com.jeipz.main.domain.worker.Worker;

public class WorkerTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog().mute();
	
	@Test
	public void valiteWork() {
		Order.setCount(0);
		
		Customer customer = new Customer("Juan Dela Cruz");
		Pizza pizza = new Pizza.Baker().setCrust(Crust.THIN).addTopping(Topping.MOZZARELLA).addTopping(Topping.PINEAPPLE).bake();
		Order order = new Order(customer, pizza);
		Worker worker = new Worker();
		
		worker.takeOrder(order);
		
		try {
			worker.workOnTheOrder();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		assertTrue(systemOutRule.getLog().contains("[RECEIVED] ID=1, Order=Thin Crust Pizza with Mozzarella and Pineapple, Customer=Juan Dela Cruz"));
		assertTrue(systemOutRule.getLog().contains("ID=1, Preparing -> Thin Crust"));
		assertTrue(systemOutRule.getLog().contains("ID=1, Putting toppings -> Mozzarella, Pineapple"));
		assertTrue(systemOutRule.getLog().contains("ID=1, Baking -> Thin Crust Pizza with Mozzarella and Pineapple"));
		assertTrue(systemOutRule.getLog().contains("[DONE] Hand over Thin Crust Pizza with Mozzarella and Pineapple order to Juan Dela Cruz"));
	}
	
}
