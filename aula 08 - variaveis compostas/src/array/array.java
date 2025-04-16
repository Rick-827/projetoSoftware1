package array;

import java.util.ArrayList;
import java.util.List;

public class array {

	public static void main(String[] args) {
		
		List <String> listaNomes = new ArrayList<>();
		
		//Tipos Premitivos - int,double char
		//objetos - String,Integer, Double
		
		//Adicionar itens na ultima posição do array
		listaNomes.add("Pedro");
		listaNomes.add("Geovanna");
		listaNomes.add("Luiz");
		listaNomes.add("Kauan");
		
		//adicionando itens em uma posição desejada do arrey
		listaNomes.add(2, "joão");
		
		//Verificando o tamanho do array
		System.out.println(listaNomes.size());
		
		//exebindo um valor especifico da lista
		System.out.println("Posição 1: " + listaNomes.get(1));
		
		//remover itens de acordo com a posição
		listaNomes.remove(3);
		
		//removendo itens de acordo com o valor
		listaNomes.remove("João")
		
		//Identificação

		
		
		//exibindo a lista
		for(String nome : listaNomes) {
			System.out.println(nome);
		}
		

	}

}
