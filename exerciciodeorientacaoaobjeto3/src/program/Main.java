package program;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		System.out.println("INFORME O NOME DO ALUNO");
		student.name = sc.nextLine();
		System.out.println("INFORME AS TRÊS NOTAS DO ALUNO");
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();

		System.out.printf("Final grade = %.2f%n", student.media());
		if (student.media() < 60) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f Points", student.missing());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}

}
