package interfaces;

//implemente etmek: Logger'ýn SmsLogger'a uyarlanmasýdýr,gerekli olan kodlarýn yazýlmasýdýr.
public class SmsLogger implements Logger {
//override: implemente edilen yapý, override olarak kabul edilir.
	@Override
	public void log(String message) {
		System.out.println("sms gönderildi/loglandý: " + message);

	}

}
