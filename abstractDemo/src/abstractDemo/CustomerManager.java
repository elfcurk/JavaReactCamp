package abstractDemo;

public class CustomerManager {
	
	BaseDbManager databaseManager; //bu base sınıf, bizim stratejimiz görevini görüyor
							     //hangi veritabanını sisteme verirsem, onun getData() sı çalışır.			
	public void getCustomers() {
		databaseManager.getData();
	}
}
