package CoffeeShop.adapters;

import CoffeeShop.entities.concrete.Customer;

public interface ICustomerCheckServices {
	boolean checkIfRealPerson(Customer customer);

}
