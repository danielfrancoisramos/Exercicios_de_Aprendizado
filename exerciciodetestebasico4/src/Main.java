import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario;
		double horas, valorHora, salario;
		
		funcionario = sc.nextInt();
		horas = sc.nextDouble();
		valorHora = sc.nextDouble();
		salario = horas*valorHora;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();

	}

}
