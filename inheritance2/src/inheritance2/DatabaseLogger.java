package inheritance2;

//override ediyorum,yani �zerine yaz�yorum-eziyorum
//kendi database kodumu yazabilmek i�in, base deki log u eziyorum, kendi kodumu yaz�yorum
public class DatabaseLogger extends Logger {
	@Override
	public void log() {
		System.out.println("database logland�");
	}
}
