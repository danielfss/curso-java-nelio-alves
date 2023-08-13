package br.com.danielfss.lambdas.consumer;

import java.util.function.Consumer;

import br.com.danielfss.lambdas.entities.Product;

public class ProductConsumer implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
