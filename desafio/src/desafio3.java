import java.util.Scanner;

public class desafio3 {
    
    public static void main(String[] args) {
        Scanner jc = new Scanner(System.in);

        System.out.print("Digite o valor do emprestimo: R$ ");
        double emprestimo = jc.nextDouble();

        System.out.println("Escolha o número de parcela:");
        System.out.println("1 - 6 de meses (+5%)");
        System.out.println("2 - 12 de meses (10%)");
        System.out.println("3 - 24 de meses (20%)");
        System.out.print("Opção: ");
        int opcao = jc.nextInt();

        double taxas;
        switch (opcao) {
            case 1:
                taxas = emprestimo * 1.05;
                System.out.printf("Valor final a ser pago: R$ %.2f\n", taxas);
                break;
            case 2:
                taxas = emprestimo * 1.10;
                System.out.printf("Valor final a ser pago: R$ %.2f\n", taxas);
                break;
            case 3:
                taxas = emprestimo * 1.20;
                System.out.printf("Valor final a ser pago: R$ %.2f\n", taxas);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        jc.close();
    }
}
