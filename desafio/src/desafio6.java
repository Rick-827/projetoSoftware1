import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        Scanner jc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = jc.nextInt();
        
        if (numero < 0) {
            System.out.println("Número inválido! Digite um número inteiro positivo.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        
        jc.close();
    }
}
