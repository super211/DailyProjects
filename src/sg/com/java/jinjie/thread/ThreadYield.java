package sg.com.java.jinjie.thread;

public class ThreadYield implements Runnable {

	Thread t;

	ThreadYield(String str) {

		t = new Thread(this, str);
		
		// this will call run() function
		//t.run(); // run will not start a new thread
		t.start();// start will start a new thread
		
		System.out.println(t.getName() + " is running " + t.getPriority());
		
	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			// yields control to another thread every 5 iterations
			if ((i % 5) == 0) {
				System.out.println(Thread.currentThread().getName()
						+ " yielding control...");

				/*
				 * causes the currently executing thread object to temporarily
				 * pause and allow other threads to execute
				 */
				Thread.yield();
			}
		}

		System.out.println(Thread.currentThread().getName()
				+ " has finished executing.");
	}

	public static void main(String[] args) {
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		
		new ThreadYield("Thread 1");
		new ThreadYield("Thread 2");
		new ThreadYield("Thread 3");
	}
}