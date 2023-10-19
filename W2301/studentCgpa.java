package sampleprograms;
import java.util.Scanner;
 class Cgpa {
	private String name;
	private int[] marks = new int[6];
	private double Cgpa;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMarks(int[] marks) {
		for(int i=0; i<marks.length; i++) {
			if(marks[i]<=100 && marks[i]>=0) {
				this.marks[i] = marks[i];
			}
			else {
				System.out.println("the marks not valid");
			}
		}
	}
	public void calcCgpa() {
		
		int total = 0;
		for(int i=0; i<marks.length; i++) {
			total+=marks[i];
		}
		double average = (double)total/marks.length;
		Cgpa = (average/100)*10;
	
	}
	public String getName() {
		return name;
	}
	public double getCgpa() {
		return Cgpa;
	}
	
}
public class studentCgpa{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cgpa student = new Cgpa();
		System.out.println("Enter marks for 6 subjects: ");
		int[] marks = new int[6];
		for(int i=0; i<marks.length; i++) {
			System.out.println("Subject"+(i+1)+":");
			marks[i] = sc.nextInt();
		}
		student.setName("Charan");
	    student.setMarks(marks);
	    student.calcCgpa();
	    System.out.println("CGPA: "+ student.getCgpa());
	    
	    sc.close();
	}
	
	
}

