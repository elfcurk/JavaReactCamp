package inheritance2;

//override ediyorum,yani �zerine yaz�yorum-eziyorum
//kendi email kodumu yazabilmek i�in, base deki log u eziyorum, kendi kodumu yaz�yorum

public class EmailLogger extends Logger {
	@Override
	public void log() {
		System.out.println("email logland�");

	}
}
