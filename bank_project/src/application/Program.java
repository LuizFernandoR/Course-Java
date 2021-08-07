package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account numnber: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		Account account;
		
		System.out.println("Is there na initial deposit (Y/N)?");
		char cond = sc.next().charAt(0);
		
		if(cond == 'Y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(name, number, initialDeposit);
		}
		else {
			account = new Account(name, number);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.addBalance(amount);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.removeBalance(withdraw);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		
	//	System.out.println("Account data: " + account);
		
	//	Account account = new Account(name, number, amount);
		
		sc.close();

	}

}
