import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		
		int number, workedHours;
		double hourValue;
		
		number = sc.nextInt();
		workedHours = sc.nextInt();
		hourValue = sc.nextDouble();
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = %.2f", (workedHours * hourValue));
		
		
		sc.close();

	}

}
