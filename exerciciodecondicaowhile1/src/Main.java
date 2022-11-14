import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		while (x != 2002) {
			System.out.println("SENHA INVALIDA");
			x = sc.nextInt();
				
		}
		
		System.out.println("ACESSO PERMITIDO");
		
		sc.close();

	}

}
