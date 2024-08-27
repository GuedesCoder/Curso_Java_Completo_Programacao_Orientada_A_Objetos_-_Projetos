package srcSecao20PredicateUtil;

import java.util.function.Predicate;

import srcSecao20PredicateEntities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product product) {
		return product.getPrice() <= 800.00;
	}

}
