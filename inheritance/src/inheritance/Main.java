package inheritance;

public class Main {

	public static void main(String[] args) {
//		IndividualCustomer elif = new IndividualCustomer();
//		elif.customerNumber = "12345";

		IndividualCustomer customer1 = new IndividualCustomer();
		customer1.id = 1;
		customer1.customerNumber = "987654";
		customer1.firstName = "elif";
		customer1.lastName = "crk";
		customer1.nationalIdentity = "12345678911"; // kimlik no string

		CorporateCustomer corporate1 = new CorporateCustomer();
		corporate1.id = 1;
		corporate1.customerNumber = "6789";

		SendikaCustomer sendikali = new SendikaCustomer();
		sendikali.id = 1;
		sendikali.customerNumber = "789";

		CustomerManager customerManager = new CustomerManager();
		// customerManager.add(corporate1);
		// customerManager.add(customer1);
		// customerManager.add(sendikali);

		Customer[] customers = new Customer[] { customer1, corporate1, sendikali };
		customerManager.addMultiple(customers);

	}
}
