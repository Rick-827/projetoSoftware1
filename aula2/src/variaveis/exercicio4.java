package variaveis;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		
		System.out.print("Digite o valor da capital inicial (R$): ");
		double capital = jc.nextDouble();
		
		System.out.print("Digite a taxa de juros (% ao mes): ");
		double taxa = jc.nextDouble() / 100;
		
		System.out.print("Digite o tempo (em meses): ");
		int tempo = jc.nextInt();
		
		double juros = capital * taxa * tempo;
		double montate = capital + juros;
		
		System.out.println("\nJuros acumulados: R$ " + juros);
		System.out.println("Montate total: R$ " + montate);
		
		jc.close();

	}

}
