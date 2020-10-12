package com.jeipz.test.domain.pizza;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jeipz.main.domain.pizza.Crust;

public class CrustTest {

	@Test
	public void validateCrusts() {
		assertEquals(Crust.REGULAR.toString(), "Regular Crust");
		assertEquals(Crust.STUFFED.toString(), "Stuffed Crust");
		assertEquals(Crust.THIN.toString(), "Thin Crust");
	}
	
}
