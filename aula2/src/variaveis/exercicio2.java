package variaveis;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		
		System.out.print("Digite o seu capital inicial: ");
		double capital = se.nextDouble();
		
		System.out.print("Digite a taxa de juros por mês: ");
		double taxa = se.nextDouble() / 100;

		System.out.print("Digite o tempo em meses: ");
		int tempo = se.nextInt();
		
		double montate = capital * Math.pow((1 + taxa), tempo);
		double juros = montate - capital;
		
		System.out.println("montate final: R$ " + montate);
		System.out.println("juros ganho: R$ " + juros);
				
		se.close();

	}

}
