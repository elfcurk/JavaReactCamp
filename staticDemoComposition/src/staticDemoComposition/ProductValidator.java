package staticDemoComposition;

//product validator: bir �r�n� kaydederken-g�ncellerken, �r�n�n kurallara uygun olup olmad���n� bulmak i�in kullan�l�r
public class ProductValidator {

	static {
		System.out.println("yap�c� blok �al��t�-2");
	}

	public ProductValidator() {
		System.out.println("yap�c� blok �al�t�");
	}

	public static boolean isValid(Product product) { // isEmpty=de�er girilmedi anlam�nda
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;

		}

	}

	public void biSey() {

	}


}
