package Concretes;

import Abstract.BaseCustomerManager;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (customerCheckService.checkIfRealPerson(customer)) {
			//System.out.println("Saved to valid person");
			super.save(customer);
		} else {
			System.out.println("Not a valid person");
		}

	}

}
