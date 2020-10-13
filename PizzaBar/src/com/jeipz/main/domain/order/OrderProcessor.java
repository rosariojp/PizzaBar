package com.jeipz.main.domain.order;

import com.jeipz.main.domain.worker.Worker;

public class OrderProcessor implements Runnable {

	private Order order;
	
	public OrderProcessor(Order order) {
		this.order = order;
	}

	@Override
	public void run() {
		Worker worker = new Worker();
		worker.takeOrder(order);
		try {
			worker.workOnTheOrder();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			System.out.println("Unable to work on the order.");
		}
	}
	
}
