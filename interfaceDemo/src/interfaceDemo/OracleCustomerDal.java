package interfaceDemo;
//interfaceler de abstractlar gibi newlenemezler
public class OracleCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("oracle eklendi");
		
	}

}
