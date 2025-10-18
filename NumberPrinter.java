package com.codegnan.multithreading;

public class NumberPrinter extends Thread {
	String threadName;
	int startNumber;
	int endNumber;
	public NumberPrinter(String threadName, int startNumber, int endNumber) {
		super();
		this.threadName = threadName;
		this.startNumber = startNumber;
		this.endNumber = endNumber;
		this.setName(threadName);//set the thread name
	}
	public void run() {
		System.out.println(threadName+"started printing numbers");
		for(int i=startNumber;i<=endNumber;i++) {
			System.out.println(threadName+":"+i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(threadName+"was interrupted");
				return;//exit the thread gracefully
			}
		}
		System.out.println(threadName+"finished printing number");
	}
	public void printThreadInfo() {
		System.out.println("ThreadName:"+getName());
		System.out.println("ThreadState:"+getState());
		System.out.println("ThreadPriority:"+getPriority());
		System.out.println("Is Alive:"+isAlive());
	}

}
