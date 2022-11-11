import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario;
		
		salario = sc.nextDouble();
		
		double imposto;
		if(salario<=2000.00) {
			imposto = 0;
			System.out.println("ISENTO");
		}
		else if(salario<=3000.00) {
			imposto = (salario-2000)/100*8;			
		}
		else if (salario<=4500.00){
			imposto = (salario-3000)/100*18+80;			
		}
		else {
			imposto = (salario-4500)/100*28+350;			
		}
			System.out.printf("R$ %.2f",imposto);
		
			sc.close();
	}

}
