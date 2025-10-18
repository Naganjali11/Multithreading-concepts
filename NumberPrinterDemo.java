package com.codegnan.multithreading;

public class NumberPrinterDemo {

	public static void main(String[] args) {
		NumberPrinter thread1=new NumberPrinter("Counter-A",1,5);
		NumberPrinter thread2=new NumberPrinter("Counter-B",10,15);
		NumberPrinter thread3=new NumberPrinter("Counter-C",100,105);
		System.err.println("Thread Information before Starting");
		thread1.printThreadInfo();
		thread2.printThreadInfo();
		thread3.printThreadInfo();
		
		System.out.println("Starting All Threads");
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
