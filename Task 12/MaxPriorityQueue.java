package Collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> Maxpq = new PriorityQueue<>(Collections.reverseOrder());
		
		Maxpq.add(7);
		Maxpq.add(45);
		Maxpq.add(18);
		Maxpq.add(63);
		Maxpq.add(55);
		
		System.out.println("Original Priority Queue: "+Maxpq);
		
		while(!Maxpq.isEmpty()) {
			System.out.println(Maxpq.poll());
		}
	}

}
