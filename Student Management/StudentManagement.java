package Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

class Student{
	private String name;
	private List<String> courses;
	
	public Student(String name, List<String> courses) {
		this.name = name;
		this.courses = new ArrayList<>(courses);
	}
	
	public String getName() {
		return name;
	}
	
	public List<String> getCourses() {
		return courses;
	}
}

class School{
	private Map<String,Student> students;
	
	public School() {
		students = new HashMap<>();
	}
	
	public void addStudent(String name, List<String> courses) {
		Student student = new Student(name, courses);
		students.put(name, student);
	}
	
	public void removeStudent(String name) {
		students.remove(name);
	}
	
	public void addCourseToStudent(String name, String course) {
		Student student = students.get(name);
		if(student != null) {
			student.getCourses().add(course);
		}
	}
	
	public void removeCourseFromStudent(String name, String course) {
		Student student = students.get(name);
		if(student != null) {
			student.getCourses().remove(course);
		}
	}
	
	public List<String> getStudentCourses(String name) {
		Student student = students.get(name);
		if(student != null) {
			return student.getCourses();
		}
		return null;
	}
}


public class StudentManagement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        School school = new School();
        
        System.out.println("Enter 1 to add a student");
        System.out.println("Enter 2 to add a course to a student");
        System.out.println("Enter 3 to remove a course from a student");
        System.out.println("Enter 4 to display student's courses");
        System.out.println("Enter 5 to exit");
        System.out.print("Enter your choice: ");
        
        while (true) {
            

            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
            case 1:
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter course (comma-separated if multiple): ");
                String[] courses = scanner.nextLine().split(",");
                school.addStudent(name, Arrays.asList(courses));
                break;
            case 2:
                System.out.print("Enter student name: ");
                String studentName = scanner.nextLine();
                System.out.print("Enter course to add: ");
                String courseToAdd = scanner.nextLine();
                school.addCourseToStudent(studentName, courseToAdd);
                break;
            case 3:
                System.out.print("Enter student name: ");
                String studentToRemoveFrom = scanner.nextLine();
                System.out.print("Enter course to remove: ");
                String courseToRemove = scanner.nextLine();
                school.removeCourseFromStudent(studentToRemoveFrom, courseToRemove);
                break;
            case 4:
                System.out.print("Enter student name: ");
                String studentToDisplay = scanner.nextLine();
                List<String> studentCourses = school.getStudentCourses(studentToDisplay);
                if (studentCourses != null) {
                    System.out.println(studentToDisplay + "'s Courses: " + studentCourses);
                } else {
                    System.out.println("Student not found.");
                }
                break;
            case 5:
                System.out.println("Exiting program");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
	}
      
}
        }

       
   }    

