package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// JDBS
		System.out.println("�r�n eklendi " + product.getName());

	}

	public void Delete(Product product) {
		System.out.println("�r�n silindi " + product.getName());

	}
	
	public void Add2(int id,String name,String description,int stockAmount, double price) {
		System.out.println("�r�n eklendi");
	}

}
