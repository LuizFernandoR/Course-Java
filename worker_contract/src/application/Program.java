package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.Enum.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter departament's name: ");
		String departamentName = sc.nextLine();
		System.out.println();
		System.out.println("Enter worker level: "); 
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary:");
		Double baseSalary = sc.nextDouble();
		System.out.println();
		System.out.print("How many contract to this worker? ");
		int count = sc.nextInt();
		System.out.println();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));
		
		for(int i=1; i<=count; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date dd/mm/yyyy: ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours): ");
			Integer contractHours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, contractHours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYYY):" );
		String monthAndYear = sc.nextLine();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		System.out.println("Income for: " + String.format("%.2f", worker.income(month, year)));
				
		sc.close();

	}

}
