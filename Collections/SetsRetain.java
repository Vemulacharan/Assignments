package Collections;

import java.util.Set;
import java.util.HashSet;
public class SetsRetain {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		set1.add(34);
		set1.add(10);
		set1.add(45);
		set1.add(54);
		
		set2.add(45);
		set2.add(18);
		set2.add(63);
		set2.add(10);
		
		System.out.println("The first set elements: ");
		System.out.println(set1);
		System.out.println("The Secong set elements: ");
		System.out.println(set2);
		
		set1.retainAll(set2);
		
		System.out.println("The Common elements between two sets: "+ set1);

	}

}
