package com.codegnan.multithreading;

public class ThreadRunnableDemo {

	public static void main(String[] args) {
		Runnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.run();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
