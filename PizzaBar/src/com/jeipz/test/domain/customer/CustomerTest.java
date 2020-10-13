package com.jeipz.test.domain.customer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jeipz.main.domain.customer.Customer;

public class CustomerTest {

	@Test
	public void validateCustomer() {
		Customer customer = new Customer("Juan Dela Cruz");
		assertEquals(customer.toString(), "Juan Dela Cruz");
	}
	
	@Test
	public void changeCustomerName() {
		Customer customer = new Customer("Juan Dela Cruz");
		assertEquals(customer.getName(), "Juan Dela Cruz");
		
		customer.setName("Pedro Penduko");
		assertEquals(customer.getName(), "Pedro Penduko");
	}
	
}

