import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
    	
        Scanner jc = new Scanner(System.in);
        double soma = 0;
        
        for (int i = 1; i <= 3; i++)
            System.out.print("Pessoa " + i + ", digite um número: ");
            soma += jc.nextDouble();
        
        
        System.out.println("A média é: " + (soma / 3));
        jc.close();
    }
}
