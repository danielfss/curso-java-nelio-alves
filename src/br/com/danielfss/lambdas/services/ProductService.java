package br.com.danielfss.lambdas.services;

import java.util.List;
import java.util.function.Predicate;

import br.com.danielfss.lambdas.entities.Product;

public class ProductService {

	// FUNÇÃO QUE RETORNARÁ A SOMA DE TODOS OS PRODUTOS QUE COMEÇAM COM A LETRA 'T'
	public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for (Product product : list) {
			if(product.getName().charAt(0) == 'T') {
				sum += product.getPrice();
			}
		}
		return sum;
	}
	
	// FUNÇÃO QUE RETORNARÁ A SOMA DE TODOS OS PRODUTOS QUE COMEÇAM COM A LETRA INFORMADA NO MAIN (A FUNÇÃO TEST() TESTA QUALQUER CONDIÇÃO INFORMADA)
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product product : list) {
			if(criteria.test(product)) {
				sum += product.getPrice();
			}
		}
		return sum;
	}
}
