package inheritance;

public class CustomerManager {
	// bir þey döndürmek istemediðim için void yazýyorum,
	// void sadece istenilen iþlemi yapýp býrakýr,geriye bir þey döndürmez

	public void add(Customer customer) {
		System.out.println("müþteri id no: " + customer.id + " ve " + "müþteri no: " + customer.customerNumber);

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