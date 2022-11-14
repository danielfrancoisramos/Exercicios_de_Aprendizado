import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			double x = sc.nextDouble();
			double z = sc.nextDouble();
			double resultado;
			if(z!=0) {
				resultado = x/z;
				System.out.println(resultado);
			}
			else {
				System.out.println("divisao impossivel");
			}
		}
		sc.close();
	}

}
