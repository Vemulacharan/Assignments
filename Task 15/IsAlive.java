package Threads;

class Join extends Thread{
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("thread "+i+" is  alive");
		}
	}
}

public class IsAlive {
	public static void main(String[] args) {
		
		Join j = new Join();
		
		System.out.println("Thread before Starting: "+ j.isAlive());
		
		j.start();
		
		System.out.println("Thread After Starting: "+ j.isAlive());
		
		try {
			j.join();
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thread after completion: "+ j.isAlive());
		
	}
	
}
