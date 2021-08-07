package apllication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);		
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		System.out.println();
		System.out.print("Enter the number of products to be add in stock: ");
		int valueAdd = sc.nextInt();
		product.addProducts(valueAdd);
		System.out.println();
		System.out.println("Update data: " + product.toString());
		System.out.println();
		System.out.print("Enter the number of product to be remove from stock: ");
		int valueRemove = sc.nextInt();
		product.removeProducts(valueRemove);
		System.out.println("Update data: " + product.toString());
		sc.close();
	}

}
