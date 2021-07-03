package Program;

import java.text.ParseException;

import Adapter.Edevlet_MernisService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws ParseException {

		// gamer islemleri

		Gamer gamer = new Gamer(1, "elif", "çürük", 1993, "12345678912", "elif12345");
		GamerManager gamerManager = new GamerManager(new Edevlet_MernisService());
		gamerManager.add(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);

		// campaign islemleri

		Campaign campaign = new Campaign(1, "bahar kampanyasi", "kaçýrýlmayacak firsatlar", 50);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);

		// game iþlemleri
		Game game = new Game(1, "gta V", "en yeni surum", 162, 50, 81);

		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);

		// sales islemleri
		SalesManager salesManager = new SalesManager();
		salesManager.addToChart(game, gamer, campaign);

	}

}
