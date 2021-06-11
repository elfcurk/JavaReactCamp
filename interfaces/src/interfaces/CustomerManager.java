package interfaces;

public class CustomerManager {
	// private Logger logger;
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		// super();
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("müþteri eklendi: " + customer.getFirstName());
		// this.logger.log(customer.getFirstName());
		// Utils utils=new Utils(); //Utils sýnýfýnda void in önüne static eklediðimizde
		// new lemek zorunda kalmayýz
		Utils.runLoggers(loggers, customer.getFirstName());

	}

	public void delete(Customer customer) {
		System.out.println("müþteri silindi: " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());

	}

}
