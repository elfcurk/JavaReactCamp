package inheritance2;

//override ediyorum,yani üzerine yazýyorum-eziyorum
//kendi dosya(file) kodumu yazabilmek için, base deki log u eziyorum, kendi kodumu yazýyorum

public class FileLogger extends Logger {
	@Override
	public void log() {
		System.out.println("email yollandý-loglandý");
		
	}
}
