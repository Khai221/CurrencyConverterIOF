package application;

import java.util.Scanner;

import currencyConverter.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price: ");
		Double cotacaoDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		Double quantity = sc.nextDouble();
		
		double totalComIOF = CurrencyConverter.totalWithIOF(cotacaoDollar, quantity);
		System.out.printf("Amount to be paid in reais = %.2f", totalComIOF);
		
		sc.close();
	}
}
