package com.revature.threadsdemo;

public class ComputingRunnalbe implements Runnable {
	
	ComutingObject myComputingObject = new ComutingObject();
	
	public ComputingRunnalbe(ComutingObject objectToCompute) {
		this.myComputingObject = objectToCompute;
	}
	
	@Override
	public void run() {
		this.myComputingObject.expensiveCompute();
	}
	
}
