package inheritance2;

public class CustomerManager {
	public void add(Logger logger) { //bana loggerýnýn ne olduðunu söyle
		// müþteri ekleme kodlarý,
		System.out.println("müþteri eklendi");
		
		// bir kodun içerisinde baþka bir iþ yapan(somut) sýnýf asla new'lenmez - alt satýrdaki gibi
		// DatabaseLogger logger = new DatabaseLogger();
		
		logger.log(); // loglamayý çaðýrdým
	}
}
