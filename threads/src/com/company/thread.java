package com.company;

public class thread extends Thread{
	public void run(){
setPriority(6);
		System.out.println("Starting thread count 1");

		for( int x = 50; x>0 ;x--){
			System.out.println(x);
			try{
				Thread.sleep(2000);
			} catch ( Exception e){
			e.printStackTrace();
			}

		}
	}
}
