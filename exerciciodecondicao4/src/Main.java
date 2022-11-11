import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hinicial, hfinal, htotal;
		
		hinicial = sc.nextInt();
		hfinal = sc.nextInt();
		
		if (hfinal > hinicial) {
		
			htotal = hfinal - hinicial;
			System.out.println("O JOGO DUROU " + htotal + " HORA(S)");
			
		}else {
			
			htotal = hfinal - hinicial + 24;
			System.out.println("O JOGO DUROU " + htotal + " HORA(S)");
		}
		sc.close();
	}

}
