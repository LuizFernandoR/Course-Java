package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Book;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Book> list = new ArrayList<>();
		
		System.out.println("1 - Regrist");
		System.out.println("3 - Exit");
		
		int resp = sc.nextInt();
		
		if(resp == 1) {
			System.out.println("Welcome!");
			System.out.println();
			char n = 'Y';
			while(n == 'Y') {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("Autor: ");
				String autor = sc.nextLine();
				System.out.print("Quantity: ");
				Integer quantity = sc.nextInt();
				Book book = new Book(name, price, autor, quantity);
				list.add(book);
				System.out.println();
				System.out.print("Do you want to continue registering? Y/N: ");
				n = sc.next().charAt(0);
			}
			
			System.out.println();
			System.out.println("Do you want to consult the registered data? Y/N");
			n = sc.next().charAt(0);
			if(n == 'Y') {
				for(Book bk : list) {
					System.out.println(bk);
				}
			}
			else {
				System.out.println("Bye Bye");
			}
		}
		else {
			System.out.println("Bye Bye");
		}
		
		sc.close();

	}

}
