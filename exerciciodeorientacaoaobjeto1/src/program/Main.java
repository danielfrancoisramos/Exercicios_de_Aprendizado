package program;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Rectangle recta = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		recta.width = sc.nextDouble();
		recta.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", recta.area());
		System.out.printf("Perimeter = %.2f%n", recta.perimeter());
		System.out.printf("Diagonal = %.2f%n", recta.diagonal());
		
		
		sc.close();
	}

}
