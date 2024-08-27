package srcSecao20PredicateEntities;

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

	public static boolean staticProductPredicate(Product product) {
		return product.getPrice() < 2000.00 || product.getPrice() > 2300.00;
	}
	
	public boolean nonStaticProductPredicate() {
		return price > 1000.00;
	}
	
	@Override
	public String toString() {
		return "Product name: " + name + ", price: R$ " + String.format("%.2f", price);
	}
	
}
