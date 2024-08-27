package srcSecao20FunctionUtil;

import java.util.function.Function;

import srcSecao20FunctionEntities.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product product) {
		return product.getName().toUpperCase();
	}

}
