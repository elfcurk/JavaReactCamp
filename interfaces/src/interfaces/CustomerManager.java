package interfaces;

public class CustomerManager {
	// private Logger logger;
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		// super();
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("m��teri eklendi: " + customer.getFirstName());
		// this.logger.log(customer.getFirstName());
		// Utils utils=new Utils(); //Utils s�n�f�nda void in �n�ne static ekledi�imizde
		// new lemek zorunda kalmay�z
		Utils.runLoggers(loggers, customer.getFirstName());

	}

	public void delete(Customer customer) {
		System.out.println("m��teri silindi: " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());

	}

}
