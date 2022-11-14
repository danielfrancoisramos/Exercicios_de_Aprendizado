import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, z, c;
		x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			z = i * i;
			c = z * i;
			System.out.println(i + " " + z + " " + c);

		}
		sc.close();
	}

}
