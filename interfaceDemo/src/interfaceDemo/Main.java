package interfaceDemo;

//interfaceler de abstractlar gibi newlenemezler
public class Main {

	public static void main(String[] args) {
//	
//		ICustomerDal customerDal= new MysSqlCustomerDal();
//		customerDal.add();
//		
//		ICustomerDal customerDal2=new OracleCustomerDal();
//		customerDal2.add();

		CustomerManager customerManager = new CustomerManager(new MysSqlCustomerDal());

		customerManager.add();
	}

}
