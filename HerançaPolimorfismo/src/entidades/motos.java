package entidades;

public class motos extends veiculos {
	
	private int cilindradas;

	public motos(String marca, String modelo, int ano, double valorDiario, int cilindradas) {
		super(marca, modelo, ano, valorDiario);
		
		this.cilindradas = cilindradas;
	}
		//toString
		public String toString() {
			return "Marca: " + getmarca()+
					"\nModelo: " + getmodelo() +
					"\nAno: " + getano() +
					"\nvalor Diaria: " + getvalorDiario() +
					"\ncilindadras: " + cilindradas;
	}

}
