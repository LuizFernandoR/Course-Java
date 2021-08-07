package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Programan {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee(); 
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		employee.netSalary();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.println("Whitch percentage to increase salary?");
		double valueTax = sc.nextDouble();
		employee.increaseSalary(valueTax);
		System.out.println("Update data: " + employee);
		
		sc.close();

	}

}
