package Threads;

class Even implements Runnable{
	public void run() {
		try {
			for(int i=0; i<=10; i++) {
				if(i%2==0) {
					System.out.println("Even numbers: "+i);
					Thread.sleep(500);	
				}
			}
		}
		catch(InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
	}
}

class Odd implements Runnable{
	public void run() {
		
		try {
			for(int i=0; i<=10; i++) {
				if(i%2!=0) {
					System.out.println("Odd numbers: "+i);
					Thread.sleep(500);	
				}
			}
		}
		catch(InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
	}
}
public class RunnableThread {
	
	public static void main(String[] args) {
		
		Even e = new Even();
		Thread t1 = new Thread(e);
		Odd o = new Odd();
		Thread t2 = new Thread(o);
		t1.start();
		t2.start();
		
		
		
	}

}
