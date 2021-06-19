package staticDemoComposition;

//bu tip manager sýnýflarý asla static yapýlmamalýdýr; 
//çünkü ilk çaðýran kullanýcý nesneyi oluþturuyor,ondan sonra bütün kullanýcýlar ayný nesneyi kullanýyor

public class ProductManager {
	public void add(Product product) {
		// ProductValidator validator = new ProductValidator();
		if (ProductValidator.isValid(product)) {
			System.out.println("ürün " + product.name + " eklendi");
		} else {
			System.out.println("ürün bilgileri geçersizdir");
		}

//		ProductValidator validator = new ProductValidator();
//		validator.biSey();
	}
}
