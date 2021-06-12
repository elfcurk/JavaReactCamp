package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "en çok tutan pc", 2500, 5); // yapýcý blok u çalýþtýrýyor (public
																				// product)
//		Product product=new Product();
//		product.setId(1);
//		product.setName("Laptop");
//		product.setDescription("en çok tutulan pc");
//		product.setPrice(25000);
//		product.setStockAmmount(5);

		// System.out.println(product.name + " " + product.description + " " +
		// product.price + "tl " + product.stockAmmount+" adet kalmýþtýr");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Delete(product);

		System.out.println(product.getKod());

	}

}
