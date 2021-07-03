package Concrete;

import Abstracts.ISalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements ISalesService {

	@Override
	public void addToChart(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("yeni satis yapildi: ");
		System.out.println("satis ayrýntilari: ");
		System.out.println("alici: " + gamer.getFirstName() + " " + gamer.getLastName());
		System.out.println("oyun ismi: " + game.getName());
		System.out.println("oyun fiyati: " + game.getUnitPrice());
		System.out.println("oyunun kampanyadan sonraki indirimi: " + game.getDiscountAfterCampaign());
		System.out.println("oyunun indirimden sonraki fiyati: " + game.getUnitPriceAfterDiscount());

	}

}
