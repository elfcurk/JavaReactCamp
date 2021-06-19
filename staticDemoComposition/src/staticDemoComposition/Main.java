package staticDemoComposition;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product1 = new Product();
		product1.price = 20;
		product1.name = "kalem";
		productManager.add(product1);

		DatabaseHelper.Crud.delete();
		DatabaseHelper.Crud.update();
		DatabaseHelper.Connection.createConnection();
	}

}
