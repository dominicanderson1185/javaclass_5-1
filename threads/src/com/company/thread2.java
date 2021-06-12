package com.company;

public class thread2 extends thread {
	public void run() {
setPriority(7);
		System.out.println("Starting thread2 count 50");

		for (int x = 0; x < 50; x++) {
			System.out.println(x);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}}