package inheritance2;

//override ediyorum,yani �zerine yaz�yorum-eziyorum
//kendi sms kodumu yazabilmek i�in, base deki log u eziyorum, kendi kodumu yaz�yorum
public class SmsLogger extends Logger {
	@Override
	public void log() {
		System.out.println("sms yolland�-logland�");
	}
}
