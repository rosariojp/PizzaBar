package com.jeipz.main.pizza.topping;

public enum Topping {
	
	MOZZARELLA("Mozzarella"),
	OLIVES("Olives"),
	MUSHROOMS("Mushrooms"),
	TOMATOES("Tomatoes"),
	SALAMI("Salami"),
	ONIONS("Onions"),
	SPINACH("Spinach"),
	BELLPEPPERS("Bell Peppers"),
	BACON("Bacon"),
	HAM("Ham"),
	PINEAPPLE("Pineapple");
	
	private String topping;
	
	private Topping(String topping) {
		this.topping = topping;
	}
	
	/**
	 * Returns topping value in {@code String} format
	 * 
	 * @return topping in {@code String} format
	 */
	@Override
	public String toString() {
		return topping;
	}

}
