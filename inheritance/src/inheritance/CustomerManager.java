package inheritance;

public class CustomerManager {
	// bir �ey d�nd�rmek istemedi�im i�in void yaz�yorum,
	// void sadece istenilen i�lemi yap�p b�rak�r,geriye bir �ey d�nd�rmez

	public void add(Customer customer) {
		System.out.println("m��teri id no: " + customer.id + " ve " + "m��teri no: " + customer.customerNumber);

	}

	/*
	 * public void add(IndividualCustomer customer) {
	 * System.out.println(customer.customerNumber + " kaydedildi");
	 * 
	 * } public void add(CorporateCustomer customer) {
	 * System.out.println(customer.customerNumber + " kaydedildi"); }
	 */

	// bulk insert
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);

		}
	}
}
//SOLID - OPEN CLOSED PRINCIPLE