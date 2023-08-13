package br.com.danielfss.lambdas.predicate;

import java.util.function.Predicate;

import br.com.danielfss.lambdas.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
