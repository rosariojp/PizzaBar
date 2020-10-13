package com.jeipz.test.domain.order;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jeipz.main.domain.customer.Customer;
import com.jeipz.main.domain.order.Order;
import com.jeipz.main.domain.pizza.Crust;
import com.jeipz.main.domain.pizza.Pizza;
import com.jeipz.main.domain.pizza.Topping;

public class OrderTest {

	@Test
	public void validateOrder() {
		Order.setCount(0);
		
		Customer customer1 = new Customer("Isagani Solis");
		Pizza pizza1 = new Pizza.Baker().setCrust(Crust.STUFFED).addTopping(Topping.MOZZARELLA).addTopping(Topping.MUSHROOMS).bake();
		Order order1 = new Order(customer1, pizza1);
		
		assertEquals("ID=1, Order=Stuffed Crust Pizza with Mozzarella and Mushrooms, Customer=Isagani Solis", order1.toString());
		
		Customer customer2 = new Customer("Benjie Castillo");
		Pizza pizza2 = new Pizza.Baker().setCrust(Crust.THIN).addTopping(Topping.PINEAPPLE).addTopping(Topping.HAM).bake();
		Order order2 = new Order(customer2, pizza2);
		
		assertEquals("ID=2, Order=Thin Crust Pizza with Pineapple and Ham, Customer=Benjie Castillo", order2.toString());
		
		Customer customer3 = new Customer("Victor Magtanggol");
		Pizza pizza3 = new Pizza.Baker().setCrust(Crust.REGULAR).addTopping(Topping.SALAMI).addTopping(Topping.OLIVES).addTopping(Topping.ONIONS).bake();
		Order order3 = new Order(customer3, pizza3);
		
		assertEquals(3, Order.getCount());
		assertEquals("Victor Magtanggol", order3.getCustomer().toString());
		assertEquals("Regular Crust Pizza with Salami, Olives and Onions", order3.getPizza().toString());
		
	}
	
}
