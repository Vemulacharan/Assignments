package sampleprograms;
import java.util.Scanner;
public class charCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		String str = sc.nextLine();
		sc.close();
		
		char[] charArr = str.toCharArray();
		
		int[] count = new int[256];
		
		for(char ch: charArr) {
			if(ch!=' ') {
			count[ch]++;
			}
		}
		System.out.println("The Duplicate characters are: ");
		for(int i=0; i<count.length; i++) {
			if(count[i]>1) {
				if((char)i !=' ') {
				System.out.println("char "+ (char) i +", count: "+ count[i]+ " times");
				}
			}
		}
		
	}

}
