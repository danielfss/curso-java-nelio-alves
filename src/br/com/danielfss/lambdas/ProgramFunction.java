package br.com.danielfss.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import br.com.danielfss.lambdas.entities.Product;
import br.com.danielfss.lambdas.function.ProductFunction;

public class ProgramFunction {

	// AUMENTAR O PREÇO EM 10%
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.00));

		// IMPLEMENTAÇÃO DA INTERFACE
		List<String> names = list.stream().map(new ProductFunction()).collect(Collectors.toList());
		names.forEach(System.out::println);

		// METHOD REFERENCE ESTÁTICO
		List<String> names1 = list.stream().map(Product::staticProductFunction).collect(Collectors.toList());
		names1.forEach(System.out::println);

		// METHOD REFERENCE NÃO ESTÁTICO
		List<String> names2 = list.stream().map(Product::nonStaticProductFunction).collect(Collectors.toList());
		names2.forEach(System.out::println);

		// DECLARADA
		Function<Product, String> function = p -> p.getName().toUpperCase();
		List<String> names3 = list.stream().map(function).collect(Collectors.toList());
		names3.forEach(System.out::println);

		// INLINE
		List<String> names4 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names4.forEach(System.out::println);

	}
}
