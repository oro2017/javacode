package com.shivinfotech.threads;

public class RaceConditionExample {
	public static void main(String[] args) {
		DummyService service = new DummyService();
		//create thread1, call a method to get count in run
		Thread clientThread1 = new Thread(new ClientThread(service));
		clientThread1.start();
		//create thread2, call a method to get count in run
		Thread clientThread2 = new Thread(new ClientThread(service));
		clientThread2.start();
	}
}
