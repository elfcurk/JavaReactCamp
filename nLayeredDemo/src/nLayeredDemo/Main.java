package nLayeredDemo;

import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		// ToDo: Spring IoC ile çözülecek

		IProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(1, 5, "kiraz", 12, 50);

		productService.add(product);

	}

}
