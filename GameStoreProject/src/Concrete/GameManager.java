package Concrete;

import Abstracts.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println("yeni oyun eklendi");
		System.out.println("oyun ismi: " + game.getName());
		System.out.println("oyunun fiyat�: " + game.getUnitPrice());
		System.out.println("oyun detaylar�: " + game.getDetail());
		System.out.println("oyun : " + game.getUnitPriceAfterDiscount());

	}

	@Override
	public void delete(Game game) {
		System.out.println("oyun silindi");
		System.out.println("oyun ismi: " + game.getName());
		System.out.println("oyunun fiyat�: " + game.getUnitPrice());
		System.out.println("oyun detaylar�: " + game.getDetail());
		System.out.println("oyun : " + game.getUnitPriceAfterDiscount());

	}

	@Override
	public void update(Game game) {
		System.out.println("oyun g�ncellendi");
		System.out.println("oyun ismi: " + game.getName());
		System.out.println("oyunun fiyat�: " + game.getUnitPrice());
		System.out.println("oyun detaylar�: " + game.getDetail());
		System.out.println("oyun : " + game.getUnitPriceAfterDiscount());

	}

}
