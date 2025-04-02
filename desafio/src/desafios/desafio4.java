package desafios;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner jc = new Scanner(System.in);
        int count = 0;
        double soma = 0, numero;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = jc.nextDouble();
            
            if (numero != 0) {
                soma += numero;
                count++;
            }
        } while (numero != 0);
        
        if (count > 0) {
            double media = soma / count;
            System.out.printf("A média dos números digitados é: %.2f\n", media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        jc.close();
    }
}
