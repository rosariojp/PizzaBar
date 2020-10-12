package com.jeipz.test.client;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.jeipz.test.pizza.PizzaTest;
import com.jeipz.test.pizza.crust.CrustTest;
import com.jeipz.test.pizza.topping.ToppingTest;

public class ApplicationTest {

	private static void resultReport(Result result) {
	    System.out.println(
	    	"Finished. Result: Failures: " +
	    	result.getFailureCount() + ". Ignored: " +
	    	result.getIgnoreCount() + ". Tests run: " +
	    	result.getRunCount() + ". Time: " +
	    	result.getRunTime() + "ms."
	    );
	}
	
	public static void main(String[] args) {
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		
		Result result = junit.run(
					CrustTest.class,
					ToppingTest.class,
					PizzaTest.class
				);
		
		resultReport(result);
	}
	
}
