package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "en �ok tutan pc", 2500, 5); // yap�c� blok u �al��t�r�yor (public
																				// product)
//		Product product=new Product();
//		product.setId(1);
//		product.setName("Laptop");
//		product.setDescription("en �ok tutulan pc");
//		product.setPrice(25000);
//		product.setStockAmmount(5);

		// System.out.println(product.name + " " + product.description + " " +
		// product.price + "tl " + product.stockAmmount+" adet kalm��t�r");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Delete(product);

		System.out.println(product.getKod());

	}

}
