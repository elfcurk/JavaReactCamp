package abstractClasses;

public class Main {

	public static void main(String[] args) {
		ManGameCalculator manGameCalculator=new ManGameCalculator();
		manGameCalculator.hesapla();
		manGameCalculator.gameOver();
		
		GameCalculator gameCalculator=new OlderGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
		
		WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		KidsGameCalculator kidsGameCalculator=new KidsGameCalculator();
		kidsGameCalculator.hesapla();
		kidsGameCalculator.gameOver();
	
	}

}
