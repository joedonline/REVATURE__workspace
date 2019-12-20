package com.revature.threadsdemo;

public class Driver {

	public static void main(String[] args) {
		
		manyThreadsDemo();
		
		singleComputeDemo();		
		
	}
	
	private static void singleComputeDemo() {
		ComutingObject computingObject = new ComutingObject();
		ComputingRunnalbe computingRunnabe = new ComputingRunnalbe(computingObject);
		Thread thread = new Thread(computingRunnabe);
		
		thread.start();
		
		ComputingRunnalbe secondComputingRunnable = new ComputingRunnalbe(computingObject);
		Thread secondThread = new Thread(secondComputingRunnable);
		
		secondThread.start();
		
		
		//do other things here
		oneThreadDemo();
		
		//wait for thread to complete
		try {
			thread.join();
			secondThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("my value is: " + computingObject.getMyValue());
	}
	
	private static void manyThreadsDemo() {
		for (int i=0; i<100; i++) {
			MyPrintingRunnable mpr = new MyPrintingRunnable("Thread " + i);
			Thread thread = new Thread(mpr);
			thread.start();
		}
	}
	
	private static void oneThreadDemo() {
		MyPrintingRunnable myPrintingRunnable = new MyPrintingRunnable("Thread1");
		Thread myThread = new Thread(myPrintingRunnable);
		
		myThread.start();
		
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		for (int i = 0; i < 100; i++) {
			System.out.println("main(), step: " + i);
		}
	}

}
