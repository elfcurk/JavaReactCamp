package Concrete;

import Abstracts.IGamerCheckService;
import Abstracts.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService {
	IGamerCheckService gamerCheckService;

	public GamerManager(IGamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName().toUpperCase() + " kiis dogrulandi, kayit basarili");
		} else {
			System.out.println("kisi dogrulanamadi, bilgilerinizi konntrol edin!");
		}

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName().toUpperCase() + " kisisinin bilgileri silindi");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " kisisinin bilgileri güncellendi");

	}

}
