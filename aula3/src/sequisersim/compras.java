package sequisersim;

import java.util.Scanner;

public class compras {
	
	public static void main(String[] args) {
		
		Scanner jc = new Scanner(System.in);
		
		System.out.println("informe o valor da sua compra R$: ");
		double valorCompra = jc.nextDouble();
		
		System.out.println("Metodos Pagamento");
		System.out.println("1º Dinheiro/Pix");
		System.out.println("2º Debito");
		System.out.println("3º Credito");
		int metodoPagamento = jc.nextInt();
		
		switch (metodoPagamento) {
		case 1:
			double valorfinal = valorCompra * 0.9;
			System.out.println("Sua compra ficou R$" + valorfinal);
			break;
		case 2:
			valorfinal = valorCompra * 0.95;
			System.out.println("Sua compra ficou R$" + valorfinal);
			break;
		case 3:
			System.out.println("Metodos De Parcelamento");
			System.out.println("1º - A Vista");
			System.out.println("2º - 2x, 5% de juros");
			System.out.println("3º - 3x, 10% de juros");
			int metodoParcelamento = jc.nextInt();
			
			switch(metodoParcelamento) {
			case 1:
				System.out.println("Sua compra ficou R$" + valorCompra);
				break;
			case 2:
				valorfinal = valorCompra * 1.05;
				System.out.println("Sua compra ficou R$" + valorfinal);
				break;
			case 3:
				valorfinal = valorCompra * 1.1;
				System.out.println("Sua compra ficou R$" + valorfinal);
				break;
			default:
				System.out.println("Opção Invalida");
				break;
			}
		default:
			System.out.println("Opção Invalida");
			break;
		}
		
		jc.close();
	}

}
