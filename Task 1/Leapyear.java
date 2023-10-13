package sampleprograms;
import java.util.Scanner;
public class Leapyear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr a year");
		int year = scan.nextInt();
		scan.close();
		switch(year%4) {
		case 0:
		       if(year%100==0) {
		    	   if(year%400==0) {
		    		   System.out.println("leap year");
		    	   }
		    	   else {
		    		   System.out.println("Not a leap year");
		    	   }
		    	   
		       }else {
		    	   System.out.println("leap year");
		       }
		       break;
		 default :
			    System.out.println("not a leap year");
			    break;
		}

	}
	
	}


