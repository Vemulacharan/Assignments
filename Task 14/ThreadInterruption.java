package Threads;

class LongrunningTask extends Thread{
	public void run() {
		try {
		
			for(int i=1; i<=10; i++) {
				System.out.println("Thread is running: "+i+" times");
				Thread.sleep(1000);
			}
		
		}
		catch(InterruptedException e) {
		System.out.println("Thread is Interrupted: "+e.getMessage());
	}
}

}
public class ThreadInterruption {

	public static void main(String[] args) {
		
		LongrunningTask lt = new LongrunningTask();
		lt.start();
		
		try {
			Thread.sleep(5000);
			lt.interrupt();
		}
		catch(InterruptedException e){
			System.out.println(e);
		}

	}

}
