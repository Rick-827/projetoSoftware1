package variaveis;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
    	
        Scanner jc = new Scanner(System.in);
        
<<<<<<< HEAD
        for (int i = 1; i <= 3; i++) {
            System.out.print("Pessoa " + i + ", digite um número: ");
            soma += jc.nextDouble();
        }
        
        System.out.println("A média é: " + (soma / 3));
=======
        System.out.println("Digite a 1º nota do aluno: ");
        double n1 = jc.nextDouble();

        System.out.println("Digite a 2º nota do aluno: ");
        double n2 = jc.nextDouble();

        System.out.println("Digite a 3º nota do aluno: ");
        double n3 = jc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("a media do aluno foi de: " + media);

>>>>>>> 5f09b682140df1964194ab7ed2b2daffe1d2cafb
        jc.close();
    }
}