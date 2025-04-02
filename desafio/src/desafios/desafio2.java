package desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner jc = new Scanner(System.in);

        System.out.print("Digite o valor em reais: R$ ");
        double reais = jc.nextDouble();

        System.out.println("Escolha a moeda para conversão:");
        System.out.println("1 - Dólar (R$ 1 = US$ 0.20)");
        System.out.println("2 - Euro (R$ 1 = € 0.18)");
        System.out.println("3 - Libra (R$ 1 = £ 0.15)");
        System.out.print("Opção: ");
        int opcao = jc.nextInt();

        double convertido;
        switch (opcao) {
            case 1:
                convertido = reais * 0.20;
                System.out.printf("Valor convertido: US$ %.2f\n", convertido);
                break;
            case 2:
                convertido = reais * 0.18;
                System.out.printf("Valor convertido: € %.2f\n", convertido);
                break;
            case 3:
                convertido = reais * 0.15;
                System.out.printf("Valor convertido: £ %.2f\n", convertido);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        jc.close();
    }
}
