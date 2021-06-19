package staticDemoComposition;

//product validator: bir ürünü kaydederken-güncellerken, ürünün kurallara uygun olup olmadýðýný bulmak için kullanýlýr
public class ProductValidator {

	static {
		System.out.println("yapýcý blok çalýþtý-2");
	}

	public ProductValidator() {
		System.out.println("yapýcý blok çalþtý");
	}

	public static boolean isValid(Product product) { // isEmpty=deðer girilmedi anlamýnda
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;

		}

	}

	public void biSey() {

	}


}
