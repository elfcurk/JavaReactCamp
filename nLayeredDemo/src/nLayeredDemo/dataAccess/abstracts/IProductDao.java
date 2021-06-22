package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface IProductDao {
	void add(Product product);

	void delete(Product product);

	void update(Product product);

	// bir tane id verilecek(get ile) ve bu veritabanýndan bir ürün(Product'tan)
	// bulup getirilecek
	
	Product get(int id);
	List<Product> getAll();
	

}
