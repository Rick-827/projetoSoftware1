package variaveis;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner dc = new Scanner(System.in);
		
		System.out.print("Digite o raio do circulo: ");
		
		double raio = dc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		double perimetro = 2 * Math.PI * raio;
		
		System.out.println("Área: " + area);
		
		System.out.println("Perímetro(circunferência): " + perimetro);
		
		dc.close();
		
	}
	
}
