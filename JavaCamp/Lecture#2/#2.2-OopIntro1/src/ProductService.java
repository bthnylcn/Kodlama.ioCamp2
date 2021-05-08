
public class ProductService {
	
	public void addToCart(Product product) {
		System.out.println("-- (" + product.name + ") sepete eklenmiþtir. --");
	}
	
	public void addToCart(Product[] products) {
		for (Product product : products) {
			this.addToCart(product);
		}
	}
}
