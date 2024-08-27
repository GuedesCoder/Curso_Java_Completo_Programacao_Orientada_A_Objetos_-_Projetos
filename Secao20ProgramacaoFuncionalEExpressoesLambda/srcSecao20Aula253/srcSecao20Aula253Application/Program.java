package srcSecao20Aula253Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import srcSecao20Aula253Entities.Product;

public class Program {

	public static int compareProducts(Product product1, Product product2) {
		return product1.getPrice().compareTo(product2.getPrice());
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> products = new ArrayList<>();

		products.add(new Product("Console PS5 com leitor", 3539.99));
		products.add(new Product("Controle PS5 Dual Sense", 359.99));
		products.add(new Product("Jogo The Last Of Us Part II Remastered", 339.99));

//3)
//		Comparator<Product> comparator3 = (product1, product2) -> product1.getName().toUpperCase()
//				.compareTo(product2.getName().toUpperCase());
//
//2)
//		Comparator<Product> comparator2 = (product1, product2) -> {
//			return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
//		};
//1)	
//		Comparator<Product> comparator1 = new Comparator<Product>() {
//			
//			@Override
//			public int compare(Product product1, Product product2) {
//				return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
//			}
//		};

//		products.sort(
//				(product1, product2) -> product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase()));
		// products.sort(new MyComparator());
		products.sort(Program::compareProducts);
		products.forEach(System.out::println);
	}
}
