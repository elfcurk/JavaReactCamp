package interfaceDemo2;

//bizim çalışanımız
public class Worker implements IWorkable, IEatable, IPayable {

	@Override
	public void work() {
		System.out.println("bizim çalışanımızın çalışması");

	}

	@Override
	public void eat() {

		System.out.println("bizim çalışanımızın yeme-içmesi");
	}

	@Override
	public void pay() {
		System.out.println("bizim çalışanımızın maaş ödemesi");

	}
}
