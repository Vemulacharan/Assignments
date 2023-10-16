package sampleprograms;
import java.util.Scanner;
public class twodarray {
	public static void main(String[] args) {
		int i, j;
		int a[][] = new int[2][2];
		Scanner sc= new Scanner(System.in);
		for(i=0; i<a.length; i++) {
			for(j=0; j<a[i].length; j++) {
				System.out.println(i+" row "+j+" column");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Final matrix are : ");
		for(i=0; i<a.length; i++) {
			for(j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
