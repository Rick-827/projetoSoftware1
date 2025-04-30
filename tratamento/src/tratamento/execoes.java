package tratamento;

public class execoes {
	
	public static void main(String[] args) {
		
		Sanner sc = new Sanner(System.in);
		
		try {
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
			System.out.println("O número dogotado fo" + numero);
		} catch(InputMismathExpetion e) {
			System.out.println("Valor inválido, informe um número");
		}
		try {
			int[] arr = new int[5];
			System.out.println(arr[9]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.ou.println("O erro encontrao foi" + e.getMessage());
		}
	}
		try {
			int resultado = 10/0;
			Sytem.out.println(resultado);
		} catch (ArithmeticException e) {
			Sistem.out.prinln("O erro encontrado")
		}
		
	}

