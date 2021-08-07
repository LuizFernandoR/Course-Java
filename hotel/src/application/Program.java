package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Bedroom;
import entities.Office;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Office> office = new ArrayList<>();
		List<Bedroom> bedroom = new ArrayList<>();
		
		System.out.println("how many guests are there? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Checkin: ");
			String checkin = sc.nextLine();
			System.out.print("Checkout: ");
			String checkout = sc.nextLine();
			System.out.print("Room number: ");
			Integer number = sc.nextInt();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
		Office ofc = new Office(name, email, checkin, checkout);
		Bedroom bdr = new Bedroom(number, price);
		
		office.add(ofc);
		bedroom.add(bdr);
		}
		
		sc.close();

	}
	
	public static Double totalValue(String in , String out, Double price) {
		List list = 
	}
}
