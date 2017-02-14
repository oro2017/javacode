package com.shivinfotech.threads;

public class DummyService {
	int count;
	
	public void doWork() {
		count++;
		System.out.println("request count is " + count);
	}
}
