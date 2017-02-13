package com.shivinfotech.threads;

public class ThreadLocalExample {

	public static void main(String[] args) {
		// create thread1 with threadlocal
		final Thread thread1 = new Thread(new PrinterThread(200));
		thread1.start();
		// create thread2 with threadlocal
		final Thread thread2 = new Thread(new PrinterThread(400));
		thread2.start();
	}
	
}
