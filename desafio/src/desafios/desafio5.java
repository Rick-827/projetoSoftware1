package desafios;

import java.util.Scanner;

public class desafio5{
    public static void main(String[] args) {
        Scanner jc = new Scanner(System.in);
        int numero, somaPares = 0, somaImpares = 0;

        System.out.println("Digite números para verificar se são pares ou ímpares (0 para sair):");
        numero = jc.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
                somaPares += numero;
            } else {
                System.out.println(numero + " é ímpar.");
                somaImpares += numero;
            }
            
            numero = jc.nextInt();
        }

        // Exibe os totais
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        jc.close();
    }
}
