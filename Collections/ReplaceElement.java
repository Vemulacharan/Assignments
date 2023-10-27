package Collections;

import java.util.Scanner;
import java.util.ArrayList;

public class ReplaceElement {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First element: ");
		list.add(sc.nextLine());
		System.out.print("Enter Second element: ");
		list.add(sc.nextLine());
		System.out.print("Enter Third element: ");
		list.add(sc.nextLine());
		System.out.print("Enter Fourth element: ");
		list.add(sc.nextLine());
		
		System.out.println("ArrayList before replace");
		System.out.println(list);
		
		System.out.println("Enter the element replace the second element with:  ");
		String specifiedElement = sc.nextLine();
		
		if(list.size()>1) {
			list.set(1, specifiedElement);
			System.out.println("ArrayList after replacing the second element: "+list);
		}
		else {
			System.out.println("ArrayList dose not hava a second element to replace");
		}
		
		sc.close();
	}
	

}
