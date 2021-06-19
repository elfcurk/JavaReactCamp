package interfaceDemo;

public class CustomerManager {

	// CustomerManager'in customerDal'ý var ve biz onun add'ini çaðýrýcaz demek.

	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {

		// iþ kodlarý yazýlýr

		customerDal.add();
	}
}
