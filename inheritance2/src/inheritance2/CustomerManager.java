package inheritance2;

public class CustomerManager {
	public void add(Logger logger) { //bana logger�n�n ne oldu�unu s�yle
		// m��teri ekleme kodlar�,
		System.out.println("m��teri eklendi");
		
		// bir kodun i�erisinde ba�ka bir i� yapan(somut) s�n�f asla new'lenmez - alt sat�rdaki gibi
		// DatabaseLogger logger = new DatabaseLogger();
		
		logger.log(); // loglamay� �a��rd�m
	}
}
