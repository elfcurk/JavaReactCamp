package inheritance2;

//override ediyorum,yani �zerine yaz�yorum-eziyorum
//kendi dosya(file) kodumu yazabilmek i�in, base deki log u eziyorum, kendi kodumu yaz�yorum

public class FileLogger extends Logger {
	@Override
	public void log() {
		System.out.println("email yolland�-logland�");
		
	}
}
