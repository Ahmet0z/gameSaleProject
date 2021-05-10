package gameProject.Concrete;

import gameProject.Abstract.PlayerCheckService;
import gameProject.Abstract.PlayerService;
import gameProject.Entities.Player;

public class PlayerManager implements PlayerService{
	
	private PlayerCheckService checkService;

	public PlayerManager(PlayerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void add(Player player) {
		if (checkService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName() + " adlý oyuncu eklendi.");
		}else {
			System.out.println("Geçersiz bilgi girdiniz.");
		}
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()  + " adlý oyuncu silindi.");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName()  + " adlý oyuncu güncellendi.");
		
	}

}
