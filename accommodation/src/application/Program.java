package application;

import java.util.Scanner;

import entities.Guests;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Guests[] vect = new Guests[9];
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Rent #"+ (i + 1) + ":");
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Guests(name, email, room);		
		}
		
		System.out.println("Busy rooms:");
		for(int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
