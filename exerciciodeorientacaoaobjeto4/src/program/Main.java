package program;

import ultil.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price?");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		CurrencyConverter.dollarBought = sc.nextDouble();

		System.out.printf("Amount to be paid: %.2f%n", CurrencyConverter.amountPaid());

		sc.close();

	}

}
