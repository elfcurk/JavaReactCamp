package interfaces;
//implemente etmek: Logger'�n DatabaseLogger'a uyarlanmas�d�r,gerekli olan kodlar�n yaz�lmas�d�r.

public class DatabaseLogger implements Logger {
	// override: implemente edilen yap�, override olarak kabul edilir.
	@Override
	public void log(String message) {
		System.out.println("database logland�: " + message);

	}

}
