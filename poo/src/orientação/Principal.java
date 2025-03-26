package orientação;

public class Principal {

	public static void main(String[] args) {
		
		Carro civic = new Carro();
		civic.fabricante = "honda";
		civic.modelo = "civic";
		civic.motor = 2.0;
		civic.placa = "honda";
		civic.cor = "preta";
		civic.ano = 2024;
		civic.velocidade = 0;
		civic.acelera(50);
		civic.freio(10);
		civic.exibirInfo();

	}

}
