package CodeAlpha_Task;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class Currency_Converter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.err.println("* welcome to Currency Converter *");
		System.out.println("****************************************");
		System.out.print("Enter the source currency code ( Exg.? INR To USD ) ");
		String fCurrency = sc.nextLine();

		System.out.print("Enter the source currency code TO ");
		String tCurrency = sc.nextLine();

		System.out.print("Enter the convert to Amount ");
		BigDecimal Amount = sc.nextBigDecimal();

		Map<String, BigDecimal> exchangerates = new HashMap<>();
		exchangerates.put("USD", BigDecimal.valueOf(0.01));
		exchangerates.put("INR", BigDecimal.valueOf(83.11));
		exchangerates.put("EUR", BigDecimal.valueOf(1.0));
		exchangerates.put("USD", BigDecimal.valueOf(1.0));
		exchangerates.put("GBP", BigDecimal.valueOf(0.95));

		BigDecimal fRates = exchangerates.get(fCurrency);
		BigDecimal tRates = exchangerates.get(tCurrency);

		if (fRates != null && tRates != null) {
			BigDecimal convertedAmount = Amount.multiply(tRates).divide(fRates, 2, BigDecimal.ROUND_HALF_UP);
			System.err.println(fCurrency + " " + Amount + " " + tCurrency + " " + convertedAmount);
			System.out.println("****************************************");

		} else {
			System.out.println("invalid Currency codes.? ");
		}
	}
}


