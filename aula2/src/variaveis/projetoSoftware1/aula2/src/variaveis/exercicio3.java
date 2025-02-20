package variaveis;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		for (int i = 1; i <= 3;  i++) {
			System.out.print("pessoa " + i +",digite um número: ");
			soma += sc.nextDouble();
		}
		
		System.out.println("a média das 3 pessoas é: " + (soma / 3));
		sc.close();
		
	}

}
