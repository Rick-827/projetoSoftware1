package vetores;

import java.util.Scanner;

public class vetor2 {

	public static void main(String[] args) {

		Scanner jc = new Scanner(System.in);
		
		System.out.println("quantos itens você deseja insirir no vetor");
		int tamanhoVetor = jc.nextInt();
		
		double [] notasAlunos = new double [tamanhoVetor];
		
		for(int i = 0; i < notasAlunos.length; i++) {
			System.out.println("informe uma nota entre 0 e 10");
			double nota = jc.nextDouble();
			//permita notas de 0 a 10
			
			if(nota < 0 || nota > 10) {
				System.out.println("Nota invalida");
				i-- ;
			}else {
				notasAlunos [i] = nota;
				
			}
			
		} 
		
		for(double nota : notasAlunos) {
			System.out.println(nota);
		}
				
		jc.close();
	}

}
