package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employ = new Employee();
		
		System.out.println("Type the name, gross salary and taxes");
		employ.name = sc.nextLine();
		employ.gross = sc.nextDouble();
		employ.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", employ.name, employ.netsalary());
		System.out.println("Wich percentage to increase salary?");
		employ.increasetax = sc.nextDouble();
		System.out.printf("Updated data: %s, $ %.2f%n", employ.name, employ.incresesalary());
		
		sc.close();
	}

}
