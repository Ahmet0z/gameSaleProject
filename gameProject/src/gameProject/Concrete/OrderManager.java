package gameProject.Concrete;

import gameProject.Abstract.OrderService;
import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Player;

public class OrderManager implements OrderService {

	@Override
	public void sell(Game game, Player player) {
		System.out.println(game.getGameName() + " adl� oyun " + 
				player.getFirstName() + " adl� kullan�c�ya " + 
				game.getPrice() + " fiyat�yla sat�ld�.");
		
	}

	@Override
	public void sell(Game game, Player player, Campaign campaign) {
		System.out.println(game.getGameName() + " adl� oyun " + 
				campaign.getCampaignName() + " kampanyas�yla "+ 
				player.getFirstName() +" adl� kullan�c�ya " +
				game.getPriceAfterDiscount() + " fiyat�yla sat�ld�.");
		
	}

}
