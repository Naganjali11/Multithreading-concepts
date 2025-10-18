package com.codegnan.multithreading;

public class YieldDemo {

	public static void main(String[] args) {
		BackupWorker backupTask1=new BackupWorker("Backup-Worker-A");
		Thread t=new Thread(backupTask1);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Hi");
		}

	}

}
