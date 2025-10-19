package com.codegnan.multithreading;

public class Main {

	public static void main(String[] args) {
		A a=new A();
		MyThread1 t1=new MyThread1(a);
		MyThread2 t2=new MyThread2(a);
		MyThread3 t3=new MyThread3(a);
		Thread th1=new Thread(t1,"Thread1");
		Thread th2=new Thread(t2,"Thread2");
		Thread th3=new Thread(t3,"Thread3");
		th1.start();
		th2.start();
		th3.start();
		
		
	}

}
