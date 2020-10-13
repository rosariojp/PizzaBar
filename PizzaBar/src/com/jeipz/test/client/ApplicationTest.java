package com.jeipz.test.client;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.jeipz.test.domain.customer.CustomerTest;
import com.jeipz.test.domain.order.OrderTest;
import com.jeipz.test.domain.pizza.CrustTest;
import com.jeipz.test.domain.pizza.PizzaTest;
import com.jeipz.test.domain.pizza.ToppingTest;
import com.jeipz.test.domain.worker.WorkerTest;
import com.jeipz.test.utils.UtilityTest;

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
		
		System.out.println("TEST Running");
		
		Result result = junit.run(
					CrustTest.class,
					ToppingTest.class,
					PizzaTest.class,
					UtilityTest.class,
					CustomerTest.class,
					OrderTest.class,
					WorkerTest.class
				);
		
		resultReport(result);
	}
	
}
