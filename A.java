package com.codegnan.multithreading;

public class A {
	public synchronized void meth() throws InterruptedException {
		for(int i=0;i<5;i++) {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());
			}
	}

}
