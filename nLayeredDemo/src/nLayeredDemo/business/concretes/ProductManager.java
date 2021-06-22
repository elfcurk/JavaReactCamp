package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.core.ILoggerService;
import nLayeredDemo.dataAccess.abstracts.IProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements IProductService {

	private IProductDao productDao;
	private ILoggerService loggerService;

	public ProductManager(IProductDao productDao, ILoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// �� kodlar� yaz�l�r
		if (product.getCategoryId() == 1) {
			System.out.println("bu kategoride �r�n kabul edilmiyor");
			return;

		}
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi: " + product.getName());

	}

	@Override
	public List<Product> getAll() {

		return null;
	}

}
