package aula4;

import java.util.Scanner;

public class samuel {

	public static void main(String[] args) {
		
		Scanner jc = new Scanner(System.in);
		
		String loginsalva = "admin";
		String senhasalva = "1234567";
		String login = "";
		String senha = "";
		int tentativas = 0;
		int limiteTentativas = 5;
		
		while (tentativas < limiteTentativas) {
			System.out.println("Digite o seu login: ");
			login = jc.nextLine();
			
			System.out.println("Digite a sua senha: ");
			senha = jc.nextLine();
			if (login.equals(loginsalva) && senha.equals(senhasalva)) {
				System.out.println("acesso liberado");
				break;
			} else {
				tentativas++;
				System.out.println("acesso negado, tente novamente. tentativa " + tentativas + " de " + limiteTentativas);
				
			}
		}
		
		jc.close();

	}

}
