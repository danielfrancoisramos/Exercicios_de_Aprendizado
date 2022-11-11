import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int cod1, quant1, cod2, quant2;
		double valor1, valor2, valorTotal;
		
		cod1 = sc.nextInt();
		quant1 = sc.nextInt();
		valor1 = sc.nextDouble();
		cod2 = sc.nextInt();
		quant2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		valorTotal = (quant1*valor1)+(quant2*valor2);
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", valorTotal);
		
		sc.close();

	}

}
