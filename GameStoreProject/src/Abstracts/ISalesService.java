package Abstracts;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface ISalesService {

	void addToChart(Game game, Gamer gamer, Campaign campaign);
			
}
