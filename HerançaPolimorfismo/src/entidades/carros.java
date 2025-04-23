package entidades;

public class carros extends veiculos{
	
	private boolean arCondicionado;

	public carros(String marca, String modelo, int ano, double valorDiario, boolean arCondicionado) {
		super(marca, modelo, ano, valorDiario);
		
		this.arCondicionado = arCondicionado;
	}
	//toString
	public String toString() {
		return "Marca: " + getmarca()+
				"\nModelo: " + getmodelo() +
				"\nAno: " + getano() +
				"\nvalor Diaria: " + getvalorDiario() +
				"\narCondicionado: " + arCondicionado;
				
	}

}