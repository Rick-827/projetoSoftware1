import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    	
        Scanner jc = new Scanner(System.in);
        
        System.out.println("Digite a 1º nota do aluno");
        double n1 = jc.nextDouble();

        System.out.println("Digite a 2º nota do aluno");
        double n2 = jc.nextDouble();

        System.out.println("Digite a 3º nota do aluno");
        double n3 = jc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("a media do aluno foi de: " + media);

        jc.close();
    }
}
