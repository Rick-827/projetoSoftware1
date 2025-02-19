package variaveis;
import java.util.Scanner;

public class exercicio {

		public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);
		
		System.out.print("Digite a sua temperatura em celsius: ");
		double celsius = sa.nextDouble();
		
		double Fahrenheit = (celsius * 9/5) + 32;
		double Kelvin = (celsius + 273.15);
		
		System.out.println("temperatura em fahrenheit: " + Fahrenheit);
		System.out.println("temperatura em kelvin: " + Kelvin);
		
		sa.close();
		
		

	}

}
