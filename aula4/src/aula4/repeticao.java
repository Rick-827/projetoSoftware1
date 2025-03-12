package aula4;

import java.util.Scanner;

public class repeticao {

	public static void main(String[] args) {
		
		Scanner jc = new Scanner(System.in);
         
		
		int maquina = (int) (Math.random() * 10);
		int usuario;
		
		do {
			System.out.print("informe um numero: ");
			usuario = jc.nextInt();
			
			if(usuario > maquina) {
			System.out.println("Digite um numero menor");
			}
			else if (usuario < maquina) {
				System.out.println("digite um numero maior");
			}
			
		} while (usuario != maquina);
		
		System.out.println("Parabens, você venceu");
		jc.close();
	}

}
