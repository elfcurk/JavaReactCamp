package classesWithAttributes;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmmount) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmmount = stockAmmount;

	}

	public Product() {

	}

	// ürüne ait bilgileri-özellikleri tutmuþ olduk (iþlem yaptýrmýyoruz sadece ürün
	// verilerini tutuyoruz)

	// attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmmount; // stok miktarý
	String kod;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmmount() {
		return stockAmmount;
	}

	public void setStockAmmount(int stockAmmount) {
		this.stockAmmount = stockAmmount;
	}
	// ürünüðn kodu= isminin baþ harfi + id si

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

}
