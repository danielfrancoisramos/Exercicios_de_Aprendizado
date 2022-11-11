import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		valor = sc.nextDouble();
		
		 if (valor>0 && valor<=25) {			
			System.out.println("INTERVALOT [0,25]");
		}
		 else if (valor<=50) {			
			System.out.println("INTERVALOT [25,50]");
		}
		 else if (valor<=75) {			
			System.out.println("INTERVALOT [50,75]");
		}
		 else if (valor<=100) {			
			System.out.println("INTERVALOT [75,100]");
		}
		 else {			
			System.out.println("FORA DE INTERVALO");
		}
		sc.close();

	}

}
