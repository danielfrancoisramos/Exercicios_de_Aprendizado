import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int z = 1;
			for (int i=1; i<=x; i++) {
			z=z*i;
		}
		
		System.out.println(z);
		sc.close();
	}

}
