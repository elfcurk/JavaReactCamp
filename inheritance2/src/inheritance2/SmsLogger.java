package inheritance2;

//override ediyorum,yani üzerine yazýyorum-eziyorum
//kendi sms kodumu yazabilmek için, base deki log u eziyorum, kendi kodumu yazýyorum
public class SmsLogger extends Logger {
	@Override
	public void log() {
		System.out.println("sms yollandý-loglandý");
	}
}
