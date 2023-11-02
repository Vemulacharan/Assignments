package ExceptionHandling;
import java.util.Scanner;
public class NumberFormat {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		String Input = sc.nextLine();
		
		try {
			int value = Integer.parseInt(Input);
			System.out.println("Parsed Integer value: "+ value);
		}
		catch(NumberFormatException n) {
			System.out.println("Invalid input, please enter Integer value");
		}
		
		
		System.out.print("Enter a Double: ");
		String doubleInput = sc.nextLine();
		
		try {
			double dValue = Double.parseDouble(doubleInput);
			System.out.println("Parsed Double value: "+ dValue);
		}
		catch(NumberFormatException n) {
			System.out.println("Invalid input, please enter Double value");
		}
		
		
		
	}
}
