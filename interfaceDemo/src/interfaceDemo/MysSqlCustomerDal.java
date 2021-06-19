package interfaceDemo;
//interfaceler de abstractlar gibi newlenemezler
public class MysSqlCustomerDal extends Deneme implements ICustomerDal,IRepository {

	@Override
	public void add() {

		System.out.println("mysql eklendi");
	}

}
