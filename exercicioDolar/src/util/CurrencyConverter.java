package util;

public class CurrencyConverter {
	public static double IOF = 0.06;
	
	public static double dolarReal(double qtd, double dolar) {
		return qtd * dolar * (1.0 + IOF);
	}	
}