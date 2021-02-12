package com.xworkx.celebrations;

public class myThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			
		System.out.println("my thread");
		}
		super.run();
	}

}
