package Collections;
import java.util.PriorityQueue;
public class PriorityQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();
	
		pq.add("Red");
		pq.add("Green");
		pq.add("Black");
		pq.add("Yellow");
		pq.add("Orange");
		
		System.out.println("Elements of Priority queue: ");
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		

	}

}
