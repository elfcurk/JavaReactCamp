package interfaces;

//implemente etmek: Logger'�n SmsLogger'a uyarlanmas�d�r,gerekli olan kodlar�n yaz�lmas�d�r.
public class SmsLogger implements Logger {
//override: implemente edilen yap�, override olarak kabul edilir.
	@Override
	public void log(String message) {
		System.out.println("sms g�nderildi/logland�: " + message);

	}

}
