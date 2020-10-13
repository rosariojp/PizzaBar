package com.jeipz.main.domain.worker;

import com.jeipz.main.domain.order.Order;
import com.jeipz.main.utils.Utility;

public class Worker {

	private Order order;
	
	public void takeOrder(Order order) {
		this.order = order;
		System.out.println("[RECEIVED] " + order);
	}

	public void workOnTheOrder() throws InterruptedException {
		prepareCrust();
		putToppings();
		bakePizza();
		handOverPizza();
	}

	private void prepareCrust() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("ID=" + order.getId() + ", Preparing -> " + order.getPizza().getCrust());
	}
	
	private void putToppings() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("ID=" + order.getId() + ", Putting toppings -> " + Utility.removeSetStringBrackets(order.getPizza().getToppings()));
	}
	
	private void bakePizza() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("ID=" + order.getId() + ", Baking -> " + order.getPizza());
	}
	
	private void handOverPizza() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("[DONE] Hand over " + order.getPizza() + " order to " + order.getCustomer().getName());
	}
}
