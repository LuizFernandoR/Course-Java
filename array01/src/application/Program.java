package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double sum = 0;
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double everage = sum / n;
		System.out.printf("Everage hithg: %.2f" , everage );
		sc.close();

	}
}

