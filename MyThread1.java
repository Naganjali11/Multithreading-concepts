package com.codegnan.multithreading;

public class MyThread1 implements Runnable {
	A a;
	public MyThread1(A a) {
		this.a=a;
		
	}
	@Override
	public void run() {
		try {
			a.meth();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
