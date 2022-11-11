import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		x = sc.next();
		y = sc.nextInt();
		System.out.printf("voce digitou %s %d", x, y);

		sc.close();

	}

}
