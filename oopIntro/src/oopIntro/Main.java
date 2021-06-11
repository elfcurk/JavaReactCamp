package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V14", 15000, "16 gb ram", 10); // Örnek oluþturma, referans oluþturma
																					// (intance)
		Product product2 = new Product(2, "toshiba", 16000, "32 gb ram", 10); // Örnek oluþturma, referans oluþturma
																				// (intance)
		Product product3 = new Product(); // Örnek oluþturma, referans oluþturma (intance)

		product3.setId(3);
		product3.setName("lenovo");
		product3.setDetail("16 gb ram");
		product3.setDiscount(10);
		product3.setUnitPrice(16000);
		System.out.println(product3.getUnitPriceAfterDiscount());

		Category category1 = new Category();
		category1.setId(1);
		category1.setName("içecek");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("yiyecek");

		System.out.println(category1.getName());
		System.out.println(category2.getName());

	}

}
