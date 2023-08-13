package br.com.danielfss.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.danielfss.lambdas.entities.Product;
import br.com.danielfss.lambdas.predicate.ProductPredicate;

public class ProgramPredicate {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.00));
		
//		list.removeIf(p -> p.getPrice() >= 100);
		list.removeIf(new ProductPredicate());
		
		// METHOD REFERENCE (REFERÊNCIA PARA MÉTODO) COM MÉTODO ESTÁTICO. ELE VAI TRABALHAR COM O PRODUTO QUE PASSARMOS POR ARGUMENTO (Product p).
		list.removeIf(Product::staticProductPredicate);

		// METHOD REFERENCE COM MÉTODO NÃO ESTÁTICO.
		list.removeIf(Product::nonStaticProductPredicate);
		
		for (Product product : list) {
			System.out.println(product);
		}
	}
}
