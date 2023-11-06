package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidNumberException extends Exception{
    public InvalidNumberException(String message){
        super(message);
    }
}
public class FactorialException{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
       System.out.print("Enter a number: ");
       try{
           int n = sc.nextInt();
           if(n<0){
                   throw new InvalidNumberException("Enter only positive Integers");
           }
           int Fact = factorial(n);
           System.out.println("Factorial of "+n+" is "+Fact);
       }
       catch(InvalidNumberException e){
            System.out.println(e.getMessage());
       }
       catch(ArithmeticException e){
            System.out.println(e.getMessage());
      }
        catch(InputMismatchException e){
            System.out.println("Enter integer values only");
      }
       finally {
    	   sc.close();
       }
}
	public static int factorial(int n){
    		if(n==0){
             	return 1;
    		}
     		else{
          		int fact=1;
          		for(int i=1; i<=n; i++){
               	fact=fact*i;
          		}
    		if(fact<=0){
                throw new ArithmeticException("given number exceeds the Integer.MAX_VALUE");
    		}
     	return fact;	
     		}
}
}
