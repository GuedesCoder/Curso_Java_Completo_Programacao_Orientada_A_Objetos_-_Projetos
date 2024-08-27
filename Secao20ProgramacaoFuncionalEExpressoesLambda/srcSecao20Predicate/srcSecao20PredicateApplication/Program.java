package srcSecao20PredicateApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import srcSecao20PredicateEntities.Product;
import srcSecao20PredicateUtil.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<>();

		products.add(new Product("Headset Anker SoundCore Q30", 450.00));
		products.add(new Product("Notebook Samsung Expert X51", 2499.99));
		products.add(new Product("Smartphone Samsung S23 Fe", 2199.00));
		products.add(new Product("Amazon FireStick 4K", 599.00));
		
//		interfacePredicate(products);
//		referencedMethodStatic(products);
//		referencedMethodNonStatic(products);
//		lambdaExpression(products);
		lambdaExpressionInline(products);
		
		
	}

	// InterfacePredicate
	public static void interfacePredicate(List<Product> products) {
		products.removeIf(new ProductPredicate());

		for (Product product : products) {
			System.out.println(product);
		}
	}

	// Referenced Method (with static method)
	public static void referencedMethodStatic(List<Product> products) {
		products.removeIf(Product::staticProductPredicate);

		for (Product product : products) {
			System.out.println(product);
		}
	}

	public static void referencedMethodNonStatic(List<Product> products) {
		products.removeIf(Product::nonStaticProductPredicate);

		for (Product product : products) {
			System.out.println(product);
		}
	}
	
	public static void lambdaExpression(List<Product> products) {
		Predicate <Product> removedProducts = prod -> prod.getPrice() > 500.00;
		
		products.removeIf(removedProducts);
		
		for (Product product : products) {
			System.out.println(product);
		}
	}
	
	public static void lambdaExpressionInline(List<Product> products) {
		
		products.removeIf(xpto -> xpto.getPrice() > 2200.00 || xpto.getPrice() < 2000.00);
		
		for (Product product : products) {
			System.out.println(product);
		}
	}
	
}
