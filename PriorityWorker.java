package com.codegnan.multithreading;

public class PriorityWorker implements Runnable {
	String name;
	int priority;
	public PriorityWorker(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}
	@Override
	public void run() {
		System.out.println(name+"starting with priority"+priority);
		for(int i=0;i<5;i++) {
			System.out.println(name+": Working, Step"+i);
		}
		System.out.println(name+"finished");
		}
	

}
