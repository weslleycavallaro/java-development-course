package applocation;

import java.util.Scanner;

import entities.Student;

public class Project {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();

		System.out.print("Name: ");
		student.name = sc.nextLine();
		
		System.out.print("Grade 1: ");
		student.grade1 = sc.nextDouble();
		
		System.out.print("Grade 2: ");
		student.grade2 = sc.nextDouble();
		
		System.out.print("Grade 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println(student);
		
		
		sc.close();
	}

}
