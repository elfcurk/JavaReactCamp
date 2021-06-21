package Main;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		// BaseCustomerManager customerManager = new NeroCustomerManager();

		// customerManager.save(new Customer(1, "Elif", "Curuk", 1993, "123456478999"));

		Customer customer = new Customer(1, "Elif", "Çürük", 1993, "12345678999");

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.save(customer);

	}

}
