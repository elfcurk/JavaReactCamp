package inheritance2;

//override ediyorum,yani üzerine yazýyorum-eziyorum
//kendi email kodumu yazabilmek için, base deki log u eziyorum, kendi kodumu yazýyorum

public class EmailLogger extends Logger {
	@Override
	public void log() {
		System.out.println("email loglandý");

	}
}
