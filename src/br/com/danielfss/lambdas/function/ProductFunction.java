package br.com.danielfss.lambdas.function;

import java.util.function.Function;

import br.com.danielfss.lambdas.entities.Product;

public class ProductFunction implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
