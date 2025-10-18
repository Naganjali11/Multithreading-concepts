package com.codegnan.multithreading;

public class BackupWorker implements Runnable{
	public String workerName;
	public BackupWorker(String name) {
		this.workerName=workerName;
	}
	@Override
	public void run() {
		System.out.println(workerName+"starting work");
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(workerName+": processing file block"+i);
			
			if(i%2==0) {
				System.out.println(workerName+"yeilding contro....");
				Thread.yield();
			}
		}
	System.out.println(workerName+"finished its cycle");	
	}
	

}
