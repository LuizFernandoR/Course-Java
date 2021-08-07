package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data");
		System.out.print("Name: ");
		p.name = sc.nextLine();
		System.out.print("Price: ");
		p.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		p.quantity = sc.nextInt();
		
		
		
		System.out.println(p.toString());
		System.out.println();
		System.out.println("Enter the number of products to be add in stock");
		int valueAdd = sc.nextInt();
		p.addProducts(valueAdd);
		System.out.println(p.toString());
		System.out.println();
		System.out.println("Enter the number of product to be remove from stock");
		int valueRemove = sc.nextInt();
		p.removeProducts(valueRemove);
		System.out.println(p.toString());
		
		sc.close();
	}

}
