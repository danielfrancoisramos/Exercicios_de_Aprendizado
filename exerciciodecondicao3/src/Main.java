import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			System.out.println("sao divisiveis");
			
	    }else {
	    	System.out.println("nao sao divisiveis");
	    }
		sc.close();
	}

}
