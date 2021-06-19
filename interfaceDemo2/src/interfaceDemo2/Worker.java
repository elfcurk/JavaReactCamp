package interfaceDemo2;

//bizim çalýþanýmýz
public class Worker implements IWorkable, IEatable, IPayable {

	@Override
	public void work() {
		System.out.println("bizim çalýþanýmýzýn çalýþmasý");

	}

	@Override
	public void eat() {

		System.out.println("bizim çalýþanýmýzýn yeme-içmesi");
	}

	@Override
	public void pay() {
		System.out.println("bizim çalýþanýmýzýn maaþ ödemesi");

	}
}
