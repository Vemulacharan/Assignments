package Threads;

class EvenThread extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println("Even Number: "+i);
			}
		}
	}
}

class OddThread extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			if(i%2!=0) {
				System.out.println("Odd Number: "+i);
			}
		}
	}
}

public class EvenOrOdd{
	public static void main(String[] args) {
		
		EvenThread et = new EvenThread();
		OddThread ot = new OddThread();
		
	    et.start();
		ot.start();
		
		
		
	}
}