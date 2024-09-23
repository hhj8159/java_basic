package lesson17_thread;

public class threadEx {
	public static void main(String[] args) {
		Thread t1 = new ThreadExtend();
		Thread t2 = new Thread(new RunnableImpl());
		
		t2.setPriority(6);
		
		t1.start();
		t2.start();		
//		new ThreadESsnew RunnableImpl(), "러너블스레드").start();
		System.out.println("main 종료 " + Thread.currentThread().getName());	
	}
}

class ThreadExtend extends Thread {
	public void run() {
		System.out.println("Thread 상속 ");
		for(int i = 0 ; i < 50 ; i++) {
			System.out.println("Thread 상속 " + i + currentThread().getName());
		}
	}

}
class RunnableImpl implements Runnable {
	public void run() {
		System.out.println("Runnable 구현 ");
		for(int i = 0 ; i < 50 ; i++) {
			System.out.println("Runnable 구현 " + i + Thread.currentThread().getName());
		}
	}

}
