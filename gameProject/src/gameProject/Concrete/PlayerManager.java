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
			System.out.println(player.getFirstName() + " adl� oyuncu eklendi.");
		}else {
			System.out.println("Ge�ersiz bilgi girdiniz.");
		}
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()  + " adl� oyuncu silindi.");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName()  + " adl� oyuncu g�ncellendi.");
		
	}

}
