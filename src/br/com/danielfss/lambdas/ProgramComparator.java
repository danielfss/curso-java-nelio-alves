package br.com.danielfss.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.danielfss.lambdas.comparator.MyComparator;
import br.com.danielfss.lambdas.entities.Product;

public class ProgramComparator {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// PASSANDO O COMPARATOR DENTRO DO MÉTODO SORT DA INTERFACE LIST.
		list.sort(new MyComparator());
		
		// USANDO O COMPARATOR COM SINTAXE DE CLASSE ANÔNIMA
		Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		
		list.sort(comp);
		
		// EXPRESSÃO LAMBDA OU FUNÇÃO ANÔNIMA
		Comparator<Product> comp1 = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		list.sort(comp1);
		
		// COM O RETORNO DE APENAS 1 LINHA, É POSSÍVEL REDUZIR MAIS AINDA O CÓDIGO.
		Comparator<Product> comp2 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort(comp2);
		
		// PASSANDO O COMPARATOR DIRETO NO ARGUMENTO DO MÉTODO SORT
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product product : list) {
			System.out.println(product);
		}
	}
}
