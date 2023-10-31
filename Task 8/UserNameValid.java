package ExceptionHandling;

import java.util.Scanner;
class InvalidusernameException extends Exception {
	
	public InvalidusernameException(String name) {
		super(name);
	}
}

public class UserNameValid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String username = sc.nextLine();
		
		try {
			if(username.matches(".*[!@#$%^&*(),.? \":{}|<>].*")) {
				throw new InvalidusernameException("Invalid username, special characters not allowed");
			}
			System.out.println("Username valid");
		}
		catch(InvalidusernameException e) {
			System.out.println("Error: "+ e.getMessage());
		}

	}

}
