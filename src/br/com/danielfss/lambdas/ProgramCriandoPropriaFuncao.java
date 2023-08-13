package br.com.danielfss.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.danielfss.lambdas.entities.Product;
import br.com.danielfss.lambdas.services.ProductService;

public class ProgramCriandoPropriaFuncao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.00));

		ProductService ps = new ProductService();
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

		System.out.println("Sum = " + String.format("%.2f", sum));
	}
}
