package srcSecao20ConsumerApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import srcSecao20ConsumerEntities.Product;
import srcSecao20ConsumerUtil.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<>();

		products.add(new Product("Headset Anker SoundCore Q30", 450.00));
		products.add(new Product("Notebook Samsung Expert X51", 2499.99));
		products.add(new Product("Smartphone Samsung S23 Fe", 2199.00));
		products.add(new Product("Amazon FireStick 4K", 599.00));
		
//		interfaceConsumer(products);
//		referencedMethodStatic(products);
//		referencedMethodNonStatic(products);
//		lambdaExpression(products);
		lambdaExpressionInline(products);
	}

	// InterfaceConsumer
	public static void interfaceConsumer(List<Product> products) {
		products.forEach(new PriceUpdate());
		products.forEach(System.out::println);
	}

	// Referenced Method (with static method)
	public static void referencedMethodStatic(List<Product> products) {
		products.forEach(Product::staticProductUpdate);
		products.forEach(System.out::println);
	}

	public static void referencedMethodNonStatic(List<Product> products) {
		products.forEach(Product::nonStaticProductUpdate);
		products.forEach(System.out::println);
	}
	
	public static void lambdaExpression(List<Product> products) {
		Consumer <Product> updatedProducts = prod -> prod.setPrice(prod.getPrice() * 1.4);
		products.forEach(updatedProducts);
		products.forEach(System.out::println);
	}
	
	public static void lambdaExpressionInline(List<Product> products) {
		
		products.forEach(prod -> prod.setPrice(prod.getPrice() * 1.5));
		products.forEach(System.out::println)
		;
	}
	
}
