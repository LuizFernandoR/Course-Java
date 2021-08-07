import java.util.Locale;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x ;
		String y;
		int z;
		System.out.println("Entrada");
		x = sc.nextDouble();
		y = sc.nextLine();
		z = sc.nextInt();
		System.out.printf("Saida de x = %.2f de y = %s de z = %d" , x, y, z);
		sc.close();
	}

}
