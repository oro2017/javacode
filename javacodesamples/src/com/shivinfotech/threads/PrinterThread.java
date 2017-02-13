package com.shivinfotech.threads;

public class PrinterThread implements Runnable
{
	int delay;
	//note: its is static but its not global, its local to each thread
	private static ThreadLocal<Integer> l = new ThreadLocal<Integer>();
	
	PrinterThread(int delay) {
		this.delay = delay;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			l.set(i);
			System.out.println("From " + Thread.currentThread().getName()  + ": counter is " + l.get());
			try {
				Thread.sleep(delay);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
