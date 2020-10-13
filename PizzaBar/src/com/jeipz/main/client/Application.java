package com.jeipz.main.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.jeipz.main.domain.customer.Customer;
import com.jeipz.main.domain.order.Order;
import com.jeipz.main.domain.order.OrderProcessor;
import com.jeipz.main.domain.pizza.Crust;
import com.jeipz.main.domain.pizza.Pizza;
import com.jeipz.main.domain.pizza.Topping;

public class Application {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("**** PIZZA BAR is OPEN ****");
		System.out.println("Ready to take orders.");
		Thread.sleep(1000);
		
		Map<Customer, Pizza> orders = new ConcurrentHashMap<Customer, Pizza>();
		
		orders.put(new Customer("Juan Dela Cruz"), new Pizza.Baker().setCrust(Crust.THIN).addTopping(Topping.MOZZARELLA).addTopping(Topping.PINEAPPLE).bake());
		orders.put(new Customer("Eddy Dayag"), new Pizza.Baker().setCrust(Crust.REGULAR).addTopping(Topping.BELLPEPPERS).addTopping(Topping.OLIVES).addTopping(Topping.TOMATOES).bake());
		orders.put(new Customer("Casey Trinidad"), new Pizza.Baker().setCrust(Crust.STUFFED).addTopping(Topping.MOZZARELLA).addTopping(Topping.PINEAPPLE).bake());
		orders.put(new Customer("Richard Guevarra"), new Pizza.Baker().setCrust(Crust.THIN).addTopping(Topping.BACON).addTopping(Topping.SALAMI).addTopping(Topping.HAM).bake());
		orders.put(new Customer("Katrina Gatdula"), new Pizza.Baker().setCrust(Crust.STUFFED).addTopping(Topping.ONIONS).addTopping(Topping.MUSHROOMS).addTopping(Topping.SPINACH).bake());
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for (Map.Entry<Customer, Pizza> entry : orders.entrySet()) {
			Order order = new Order(entry.getKey(), entry.getValue());
			executor.execute(new OrderProcessor(order));
		}
		
		executor.shutdown();
		
		try {
			if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
				System.out.println("Timeout occurred! Shutting down all running thread(s).");
				executor.shutdownNow();
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Handed over " + Order.getCount() + " orders today.");
		System.out.println("**** PIZZA BAR is CLOSED ****");
		
	}
	
}
