package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramS {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("Grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Grade 2: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Grade 3: ");
		student.grade3 = sc.nextDouble();
		
		double sum = student.average();
		
		if(sum >= 60.0) {
			System.out.println(student.toString());
			System.out.println("PASS");
		}
		else {
			System.out.println(student.toString());
			System.out.println("Failed");
			System.out.printf("Missing %.2f Points", student.missing());
		}
		
		
		sc.close();

	}

}
