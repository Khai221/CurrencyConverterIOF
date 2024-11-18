package currencyConverter;

public class CurrencyConverter {
	
	private static final double IOF_RATE = 0.06;
	
	
	public static double realToDollar(double dollarPrice, double dollarQuantity) {
		return dollarPrice * dollarQuantity;
	}
	
	public static double totalWithIOF(double dollarPrice, double dollarQuantity) {
		double valueInReais = realToDollar(dollarPrice, dollarQuantity);
		return valueInReais +  (valueInReais * IOF_RATE);
	}
	
	
}
