package interfaceDemo2;

//bizim �al��an�m�z
public class Worker implements IWorkable, IEatable, IPayable {

	@Override
	public void work() {
		System.out.println("bizim �al��an�m�z�n �al��mas�");

	}

	@Override
	public void eat() {

		System.out.println("bizim �al��an�m�z�n yeme-i�mesi");
	}

	@Override
	public void pay() {
		System.out.println("bizim �al��an�m�z�n maa� �demesi");

	}
}
