package day10;

/*class MyThread1 extends Thread {

	public void run() { ;// Running
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100); // blocking
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}*/

/*class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void start() {
		System.out.println("start method");
	}

}*/


//s.run();

public class MultiThreadingDemo {
	public static void main(String[] args) throws InterruptedException {

		
		Runnable s=()->{
			for (int i = 1; i < 5; i++) {
				System.out.println(i);
			}
		};
		s.run();
		//Thread t1=new Thread(s);
		//t1.start();
		/*MyThread1 t1 = new MyThread1(); // main thread
		t1.setName("MyThread-1");
		//t1.setPriority(10);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start(); // MyThread1-5 // Runnable

		MyThread2 mt2 = new MyThread2();
		Thread t2 = new Thread(mt2);
		t2.setName("MyThread-2");
		//t2.setPriority(1);
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start(); // start method
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		Thread.currentThread().getPriority(); // 5

		// new Thread(new MyThread2()).start();
*/
		/*
		// Get thread id
		System.out.println("t1 Id: " + t1.getId());
		System.out.println("t2 Id: " + t2.getId());
		System.out.println("main Id: " + Thread.currentThread().getId());

         
		System.out.println();
		// Priority - default priority - 5
		// 0 to 10, 10 - high priority, 0 - least priority
		System.out.println("t1 priority: " + t1.getPriority()); // 5
		System.out.println("t2 priority: " + t2.getPriority()); // 5
		System.out.println("main thread priority: " + Thread.currentThread().getPriority()); // 5
		*/
		
		/*System.out.println(t1.isAlive()); // true
		System.out.println(t2.isAlive()); // true
		System.out.println(Thread.activeCount()); // 3
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive()); // false
		System.out.println(t2.isAlive()); // false
		System.out.println(Thread.currentThread().isAlive()); // true
		System.out.println(Thread.activeCount()); // 1
		
		
		for (int i = 0; i < 5; i++) {
			Thread.currentThread().setName("Main");
			System.out.println();
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		;// MainThread -5*/
			
	}
}
