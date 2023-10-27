package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class RetrieveElement {
	public static void main(String[] args) {
		
        LinkedList<String> list = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First element: ");
		list.add(sc.nextLine());
		System.out.print("Enter Second element: ");
		list.add(sc.nextLine());
		System.out.print("Enter Third element: ");
		list.add(sc.nextLine());
		System.out.print("Enter Fourth element: ");
		list.add(sc.nextLine());
		
		System.out.println(list);
		
		System.out.println("First element: "+ list.getFirst());
		
		sc.close();
	}

}
