package com.codegnan.multithreading;

public class PriorityExample {

	public static void main(String[] args) {
		//Runnable criticalThread=new PriorityWorker();
		Thread criticalThread=new Thread(new PriorityWorker("CRITICAL-Processor",Thread.MAX_PRIORITY));
		criticalThread.setPriority(Thread.MAX_PRIORITY);//10
		
		Thread reportThread=new Thread(new PriorityWorker("REPORT-Generator",Thread.NORM_PRIORITY));
		reportThread.setPriority(Thread.NORM_PRIORITY);//5
		
		Thread cleanupThread=new Thread(new PriorityWorker("CLEANUP-LOGGER",Thread.MIN_PRIORITY));
		cleanupThread.setPriority(Thread.MIN_PRIORITY);//1
		
		criticalThread.start();
		reportThread.start();
		cleanupThread.start();
		
		
		
	}

}
