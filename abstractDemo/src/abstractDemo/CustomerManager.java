package abstractDemo;

public class CustomerManager {
	
	BaseDbManager databaseManager; //bu base s�n�f, bizim stratejimiz g�revini g�r�yor
							     //hangi veritaban�n� sisteme verirsem, onun getData() s� �al���r.			
	public void getCustomers() {
		databaseManager.getData();
	}
}
