package srcSecao20ConsumerEntities;

import srcSecao20ConsumerEntities.Product;

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

	public static void staticProductUpdate(Product product) {
		product.setPrice(product.getPrice() * 1.2);
	}
	
	public void nonStaticProductUpdate() {
		setPrice(price * 1.3);
	}
	
	@Override
	public String toString() {
		return "Product name: " + name + ", price: R$ " + String.format("%.2f", price);
	}
	
}
