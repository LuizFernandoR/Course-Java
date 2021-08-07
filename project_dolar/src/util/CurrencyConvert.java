package util;

public class CurrencyConvert {
	public static double dollar;
	public static double quantity;

	
	public static double convert() {
		double sum =  (quantity * dollar * 6.0) / 100;
		return quantity * dollar + sum;
	}
}
