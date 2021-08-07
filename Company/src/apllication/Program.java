package apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Employee> list = new ArrayList<>();		
		
		System.out.print("How many employee will be registered?");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
				
			Employee employee = new Employee(id, name, salary);
			
			list.add(employee);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt(); 
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		Integer pos = position(list, idSalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employee:");
		System.out.println();
		
		for(Employee ep : list) {
			System.out.println(ep);
		}
		
		sc.close();

	}
	
	public static Integer position(List<Employee> list, int id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		
		return null;
	}
	
	public static boolean hasId(List<Employee> list, Integer id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
