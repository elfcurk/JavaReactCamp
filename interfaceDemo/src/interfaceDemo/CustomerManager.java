package interfaceDemo;

public class CustomerManager {

	// CustomerManager'in customerDal'� var ve biz onun add'ini �a��r�caz demek.

	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {

		// i� kodlar� yaz�l�r

		customerDal.add();
	}
}
