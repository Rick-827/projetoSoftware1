package entidades;

public class veiculos {
	//atributos
	private String marca;
	private String modelo;
	private int ano;
	private double valorDiario;
	
	//construtores
	public veiculos(String marca, String modelo, int ano, double valorDiario) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorDiario = valorDiario;
	}
	
	//Getters e setters
	public String getmarca() {
		return marca;
	}
	
	public void setmarca(String marca) {
		this.marca = marca;
	}
	
	public String getmodelo() {
		return modelo;
	}
	
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getano() {
		return ano;
	}
	
	public void setano(int ano) {
		this.ano = ano;
	}
	
	public double getvalorDiario() {
		return valorDiario;
	}
	
	public void setvalorDiario(double valorDiario) {
		this.valorDiario = valorDiario;
	}
	
	//toStrng
	@Override
	public String toString() {
		return "marca: " + marca +
				"\nModelo: " + modelo +
				"\nano: " + ano +
				"\nvalorDiario: " + valorDiario ;
	}
}