package srcSecao20FunctionApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import srcSecao20FunctionEntities.Product;
import srcSecao20FunctionUtil.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Console Playstation 5", 3899.99));
		products.add(new Product("Controle Dual Sense Black", 499.99));
		products.add(new Product("Jogo The Last Of Us II Remastered", 349.99));
		products.add(new Product("Headset Sony Blackhole Sun", 799.00));
		
//		interfaceFunction(products);
//		usingStaticMethod(products);
//		usingNonStaticMethod(products);
//		usingDeclaratedLambda(products);
		usingInLineLambda(products);
		
	}
	
	public static void interfaceFunction(List<Product> products) {
		List<String> names = products.stream().map(new UpperCaseName()).collect(Collectors.toList());
	}

	public static void usingStaticMethod(List<Product> products) {
		List<String> names = products.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());	
	}
	
	public static void usingNonStaticMethod(List<Product> products) {
		List<String> names = products.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
	}
	
	public static void usingDeclaratedLambda(List<Product> products) {
		Function<Product, String> function = func -> func.getName().toUpperCase(); 
		List<String> names = products.stream().map(function).collect(Collectors.toList());
		names.forEach(System.out::println);
	}
	
	public static void usingInLineLambda(List<Product> products) {
		List<String> names = products.stream().map(func -> func.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
	}
}
