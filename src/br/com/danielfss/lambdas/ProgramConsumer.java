package br.com.danielfss.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import br.com.danielfss.lambdas.consumer.ProductConsumer;
import br.com.danielfss.lambdas.entities.Product;

public class ProgramConsumer {

	// AUMENTAR O PREÇO EM 10%
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.00));

		// EXPRESSÃO LAMBDA USANDO IMPLEMENTAÇÃO DA INTERFACE
		list.forEach(new ProductConsumer());

		// METHOD REFERENCE ESTÁTICO
		list.forEach(Product::staticProductConsumer);

		// METHOD REFERENCE NÃO ESTÁTICO
		list.forEach(Product::nonStaticProductPredicate);

		// EXPRESSÃO LAMBDA DECLARADA
		Consumer<Product> consumer = p -> {
			p.setPrice(p.getPrice() * 1.1);
		};
		
		list.forEach(consumer);
		
		// EXPRESSÃO LAMBDA INLINE
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

		list.forEach(System.out::println);
	}
}
