package inheritance2;

//override ediyorum,yani üzerine yazýyorum-eziyorum
//kendi database kodumu yazabilmek için, base deki log u eziyorum, kendi kodumu yazýyorum
public class DatabaseLogger extends Logger {
	@Override
	public void log() {
		System.out.println("database loglandý");
	}
}
