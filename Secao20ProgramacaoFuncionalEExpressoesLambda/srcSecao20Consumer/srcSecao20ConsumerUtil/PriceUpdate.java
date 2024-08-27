package srcSecao20ConsumerUtil;

import java.util.function.Consumer;

import srcSecao20ConsumerEntities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product product) {
		product.setPrice(product.getPrice() * 1.1);
	}
}
