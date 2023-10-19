package sampleprograms;
import java.util.Scanner;

  class DataEntry {
	void find(int value) {
		System.out.println("INTEGER TYPE");
	}
	
	void find(float value) {
		System.out.println("FLOAT TYPE");
	}
	
	void find(boolean value) {
		System.out.println("BOOLEAN TYPE");
	}
}
  
 public class DataType{
	public static void main(String[] args) {
		
		DataEntry d = new DataEntry();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value or name :");
		if(sc.hasNextInt()) {
			int val = sc.nextInt();
			d.find(val);
		}
		else if(sc.hasNextFloat()){
			float val = sc.nextFloat();
			d.find(val);
		}
		else if(sc.hasNextBoolean()) {
			boolean val = sc.nextBoolean();
			d.find(val);
		}
		else {
			System.out.println("STRING TYPE");
		}
		sc.close();
	}
}

