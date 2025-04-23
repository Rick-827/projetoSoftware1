package principal;

import entidades.carros;

import entidades.motos;

public class main {

	public static void main(String[] args) {
		
		carros civic = new carros ("Honda", "Civic", 2024, 400, true);
		
		System.out.println(civic.toString());
		
		motos hayabusa = new motos("Suzuki", "Hayabusa", 2024, 200, 1000);
		
		System.out.println(hayabusa.toString());

	}

}
