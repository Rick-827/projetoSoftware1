package sequisersim;

import java.util.Scanner;

public class SistemasNotas {

	public static void main(String[] args) {
		 // calcule a media de um aluno e diga se ele foi:
		//		-Aprovado  - 7 a 10
		//		-Recuperação - 5 a 6.9
		
		//		mediaFinal = (media + notaExame) / 2
		//		-Aprovado - 7 a 10
		//		-Reprovado - 0 a 6.9
		
		//		-Reprovado - 0 a 4.9

		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = 	(nota1 + nota2) / 2;
		
		System.out.println("A sua média foi de: " + media);
		
		if (media >=7 ) {
				System.out.println("aprovado");
		}
		else if (media >=5) {
			System.out.println("Recuperação");
			
			System.out.print("Digite a nota do exame do aluno: ");
			double notaexame = sc.nextDouble();
			double mediafinal = (media +notaexame) / 2;
			
			if (mediafinal >= 7) {
				System.out.println("aprovado");
			}
			else {
				System.out.println("reprovado");
			}
			System.out.print("a media final do aluno foi de " + mediafinal);
		}
		
		
		else {
			System.out.println("reporvado");
	}
	
		sc.close();
		

		
		
		
		
	}

}
