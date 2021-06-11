package interfaces;
//implemente etmek: Logger'ýn DatabaseLogger'a uyarlanmasýdýr,gerekli olan kodlarýn yazýlmasýdýr.

public class DatabaseLogger implements Logger {
	// override: implemente edilen yapý, override olarak kabul edilir.
	@Override
	public void log(String message) {
		System.out.println("database loglandý: " + message);

	}

}
