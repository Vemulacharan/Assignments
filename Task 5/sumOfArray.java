import java.util.Scanner;

public class sumOfArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		int  sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entet an Array");
		
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
	
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		System.out.println("The sum of an array: "+sum);
		System.out.println("The average of an array: "+sum/a.length);
		sc.close();
	}
	

}
