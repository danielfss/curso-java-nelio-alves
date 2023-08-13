package br.com.danielfss.lambdas.entities;

import java.util.Objects;

public class Product {

	private String name;
	private Double price;

	public Product() {

	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}

	public boolean nonStaticProductPredicate() {
		return this.price >= 100.0;
	}

	public static void staticProductConsumer(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	public void nonStaticProductConsumer() {
//		this.price = this.price * 1.1;
		setPrice(getPrice() * 1.1);
	}

	public static String staticProductFunction(Product p) {
		return p.getName().toUpperCase();
	}

	public String nonStaticProductFunction() {
		return this.name.toUpperCase();
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

//	@Override
//	public String toString() {
//		return "Product [name = " + name + ", price = " + price + "]";
//	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

}
