package srcSecao20FunctionEntities;

public class Product {
	private String name;
	private Double price;
	
	public Product() {
	}
	
	public Product(String name, Double price) {
		super();
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
	
	public static  String staticUpperCaseName(Product product) {
		return product.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return getName().toUpperCase();
	}

	@Override
	public String toString() {
		return "Product [name: " + name + ", price: R$ " + String.format("%.2f", price) + "]";
	}
	
	
	

}
