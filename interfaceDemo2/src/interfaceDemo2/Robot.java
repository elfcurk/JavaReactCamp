package interfaceDemo2;

//robot çalýþanlar
public class Robot implements IWorkable,IConnect {

	@Override
	public void work() {
		System.out.println("robotun çalýþmasý");

	}

	@Override
	public void connect() {
		System.out.println("robotun baðlantý kurmasý vs vs ");
	}

}
