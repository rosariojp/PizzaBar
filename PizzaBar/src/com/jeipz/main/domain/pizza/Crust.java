package com.jeipz.main.domain.pizza;

public enum Crust {
	
	REGULAR("Regular Crust"),
	THIN("Thin Crust"),
	STUFFED("Stuffed Crust");

	private String crust;

	private Crust(String crust) {
		this.crust = crust;
	}

	/**
	 * Returns crust value in {@code String} format
	 * 
	 * @return crust in {@code String} format
	 */
	@Override
	public String toString() {
		return crust;
	}

}
