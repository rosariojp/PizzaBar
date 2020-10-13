package com.jeipz.main.domain.order;

import com.jeipz.main.domain.customer.Customer;
import com.jeipz.main.domain.pizza.Pizza;

public class Order {

	private static int count = 0;
	
	private int id = 0;
	private Customer customer;
	private Pizza pizza;
	
	public Order(Customer customer, Pizza pizza) {
		this.id = ++count;
		this.customer = customer;
		this.pizza = pizza;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public int getId() {
		return id;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void setCount(int newValue) {
		count = newValue;
	}
	
	@Override
	public String toString() {
		return "ID=" + id + ", Order=" + pizza + ", Customer=" + customer;
	}

}
