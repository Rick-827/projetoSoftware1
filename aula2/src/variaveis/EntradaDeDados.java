 package variaveis;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite o seu nome: ");
		nome = sc.next();
		
		
		System.out.println("Você digitou " + nome);
		
		System.out.println("digite a sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Você digitou " + idade);
		
		System.out.println("digite a sua altura: ");
		double	 altura = sc.nextDouble();
		System.out.println("Você digitou " + altura);
		
		sc.close();

	}

}
