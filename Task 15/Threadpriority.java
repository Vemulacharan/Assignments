package Threads;


class thread extends Thread{
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getPriority());
		}
	}
}



public class Threadpriority {
	
	public static void main(String[] args) {
		
		thread t1 = new thread();
		thread t2 = new thread();
		thread t3 = new thread();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
