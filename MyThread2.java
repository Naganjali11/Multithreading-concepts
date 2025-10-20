package com.codegnan.multithreading;

public class MyThread2 implements Runnable{
	A a;
	public MyThread2(A a) {
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
