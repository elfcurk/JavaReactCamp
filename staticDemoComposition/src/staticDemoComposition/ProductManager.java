package staticDemoComposition;

//bu tip manager s�n�flar� asla static yap�lmamal�d�r; 
//��nk� ilk �a��ran kullan�c� nesneyi olu�turuyor,ondan sonra b�t�n kullan�c�lar ayn� nesneyi kullan�yor

public class ProductManager {
	public void add(Product product) {
		// ProductValidator validator = new ProductValidator();
		if (ProductValidator.isValid(product)) {
			System.out.println("�r�n " + product.name + " eklendi");
		} else {
			System.out.println("�r�n bilgileri ge�ersizdir");
		}

//		ProductValidator validator = new ProductValidator();
//		validator.biSey();
	}
}
