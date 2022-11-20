package ultil;

public class CurrencyConverter {

	public static double dollarPrice;
	public static double dollarBought;

	public static double amountPaid() {
		return (dollarBought * dollarPrice) + dollarBought * dollarPrice / 100 * 6;
	}

}
