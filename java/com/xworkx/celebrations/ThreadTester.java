package com.xworkx.celebrations;

import com.sun.xml.internal.ws.wsdl.parser.RuntimeWSDLParser;

public class ThreadTester {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("runnable");

			}
		};
		myThread myThread = new myThread();
		

		Thread thread = new Thread(runnable);
		thread.setDaemon(true);
		myThread.start();
		try {
			for (int i = 0; i < 4; i++) {
				thread.sleep(4000);
				myThread.sleep(4000);
				System.out.println("thread");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.start();
		
		System.out.println(thread.isDaemon());
		
		

		

	}

}
