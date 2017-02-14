package com.shivinfotech.threads;

public class ClientThread implements Runnable {
	DummyService service;

	ClientThread(DummyService service) {
		this.service = service;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			service.doWork();
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
