package com.sujata.training;

public class Account implements Runnable {

	private static int balance = 1000;

	@Override
	public void run() {

		//class Level Lock
//		synchronized (Account.class) {
	//object Level Locking
		synchronized (this) {
	
			if (balance >= 800) {
				System.out.println(Thread.currentThread().getName()
						+ " you have sufficient balance to withdraw and your balance is Rs. " + balance);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance -= 800;
				System.out
						.println(Thread.currentThread().getName() + " your balance after withdrawl is Rs. " + balance);
			} else {
				System.out.println(Thread.currentThread().getName()
						+ " you don't have sufficient balance to withdraw and your balance is Rs. " + balance);
			}
		}
	}

}
