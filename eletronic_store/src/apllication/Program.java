package apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the quantity of product to be registered: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter product data: ");
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();
			
			Product pdt = new Product(name, price, quantity);
			
			list.add(pdt);
		}
		
		for (Product pt : list) {
			System.out.print("Product data:");	
			System.out.println(pt);
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			System.out.println("Enter the number of produts to be added in stock: ");
			System.out.println();
			System.out.println(list.get(i).getName() + ": ");
			int increaseProduct = sc.nextInt();
			list.get(i).setQuantity(increaseProduct);
		}
		System.out.println();
		for (Product pt : list) {
			System.out.print("Update data: ");
			System.out.println(pt);
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			System.out.println("Enter the number to be removed from stock: ");
			System.out.println();
			System.out.println(list.get(i).getName() + ": ");
			int removeStock = sc.nextInt();
			list.get(i).removeStock(removeStock);
			list.get(i).totalValueStock();
		}
		
		System.out.println();
		for (Product pt : list) {
			System.out.print("Update data: ");
			System.out.println(pt);
		}
		
		sc.close();

	}
	

}
