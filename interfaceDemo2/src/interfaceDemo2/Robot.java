package interfaceDemo2;

//robot �al��anlar
public class Robot implements IWorkable,IConnect {

	@Override
	public void work() {
		System.out.println("robotun �al��mas�");

	}

	@Override
	public void connect() {
		System.out.println("robotun ba�lant� kurmas� vs vs ");
	}

}
